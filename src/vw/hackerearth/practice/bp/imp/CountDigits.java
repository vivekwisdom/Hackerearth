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

public class CountDigits implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		char[] s = in.next().toCharArray();
		int[] arr = new int[10];
		for (int i = 0; i < s.length; i++) {
			arr[s[i] - 48] += 1;
		}

		for (int i = 0; i < arr.length; i++) {
			out.println(i + " " + arr[i]);
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
		try (CountDigits instance = new CountDigits()) {
			instance.solve();
		}
	}
}
