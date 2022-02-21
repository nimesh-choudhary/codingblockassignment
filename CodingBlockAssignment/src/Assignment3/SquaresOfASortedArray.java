package Assignment3;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class SquaresOfASortedArray {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N>=1 && N<=1000) {
			int arr[] = new int[N];
			for(int i = 0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			int arr_square[] = new int[N];
			for(int i = 0;i<N;i++) {
				arr_square[i] = (int) Math.pow(arr[i], 2);
			}
			System.out.println("array->"+Arrays.toString(arr_square));
			for(int i = 0;i<N-1;i++) {
				int a = i;
				int temp = 0;
				for(int j = i + 1;j<N;j++) {
					if(arr_square[j]<arr[i]) {
						a = j;
					}
				}
				temp = arr_square[i];
				arr_square[i] = arr_square[a];
				arr_square[a] = temp;
				
			}
			System.out.println(Arrays.toString(arr_square));
		}
	}
}
