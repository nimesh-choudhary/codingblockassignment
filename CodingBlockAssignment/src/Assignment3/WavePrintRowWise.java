import java.util.*;
public class Main {
    // public static void print(int arr[][]) {
	// 	int r = arr.length;
	// 	int c = arr[0].length;
	// 	for(int i = 0;i<r;i++) {
	// 		for(int j =0;j<c;j++) {
	// 			System.out.print(arr[i][j]+" ");
	// 		}
	// 		System.out.println();
	// 	}
	// }
	public static void wavePrint(int arr[][]){
		int M = arr.length;
		int N = arr[0].length;
		int arr_new[][] = new int[M][N];
		for(int i = 0;i<M;i++) {
			if(i%2 == 0) {
				for(int j = 0;j<M;j++) {
					System.out.print(arr[i][j]+", ");
				}
			}
			else {
				for(int j = N-1;j>=0;j--) {
					System.out.print(arr[i][j]+", ");
				}
			}
		}
		System.out.print("END");
	}
	public static void main(String[] args) {
		int M,N;
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		if(M>=1 && M<10) {
			N = sc.nextInt();
			if(N>=1 && N<10) {
				int arr[][] = new int[M][N];
				for(int i = 0;i<M;i++) {
					for(int j = 0;j<N;j++) {
						arr[i][j] = sc.nextInt();
					}
				}
				for(int i = 0;i<M;i++) {
					if(i%2 == 0) {
						for(int j = 0;j<N;j++) {
							System.out.print(arr[i][j]+", ");
						}
					}
					else {
						for(int j = N-1;j>=0;j--) {
							System.out.print(arr[i][j]+", ");
						}
					}
				}
                System.out.print("END");
				// wavePrint(arr);
			}
		}
	}
}
