/**
 * 
 */
package vw.hackerearth.practice;

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

public class MagicalWord implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int testCases = in.nextInt();
		int[] primes = { 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113 };
		for (int i = 0; i < testCases; i++) {
			int length = in.nextInt();
			char[] str = in.next().toCharArray();
			for (int j = 0; j < length; j++) {
				int nearest = 0;
				for (int j2 = 1; j2 < primes.length; j2++) {
					if (Math.abs(primes[j2 - 1] - str[j]) <= Math.abs((primes[j2] - str[j]))) {
						nearest = primes[j2 - 1];
						break;
					} else if (Math.abs(primes[j2 - 1] - str[j]) > Math.abs((primes[j2] - str[j]))) {
						nearest = primes[j2];
					}
				}
				str[j] = (char) nearest;
				out.print(str[j] + "");
			}
			out.println();
		}
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
		try (MagicalWord instance = new MagicalWord()) {
			instance.solve();
		}
	}
}
