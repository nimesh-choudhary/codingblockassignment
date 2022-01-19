package Assignment1;

import java.util.*;

public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer");
		n = sc.nextInt();
		if(n>=0 && n<=1000000000) {
			int temp = 0;
			int digit;
			while(n!=0) {
				digit = n%10;
				temp = temp*10 + digit;
				n = n/10;
			}
			System.out.println("Reverse of a number is "+temp);
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
