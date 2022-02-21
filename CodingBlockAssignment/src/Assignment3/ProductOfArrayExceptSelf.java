package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N>1) {
			int arr[] = new int[N];
			for(int i = 0; i<N;i++) {
				arr[i] = sc.nextInt();
			}
			
//			int mul = 1;
			long arr_new[] = new long[N];
			for(int i = 0; i<N;i++) {
				long mul = 1;
				for(int j =0;j<N;j++) {
					mul = mul*arr[j];
				}
				mul = mul/arr[i];
				arr_new[i] = mul;
			}
//			System.out.println("new Array -> "+Arrays.toString(arr_new));
			for(int i = 0;i<N;i++) {
				System.out.print(arr_new[i]+" ");
			}
		}
	}
}
