/**
 * 
 */
package vw.hackerearth.contests.jc17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author vivek.wisdom
 *
 */
public class ShareMarket {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int testCases = Integer.parseInt(st.nextToken());

		for (int i = 0; i < testCases; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] antiques = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				antiques[j] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int[] atuse = new int[k];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < k; j++) {
				atuse[j] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			int[] cost = new int[k];
			for (int j = 0; j < k; j++) {
				cost[j] = Integer.parseInt(st.nextToken());
			}

			// Logic to solve the problem
			for (int j = 0; j < cost.length; j++) {
				int sum = cost[j];
				int count = atuse[j];
				int asum = 0;
				String result = "";
				
				for (int l = 0; l < n; l++) {
					for (int m = l; m < n; m++) {
						asum = antiques[l] + antiques[m];
						if (asum == sum) {
							result = "Yes";
						} else {
							result = "No";
						}
					}
				}
				System.out.println(result);

			}

		}
	}
}
