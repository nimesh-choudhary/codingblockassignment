package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLinearSearch {
//	static int findNumberAtIndex(int arr[],int m) {
//		int n = arr.length;
//		int output = 0;
//		for(int i = 0; i<n;i++) {
//			if(arr[i] == m) {
//				output = i;
//				break;
//			}
//			else {
//				output = -1;
//			}
//		}
//		return output;
//	}
	public static void main(String[] args) {
		int N; //number of input you want
		int M; // the number you want to search
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N>0) {
			int arr[] = new int[N];
			for(int i = 0; i<N;i++) {
				System.out.println("Enter number at index "+i);
				arr[i] = sc.nextInt();
			}
			System.out.println("array -> "+Arrays.toString(arr));
			System.out.println("enter number you want to search ->");
			M = sc.nextInt();
			int output = -1;
			for(int i = 0; i<N; i++) {
				if(arr[i] == M) {
					output = i;
					System.out.println(output);
					break;
				}
			}
			if(output == -1) {
				System.out.println(output);
			}
		}
	}
}
