package Assignment3;

import java.util.Scanner;

public class MaxValueInArray {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Size of an array -> ");
		N = sc.nextInt();
		if(N>0) {
			int arr[] = new int[N];
			for(int i = 0; i<N;i++) {
//				System.out.println("Enter "+i+" element");
				arr[i] = sc.nextInt();
			}
			int max = arr[0];
			for(int i = 0; i<N;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println(max);
		}
	}
}
