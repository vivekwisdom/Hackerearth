/**
 * 
 */
package vw.hackerearth.contests.jc17;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class GoodString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] str = in.next().toCharArray();
		int n = str.length;
		int[] arr = new int[26];
		for (int i = 0; i < n; i++) {
			arr[str[i] - 97] += 1;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				sum += (arr[i] - 1);
			}
		}
		System.out.println(sum);
	}
}
