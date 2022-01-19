package Assignment2;

public class PatternHourGlass {
	public static void main(String[] args) {
		int N = 5;
		int d = 2*N;
		int n = d + 1;
		int row = 1;
		int nsp = 0;
		int nst = d + 1;
		int count = 5;
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print(count);
				if(cst <= nst/2 + 1) {
					count--;
				}
				else {
					count++;
				}
				cst++;
			}
			int csp = 1;
			while(csp <= nsp) {
				System.out.println(" "+"\t");
				if(nsp<=n+1) {
					csp++;
				}
				else {
					csp--;
				}
				csp++;
			}
			row++;
			nst--;
			if(row <= n/2 + 1) {
				count--;
				nsp++;
			}else {
				count++;
				nsp--;
			}
			System.out.println();
		}
	}
}
