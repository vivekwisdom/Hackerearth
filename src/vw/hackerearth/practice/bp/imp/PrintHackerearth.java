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
import java.util.HashMap;
import java.util.StringTokenizer;

public class PrintHackerearth implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int n = in.nextInt();
		String s = in.next();
		HashMap<Character, Integer> arr = new HashMap<>();
		arr.put('h', 0);
		arr.put('a', 0);
		arr.put('c', 0);
		arr.put('k', 0);
		arr.put('e', 0);
		arr.put('r', 0);
		arr.put('t', 0);
		
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'h' || s.charAt(i) == 'a' || s.charAt(i) == 'c' || s.charAt(i) == 'k'
					|| s.charAt(i) == 'e' || s.charAt(i) == 'r' || s.charAt(i) == 't') {
				arr.replace(s.charAt(i), (arr.get(s.charAt(i)) + 1));
			}
		}
		int h = arr.get('h') / 2;
		int a = arr.get('a') / 2;
		int c = arr.get('c');
		int k = arr.get('k');
		int e = arr.get('e') / 2;
		int r = arr.get('r') / 2;
		int t = arr.get('t');
		int ans = 0;
		while (h > 0 && a > 0 && c > 0 && k > 0 && e > 0 && r > 0 && t > 0) {
			h--;
			a--;
			c--;
			k--;
			e--;
			r--;
			t--;
			ans++;

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
		try (PrintHackerearth instance = new PrintHackerearth()) {
			instance.solve();
		}
	}
}
