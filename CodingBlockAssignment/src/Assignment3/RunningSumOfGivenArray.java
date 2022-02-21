// JAVA program to find maximum sum path
package Assignment3;

import java.util.Scanner;

public class RunningSumOfGivenArray{
	
	// Utility function to find maximum of two integers
	public static int max(int x, int y) { return (x > y) ? x : y; }

	// This function returns the sum of elements on maximum
	// path from beginning to end
	public static int maxPathSum(int ar1[], int ar2[])
	{
		int m,n;
		m = ar1.length;
		n = ar2.length;
		// initialize indexes for ar1[] and ar2[]
		int i = 0, j = 0;

		// Initialize result and current sum through ar1[]
		// and ar2[].
		int result = 0, sum1 = 0, sum2 = 0;

		// Below 3 loops are similar to merge in merge sort
		while (i < m && j < n)
		{
			// Add elements of ar1[] to sum1
			if (ar1[i] < ar2[j])
				sum1 += ar1[i++];

			// Add elements of ar2[] to sum2
			else if (ar1[i] > ar2[j])
				sum2 += ar2[j++];

			// we reached a common point
			else
			{
				// Take the maximum of two sums and add to
				// result
				//Also add the common element of array, once
				result += max(sum1, sum2) + ar1[i];

				// Update sum1 and sum2 for elements after this
				// intersection point
				sum1 = 0;
				sum2 = 0;

				//update i and j to move to next element of each array
				i++;
				j++;
			}
		}

		// Add remaining elements of ar1[]
		while (i < m)
			sum1 += ar1[i++];

		// Add remaining elements of ar2[]
		while (j < n)
			sum2 += ar2[j++];

		// Add maximum of two sums of remaining elements
		result += max(sum1, sum2);

		return result;
	}

	// Driver code
	public static void main(String[] args)
	{
		int N,M,t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		if(t>=1 && t<=100) {
			while(t>0) {
				M = sc.nextInt();
				if(M>=1 && M<=10000) {
					N = sc.nextInt();
					if(N>=1 && N<10000) {
						int arr1[] = new int[M];
						int arr2[] = new int[N];
						for(int i = 0;i<M;i++) {
							arr1[i] = sc.nextInt();
						}
						for(int j = 0;j<N;j++) {
							arr2[j] = sc.nextInt();
						}
//						maxPathSum(arr1,arr2);
						System.out.println(maxPathSum(arr1,arr2));
					}
				}
				t--;
			}
		}
		
	}
}

// This code has been contributed by Mayank Jaiswal
