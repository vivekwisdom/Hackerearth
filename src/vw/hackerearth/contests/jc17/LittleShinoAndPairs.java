/**
 * 
 */
package vw.hackerearth.contests.jc17;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class LittleShinoAndPairs {

	/**
	 * @param args
	 */
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = readInt();
		int arr[] = readStringToIntArray();
		int count = subArrayCompare(arr, N);
		System.out.println(count);
	}

	private static int subArrayCompare(int[] arr, int n) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			
		}
		return count;
	}

	private static int readInt() {
		return in.nextInt();
	}

	private static int[] readStringToIntArray() {
		String[] arr = in.nextLine().split(" ");
		int[] arrToInt = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arrToInt[i] = Integer.parseInt(arr[i]);
		}
		return arrToInt;
	}

}
