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

public class PrintHackerearthON implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int n = in.nextInt();
		String s = in.next();
		int[] arr = new int[26];
		for (int i = 0; i < n; i++) {
			arr[s.charAt(i) - 'a']++;
		}

		int ans = Integer.MAX_VALUE;

		if (arr['h' - 'a'] / 2 < ans) {
			ans = arr['h' - 'a'] / 2;
		}
		if (arr['a' - 'a'] / 2 < ans) {
			ans = arr['a' - 'a'] / 2;
		}
		if (arr['c' - 'a'] < ans) {
			ans = arr['c' - 'a'];
		}
		if (arr['k' - 'a'] < ans) {
			ans = arr['k' - 'a'];
		}
		if (arr['e' - 'a'] / 2 < ans) {
			ans = arr['e' - 'a'] / 2;
		}
		if (arr['r' - 'a'] / 2 < ans) {
			ans = arr['r' - 'a'] / 2;
		}
		if (arr['t' - 'a'] < ans) {
			ans = arr['t' - 'a'];
		}

		out.println(ans);

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

		public ArrayList<Integer> nextIntArray(int n) {
			ArrayList<Integer> arr = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				arr.add(Integer.parseInt(next()));
			}
			return arr;
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
		try (PrintHackerearthON instance = new PrintHackerearthON()) {
			instance.solve();
		}
	}
}
