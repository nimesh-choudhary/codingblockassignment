package Assignment3;

import java.util.Scanner;

public class TargetSumTriplets {
	public static int[] sortArray(int arr[]) {
		int n = arr.length;
//		int sort_array[] = new int[n];
		int temp = 0;
		for(int i = 0;i<n;i++) {
			for(int j = i +1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int N,sum;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N>=1 && N<=1000) {
			int arr[] = new int[N];
			for(int i = 0; i<N;i++) {
				arr[i] = sc.nextInt();
			}
			sum = sc.nextInt();
			arr = sortArray(arr);
			for(int i = 0;i<N-2;i++) {
				for(int j = i+1;j<N-1;j++) {
					for(int k = j+1;k<N;k++) {
						if((arr[i] + arr[j] + arr[k]) == sum) {
							System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
						}
					}
				}
			}
		}
	}
}
