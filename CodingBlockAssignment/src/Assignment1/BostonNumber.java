package Assignment1;

import java.util.*;
public class BostonNumber {
    public static long sumOfFactors(long n) {
		long sumFactors = 0;
		for(int i = 2; i<n;i++) {
			while(n%i== 0) {
				sumFactors = sumFactors + i;
				n = n/i;
			}
		}
		if(n>2) {
			sumFactors = sumFactors + n;
		}
		return sumFactors;
	}
	public static void main(String[] args) {
		long n;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number -> ");
		n = sc.nextLong();
        if(n>1 && n<8589934588L) {
    		long count = 0;
    		long sumDigits = 0;
    		long sumFactors = sumOfFactors(n);
    		while(n!=0) {
    			long d = n%10;
    			count = count + 1;
    			n = n/10;
    			sumDigits = sumDigits + d;
    		}
    		int flag;
    		if(sumFactors == sumDigits) {
    			flag = 1;
    		}else {
    			flag = 0;
    		}
//    		System.out.println("The number is bosotn -> "+flag);
    		System.out.println(flag);
        }
	}
}
