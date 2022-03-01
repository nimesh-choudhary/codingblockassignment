package Assginment4;

import java.util.Scanner;

public class isPlaindrome {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(s.length()>=1 && s.length()<=1000) {
			boolean output = true;
			for(int i = 0; i<s.length()/2;i++) {
				if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
					output = false;
					break;
				}
			}
			System.out.println(output);
		}
	}
}
