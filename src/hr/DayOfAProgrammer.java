/**
 * 
 */
package hr;

/**
 * @author vivek
 *
 */

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DayOfAProgrammer implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int y = in.nextInt();
		boolean leap = leapYear(y);
		int[] arr = { 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (y == 1918) {
			int days = 32;
			if (leapYear(y)) {
				days += 15;
			}
		} else if (y <= 1917) {
			// julian
		} else if (y > 1917 && y <= 2700) {
			// gregorian calendar
		}

	}

	private boolean leapYear(int y) {
		boolean result = false;
		if (y <= 1917) {
			if (y % 4 == 0) {
				result = true;
			}
		} else if (y >= 1919 && y <= 2700) {
			if (y % 400 == 0) {
				result = true;
			} else if (y % 4 == 0 && y % 100 != 0) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public void close() throws IOException {
		in.close();
		out.close();
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			reader.close();
		}
	}

	public static void main(String[] args) throws IOException {
		try (DayOfAProgrammer instance = new DayOfAProgrammer()) {
			instance.solve();
		}
	}
}
