package Assignment1;

import java.util.Scanner;

public class PrintPrimes {
	public static void main(String[] args) {
		int num,count;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>=1 && num<=1000) {
			if(num == 1) {
				
			}
			else {
				for (int i = 2; i <= num; i++) {
				  count = 0;
				  for (int j = 2; j <= i / 2; j++) {
					  if (i % j == 0) {
						  count++;
				      	  break;
				      }
				   }
				   if (count == 0) {
					   System.out.println(i);
				   }
				}
			}
		}
	}
}
