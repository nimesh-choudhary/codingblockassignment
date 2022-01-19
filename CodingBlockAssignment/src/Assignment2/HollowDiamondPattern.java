package Assignment2;
import java.util.Scanner;
public class HollowDiamondPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int nst = n;
        int nsp = -1;
        int row = 1;
        while(row<=n) {
            int cst = 1;
            while(cst <= nst/2) {
                System.out.print("*"+"\t");
                cst++;
            }
            int csp = 1;
            while(csp<=nsp) {
                System.out.print(" "+"\t");
                csp++;
            }
            int cst2 = cst;
            while(cst2<=nst) {
                System.out.print("*"+"\t");
                cst2++;
            }
            row++;
            if(row == 2){
                nst -= 1;
                nsp += 2;
                System.out.println();
                continue;
            }
            if(row == n){
                nsp -= 2;
                nst += 1;
                System.out.println();
                continue;
            }
            if(row <= n/2 + 1) {
                nsp = nsp + 2;
                nst -= 2;
            }
            else {
                nsp = nsp - 2;
                nst += 2;
            }
            System.out.println();
        }
    }
}