package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SortJustZerosAndOnes {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		int numZeros = 0, numOnes = 0;
		for(int i = 0;i<N;i++) {
			if(arr[i] == 0) {
				numZeros++;
			}
			else {
				numOnes++;
			}
		}
//		System.out.println("Zeros -> "+numZeros);
//		System.out.println("Ones ->"+numOnes);
		int arr_new[] = new int[N];
		for(int i = 0;i<numZeros;i++) {
			arr_new[i] = 0;
		}
		for(int i = numZeros;i<N;i++) {
			arr_new[i] = 1;
		}
		for(int i = 0;i<N;i++) {
			System.out.print(arr_new[i]+" ");
		}
//		System.out.println("Arrays-> "+Arrays.toString(arr_new));
	}
}
