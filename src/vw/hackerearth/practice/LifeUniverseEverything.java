/**
 * 
 */
package vw.hackerearth.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author vivek.wisdom
 *
 */
public class LifeUniverseEverything {

	/**
	 * @param args
	 * @throws IOException
	 */
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int next;
		while ((next = getInt()) != 42) {
			System.out.println(next);
		}
	}

	private static int getInt() throws IOException {
		st = new StringTokenizer(br.readLine());
		return (Integer.parseInt(st.nextToken()));
	}

}
