package Assginment4;

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(s.length()>=1 && s.length()<=1000) {
			int count = 1;
			StringBuilder sb = new StringBuilder();
			for(int i = 1;i<s.length();i++) {
				if(s.charAt(i) == s.charAt(i-1)) {
					count++;
				}
				else {
					sb.append(s.charAt(i-1));
					sb.append(count);
					count = 1;
				}
			}
//			if(s.length() >1) {
//				if(s.charAt(s.length()-1) == s.charAt(s.length()-2)) {
//					count++;
//				}
//				else {
//					sb.append(s.charAt(s.length()-2));
//					sb.append(count);
//					count = 1;
//				}
//				sb.append(s.charAt(s.length()- 1));
//				sb.append(count);
//			}
			s = sb.toString();
			System.out.println(s);
		}
	}
}
