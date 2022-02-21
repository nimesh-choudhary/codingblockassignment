package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class InverseOfAnArray {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter value of N");
		N = sc.nextInt();
		int arr[] = new int[N];
		int arr_new[] = new int[N];
		for(int i  = 0; i<N;i++) {
//			System.out.println("Enter "+i+" element");
			arr[i] = sc.nextInt();
		}
//		System.out.println("Array -> "+Arrays.toString(arr));
		for(int i = 0;i<N;i++) {
			int x = arr[i];
			arr_new[x] = i;
		}
//		System.out.println("Array new ->"+Arrays.toString(arr_new));
		for(int i = 0;i<N;i++) {
			System.out.print(arr_new[i]+" ");
		}
	}
}
