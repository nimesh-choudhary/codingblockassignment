package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTheSum {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
//		int last  = arr[N-1];
		System.out.println("Array ->"+Arrays.toString(arr));
//		System.out.println("Last -> "+last);
		int X;
		X = sc.nextInt();
		int arr_new[] = new int[N];
		int sum = 0;
		while(X>0) {
			for(int i = 0;i<N;i++) {
				int last = arr[N];
				if(i == 0) {
					arr_new[i] = arr[i]+last;
				}
				else {
					arr_new[i] = arr[i]+arr[i-1];
				}
				sum = sum + arr_new[i];
			}
			X--;
		}
		System.out.println("Cyclic array ->"+Arrays.toString(arr_new));
		System.out.println("Sum ->"+sum);
		System.out.println("aer->"+arr[-1]);
	}
}
