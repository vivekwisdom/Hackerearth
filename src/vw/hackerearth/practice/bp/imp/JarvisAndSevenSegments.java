/**
 * 
 */
package vw.hackerearth.practice.bp.imp;

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

public class JarvisAndSevenSegments implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int testCases = in.nextInt();
		int[] arr = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		for (int i = 0; i < testCases; i++) {
			int n = in.nextInt();
			int min = 9999999;
			String ans = "";
			for (int j = 0; j < n; j++) {
				String m = in.next();
				int count = 0;
				for (int k = 0; k < m.length(); k++) {
					count = count + (arr[m.charAt(k) - 48]);
				}
				if (count < min) {
					min = count;
					ans = m;
				}
			}
			out.println(ans);
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
		try (JarvisAndSevenSegments instance = new JarvisAndSevenSegments()) {
			instance.solve();
		}
	}
}
