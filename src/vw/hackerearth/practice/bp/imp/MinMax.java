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
import java.util.Collections;
import java.util.StringTokenizer;

public class MinMax implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int n = in.nextInt();
		ArrayList<Integer> arr = in.nextIntArray(n);
		Collections.sort(arr);
		int min = arr.get(0);
		int max = arr.get(arr.size() - 1);
		String result = "";
		for (int i = min; i <= max; i++) {
			if (arr.indexOf(Integer.valueOf(i)) == -1) {
				result = "NO";
				break;
			} else {
				result = "YES";
			}
		}
		out.println(result);
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
		try (MinMax instance = new MinMax()) {
			instance.solve();
		}
	}
}
