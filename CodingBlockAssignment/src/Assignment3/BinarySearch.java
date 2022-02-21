package Assignment3;

import java.util.Scanner;

public class BinarySearch {
	public static int findNumber(int arr[], int M) {
		int output = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == M) {
				output = i;
				break;
			}
			else {
				output = -1;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		int N,M;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		M = sc.nextInt();
		int x = findNumber(arr,M);
		System.out.println(x);
//		System.out.println("X ->"+x);
	}
}
