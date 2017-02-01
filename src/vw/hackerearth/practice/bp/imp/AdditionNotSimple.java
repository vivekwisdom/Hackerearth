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
import java.util.ArrayList;
import java.util.StringTokenizer;

public class AdditionNotSimple implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int testCases = in.nextInt();
		ArrayList<Character> arr = new ArrayList<>();
		for (int i = 'a'; i <= 'z'; i++) {
			arr.add((char) i);
		}
		for (int i = 0; i < testCases; i++) {
			char[] str = in.next().toCharArray();
			char[] rstr = new char[str.length];
			for (int j = 0; j < str.length; j++) {
				rstr[j] = str[(str.length - 1) - j];
			}
			char[] output = new char[str.length];
			for (int j = 0; j < rstr.length; j++) {
				output[j] = arr.get((((arr.indexOf(str[j]) + 1) + (arr.indexOf(rstr[j]) + 1)) - 1) % 26);
			}
			for (int j = 0; j < output.length; j++) {
				out.print(output[j] + "");
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
		try (AdditionNotSimple instance = new AdditionNotSimple()) {
			instance.solve();
		}
	}
}
