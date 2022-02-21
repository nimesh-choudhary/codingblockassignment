package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SortingInLinearTime {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		int countRed = 0;
		int countWhite = 0;
		int countBlue = 0;
		for(int i = 0;i<N;i++) {
			if(arr[i] == 0) {
				countRed++;
			}
			else if(arr[i] == 1) {
				countWhite++;
			}
			else {
				countBlue++;
			}
		}
		int arr_new[] = new int[N];
		for(int i = 0;i<countRed;i++) {
			arr_new[i] = 0;
		}
		for(int i = countRed;i<N - countBlue;i++) {
			arr_new[i] = 1;
		}
		for(int i = countBlue;i<N;i++) {
			arr_new[i] = 2;
		}
		System.out.println("Array->"+Arrays.toString(arr_new));
	}
}
