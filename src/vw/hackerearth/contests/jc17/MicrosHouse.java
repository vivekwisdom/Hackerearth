/**
 * 
 */
package vw.hackerearth.contests.jc17;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class MicrosHouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int[] arr = new int[n * m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int maxlen = 32;
		int index = 0;
		for (int i = maxlen - 1; i >= 0; i--) {
			int maxIndex = index, maxele = 0;
			for (int j = index; j < arr.length; j++) {
				if ((arr[j] & (1 << i)) != 0 && arr[j] > maxele) {
					maxele = arr[j];
					maxIndex = j;
				}
			}
			if (maxele == 0)
				continue;

			int temp = arr[index];
			arr[index] = arr[maxIndex];
			arr[maxIndex] = temp;
			
			maxIndex = index;

			for (int j = 0; j < arr.length; j++) {
				if ((j != maxIndex) && ((arr[j] & (1 << i)) != 0))
					arr[j] = arr[j] ^ arr[maxIndex];
			}

			index++;
		}

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];
		}

		System.out.println(ans);

	}

}
