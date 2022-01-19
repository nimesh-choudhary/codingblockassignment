package Assignment1;

import java.util.*;

public class ReplaceThemAll {
	public static Long reverse(Long n){
        Long temp = 0L;
        Long d;
        while(n!=0){
            d = n%10;
            temp = temp*10 + d;
            n = n/10;
        }
        return temp;
    }
    public static void main(String args[]) {
        Long n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        // if(n>=0 && n<=1000000000){
            Long temp = 0L;
            if(n == 0){
                temp = 5L;
            }
            else{
                Long digit;
                while(n!=0){
                    digit = n%10;
                    if(digit == 0L){
                        digit = 5L;
                    }
                    temp = temp*10 + digit;
                    n = n/10;
                }
            }
            temp = reverse(temp);
            System.out.println(temp);
        // }
	}
}
