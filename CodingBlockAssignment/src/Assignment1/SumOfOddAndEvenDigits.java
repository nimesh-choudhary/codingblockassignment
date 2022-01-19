package Assignment1;

import java.util.*;

public class SumOfOddAndEvenDigits {
	static int sizeofnumber(int n) {
		int count = 0;
		int a;
		while(n!=0) {
//			a = n%10;
			count = count + 1;
			n = n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		n = sc.nextInt();
		int i = 0;
		int sumOdd = 0;
		int sumEven = 0;
		int a;
		int size = sizeofnumber(n);
		System.out.println("Size - "+size);
		while(n!=0 && i<size) {
			a = n%10;
			if(i%2 == 0) {
				sumEven = sumEven + a;
			}
			else {
				sumOdd = sumOdd + a;
			}
			i++;
			n=n/10;
		}
		System.out.println("Sum of eve digits - "+sumEven);
		System.out.println("sum of odd digits - "+sumOdd);
		
	}
}
