package Assginment4;

import java.util.Scanner;

public class MaxFrequencyCharacter {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(s.length()>=1 && s.length()<=1000) {
			int[] freq = new int[s.length()];
			char maxChar = s.charAt(0);
			char s1[] = s.toCharArray();
			for(int i = 0;i<s1.length;i++) {
				freq[i] = 1;
				for(int j = 0;j<s1.length;j++) {
					if(s1[i] == s1[j] && s1[i] != '0') {
						freq[i]++;
						s1[j] = '0';
					}
				}
			}
			int max = freq[0];
			for(int i = 0;i<freq.length;i++) {
				if(max<freq[i]) {
					max = freq[i];
					maxChar = s1[i];
				}
			}
			System.out.println(maxChar);
		}
	}
}
