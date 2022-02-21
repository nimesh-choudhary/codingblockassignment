package Assignment3;

import java.util.Scanner;

public class MinimumSwaps {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N>=1 && N<100000) {
			int arr[] = new int[N];
			for(int i = 0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			int numSwaps = 0;
			for(int i = 0; i<N-1;i++) {
				int temp,m = i;
				for(int j = i;j<N;j++) {
					if(arr[j]<arr[m]) {
						m = j;
					}
				}
				if(m!=i) {
					temp = arr[m];
					arr[m] = arr[i];
					arr[i] = temp;
					++numSwaps;
				}
			}
			System.out.println(numSwaps);
		}
	}
}
