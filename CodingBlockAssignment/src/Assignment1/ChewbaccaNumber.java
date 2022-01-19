package Assignment1;

import java.util.*;
import java.lang.*;

public class ChewbaccaNumber {
// 	static long reverse(long n) {
// 		long temp = 0;
// 		long d;
// 		while(n!=0) {
// 			d = n%10;
// 			temp = temp*10 + d;
// 			n = n/10;
// 		}
// 		return temp;
// 	}
	public static void main(String[] args) {
		long n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
	       // if(n>=0 && n<= (long)Math.pow(10,18)){
		    long digit;
		    long temp = 0;
		    long mult= 1;
		    long x;
		    while(n!=0){
			if(n==9){
			    temp += 9*mult;
			}
		       digit = n%10;
		       if(digit>=5 && digit<=9){
			   digit = 9-digit;
		       }
		       temp +=  digit*mult;
			mult *=10;
			n /=10;
		    }
		    //temp = reverse(temp);
		    System.out.println(temp);
	       // }
		
	}
}
