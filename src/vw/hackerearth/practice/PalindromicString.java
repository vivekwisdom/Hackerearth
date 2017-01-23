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

public class PalindromicString implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		String str = in.next();
		out.println(isPalindrome(str) ? "YES" : "NO");
	}

	private boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (end > start) {
			if (str.charAt(end) != str.charAt(start)) {
				return false;
			}
			++start;
			--end;
		}
		return true;
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
		try (PalindromicString instance = new PalindromicString()) {
			instance.solve();
		}
	}
}
