// Java implementation of the approach
package Assignment3;

import java.util.Scanner;

public class RainWaterTraping{

public static int maxWater(int[] arr)
	{
		int n = arr.length;
		int res = 0;
	
		for(int i = 1; i < n - 1; i++)
		{
			
			int left = arr[i];
			for(int j = 0; j < i; j++)
			{
				left = Math.max(left, arr[j]);
			}
	
			int right = arr[i];
			for(int j = i + 1; j < n; j++)
			{
				right = Math.max(right, arr[j]);
			}
	
			res += Math.min(left, right) - arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int N,t;
		Scanner sc= new Scanner(System.in);
		t = sc.nextInt();
		if(t>=1 && t<=10) {
			while(t>0) {
				N = sc.nextInt();
				if(N>=1 && N<=1000000) {
					int arr[] = new int[N];
					for(int i = 0;i<N;i++) {
						arr[i] = sc.nextInt();
					}
					System.out.println(maxWater(arr));
				}
				t--;
			}
		}
	}
}

