package Assignment3;

import java.util.Scanner;

public class MatrixSearch {
	public static void main(String[] args) {
		int N,M;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N>=1 && N<=30) {
			M = sc.nextInt();
			if(M>=1 && M<=100) {
				int arr[][] = new int[N][M];
				for(int i = 0;i<N;i++) {
					for(int j = 0;j<M;j++) {
						arr[i][j] = sc.nextInt();
					}
				}
				int output = 0;
				int X = sc.nextInt();
				for(int i = 0;i<N;i++) {
					for(int j = 0;j<M;j++) {
						if(arr[i][j] == X) {
							output = 1;
							break;
						}
					}
				}
				System.out.println(output);
			}
		}
	}
}
