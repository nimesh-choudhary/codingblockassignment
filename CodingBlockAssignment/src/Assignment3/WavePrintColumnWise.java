import java.util.*;
public class Main {
    public static void main(String args[]) {
        int N,M;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N>=1 && N<=10) {
			M = sc.nextInt();
			if(M>=1 && M<=10) {
				int arr[][] = new int[N][M];
				for(int i = 0;i<N;i++) {
					for(int j = 0;j<M;j++) {
						arr[i][j] = sc.nextInt();
					}
				}
				for(int j = 0;j<M;j++) {
					if(j%2 == 0) {
						for(int i = 0;i<N;i++) {
							System.out.print(arr[i][j]+", ");
						}
					}
					else {
						for(int i = N - 1;i>=0;i--) {
							System.out.print(arr[i][j]+", ");
						}
					}
				}
				System.out.print("END");
			}
		}
    }
}
