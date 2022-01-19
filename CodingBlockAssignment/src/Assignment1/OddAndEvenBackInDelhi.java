package Assignment1;

import java.util.*;

public class OddAndEvenBackInDelhi {
	public static void main(String[] args) {
		int q,n;//n-> Car no, q-> querry/N
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter query");
//		n = sc.nextInt();
//		int sumOdd = 0;
//		int sumEven = 0;
//		while(n!=0){
//			int a = n%10;
//			if(a%2 ==0 ) {
//				sumEven = sumEven + a;
//			}
//			else {
//				sumOdd = sumOdd + a;
//			}				
//			n = n/10;
//		}
//		System.out.println("sum of even-> "+sumEven);
//		System.out.println("sum of odd-> "+sumOdd);
//		if(sumOdd%3 ==0 || sumEven%4==0) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		q = sc.nextInt();
		if(q>=1 && q<=1000) {
			int i = 1;
			while(i<=q) {
				int sumOdd = 0;
				int sumEven = 0;
				System.out.println("Enter car number");
				n = sc.nextInt();
				if(n>=0 && n<=1000000000) {
					while(n!=0) {
						int a = n%10;
						if(a%2 == 0) {
							sumEven = sumEven+a;
						}
						else {
							sumOdd = sumOdd + a;					
						}
						n = n/10;
					}
					if(sumOdd%3 == 0 || sumEven%4 == 0) {
						System.out.println("Yes");
					}
					else {
						System.out.println("No");
					}
				}
				else{
					break;
				}
				i++;
			}
		}
	}
}
