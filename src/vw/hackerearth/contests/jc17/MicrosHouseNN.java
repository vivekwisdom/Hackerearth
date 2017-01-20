/**
 * 
 */
package vw.hackerearth.contests.jc17;

/**
 * @author vivek
 *
 */
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class MicrosHouseNN {

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
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			long xor = 0;
			for (int j = i; j < arr.length; j++) {
				xor = xor ^ arr[j];
				ans = Math.max(xor, ans);
			}
		}

		System.out.println(ans);

	}

}