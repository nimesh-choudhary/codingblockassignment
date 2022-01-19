package Assignment1;

import java.util.*;
import java.lang.*;

public class ChewbaccaNumber {
	static long reverse(long n) {
		long temp = 0;
		long d;
		while(n!=0) {
			d = n%10;
			temp = temp*10 + d;
			n = n/10;
		}
		return temp;
	}
	public static void main(String[] args) {
		Long n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		n = sc.nextLong();
		if(n>=0 && n<= (long)Math.pow(10, 18)) {
			long rev = 0;
			long x = 0;
			long digit;
			while(n!=0) {
				digit = n%10;
				x = 9 - digit;
				if(x<digit) {
					rev = rev*10 + x;
				}
				else if (x>digit) {
					rev = rev*10 + digit;
				}
				n = n/10;
			}
			rev = reverse(rev);
			System.out.println(rev);
		}
		
	}
}
