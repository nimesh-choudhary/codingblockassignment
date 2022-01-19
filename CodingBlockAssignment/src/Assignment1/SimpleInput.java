package Assignment1;

import java.util.*;

public class SimpleInput {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count >= 0) {	
			System.out.println("Enter number/integer");
			n = sc.nextInt();
			if(n > -1000 && n < 1000) {
				count  = count + n;
				if(count>=0) {
					System.out.println(n);
				}
			}
			else {
				break;
			}
		}
	}
}
