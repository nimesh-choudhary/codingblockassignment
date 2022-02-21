package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N>0) {
			int arr[] = new int[N];
			for(int i = 0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			int arr_new[] = new int[N];
			for(int i = 0, j = N - 1;i<N && j>=0;i++,j--) {
				arr_new[i] = arr[j];
			}
//			System.out.println("array-> "+Arrays.toString(arr_new));
			for(int i = 0;i<N;i++) {
				System.out.print(arr_new[i]+" ");
			}
		}
	}
}
