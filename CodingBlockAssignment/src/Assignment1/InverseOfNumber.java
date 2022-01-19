package Assignment1;

import java.util.Scanner;
import java.lang.*;

public class InverseOfNumber {
	public static int sizeOfNumber(int n) {
		int count = 0;
		while(n!=0) {
			count = count + 1;
			n = n/10;
		}
		return count;
	}
	public static int checkDigits(int n) {
		int count = 1;
		int d;
		int size = sizeOfNumber(n);
		while(n!=0) {
			d = n%10;
			if(d>size) {
				count = 0;
			}
			n = n/10;
		}
		return count;	
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(checkDigits(n) == 1) {
			int count = 1;
			int num = 0;
			while(n!=0) {
				int d = n%10;
				if(d<=n) {
					num = (int) (num + Math.pow(10, d-1)*count);
					count++;
					n = n/10;
				}
			}
			System.out.println(num);
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
