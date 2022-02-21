package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class ZerosAtEnd {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i<N;i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		int arr_new[] = new int[N];
		for(int i = 0;i<count;i++) {
			arr_new[i] = 1;
		}
		for(int j = count;j<N;j++) {
			arr_new[j] = 0;
		}
		for(int i = 0;i<N;i++) {
			System.out.print(arr_new[i]+" ");
		}
	}
}
