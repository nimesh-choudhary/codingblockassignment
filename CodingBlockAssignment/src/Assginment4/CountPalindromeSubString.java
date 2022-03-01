package Assginment4;

import java.util.Scanner;

public class CountPalindromeSubString {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(s.length()>=1 && s.length()<=1000) {
			int dp[][] = new int[s.length()][s.length()];
			boolean p[][] = new boolean[s.length()][s.length()];
			for(int i = 0;i<s.length();i++) {
				p[i][i] = true;
			}
			for(int i = 0;i<s.length() - 1;i++) {
				if(s.charAt(i) == s.charAt(i+1)) {
					p[i][i+1] = true;
					dp[i][i+1] = 1;
				}
			}
			for(int i = 2;i<s.length();i++) {
				for(int j = 0;j<s.length()-i;j++) {
					int k = i + j;
					if(s.charAt(j) == s.charAt(k) && p[j+1][k-1]) {
						p[j][k] = true;
					}
					if(p[j][k] == true) {
						dp[j][k] = dp[j][k-1] + dp[j+1][k] + 1 - dp[j+1][k-1];
					}
					else {
						dp[j][k] = dp[j][k-1] + dp[j+1][k] - dp[j+1][k-1];
					}
				}
			}
			System.out.println(dp[0][s.length()-1]);
		}
	}
}
