import java.util.*;
public class Main {
    static void spiralPrint(int a[][])
	{
		int m = a.length;
		int n = a[0].length;
		int i, k = 0, l = 0;

		while (k < m && l < n) {
			for (i = l; i < n; ++i) {
				System.out.print(a[k][i] + ", ");
			}
			k++;

			for (i = k; i < m; ++i) {
				System.out.print(a[i][n - 1] + ", ");
			}
			n--;

			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(a[m - 1][i] + ", ");
				}
				m--;
			}

			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(a[i][l] + ", ");
				}
				l++;
			}
		}
	}

	public static void main(String[] args)
	{
		int M,N;
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		if(M>=1 && M<=10) {
			N = sc.nextInt();
			if(N>=1 && N<=10) {
				int arr[][] = new int[M][N];
				for(int i = 0; i<M;i++) {
					for(int j = 0;j<N;j++) {
						arr[i][j] = sc.nextInt();
					}
				}
				spiralPrint(arr);
				System.out.print("END");
				
			}
		}
	}
}
