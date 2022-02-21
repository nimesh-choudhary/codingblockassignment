import java.util.*;
public class Main {
    public static void counterClockspiralPrint(int arr[][])
	{
		int m = arr.length;
		int n = arr[0].length;
		int i, k = 0, l = 0;
		int cnt = 0;

		int total = m * n;

		while (k < m && l < n)
		{
			if (cnt == total)
				break;

			for (i = k; i < m; ++i)
			{
				System.out.print(arr[i][l] + ", ");
				cnt++;
			}
			l++;

			if (cnt == total)
				break;

			// Print the last row from
			// the remaining rows
			for (i = l; i < n; ++i)
			{
				System.out.print(arr[m - 1][i] + ", ");
				cnt++;
			}
			m--;

			if (cnt == total)
				break;

			// Print the last column
			// from the remaining columns
			if (k < m)
			{
				for (i = m - 1; i >= k; --i)
				{
					System.out.print(arr[i][n - 1] + ", ");
					cnt++;
				}
				n--;
			}

			if (cnt == total)
				break;

			// Print the first row
			// from the remaining rows
			if (l < n)
			{
				for (i = n - 1; i >= l; --i)
				{
					System.out.print(arr[k][i] + ", ");
					cnt++;
				}
				k++;
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
				for(int i = 0;i<M;i++) {
					for(int j = 0;j<N;j++) {
						arr[i][j] = sc.nextInt();
					}
				}
				counterClockspiralPrint(arr);
				System.out.print("END");
			}
		}
	}
}
