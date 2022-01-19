package Assignment1;
import java.util.*;
public class ShoppingGame {
    public static void main(String[] args) {
        int M,N,q;
        Scanner sc = new Scanner(System.in);
        q = sc.nextInt();
        if(q>=1 && q<=1000){
            while(q!=0){
                M = sc.nextInt();//number of phone for Aayush
                if(M>=1 && M<=1000000){
                    N = sc.nextInt();//number of phone for Harshit
                    if(N>=1 && N<=1000000){
                        int hPhone = 0;
                        int count = 1;
                        int aPhone = 0;
                        while(aPhone<=M && hPhone<=N) {     
                            aPhone += count++;
                            if(aPhone > M) {
                                System.out.println("Harshit");
                                break;
                            }
                            hPhone += count++;   
                            if(hPhone > N) {
                                System.out.println("Aayush");
                                break;
                            }
                            
                        }
                       
                    }
                }
                q--;
            }
        }
    }
}