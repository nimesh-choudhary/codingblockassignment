// package Assginment4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static final int char_range = 128;
	public static String longestSubString(String s,int k) {
		if(s == null || s.length() == 0) {
			return s;
		}
		int end = 0, begin = 0;
		Set<Character> win = new HashSet<>();
		int[] freq = new int[char_range];
		for(int i = 0,j=0;j<s.length();j++) {
			win.add(s.charAt(j));
			freq[s.charAt(j)]++;
			
			while(win.size() > k) {
				if(--freq[s.charAt(i)] == 0) {
					win.remove(s.charAt(i));
				}
				i++;
			}
			if(end - begin < j - i) {
				end = j;
				begin = i;
			}
		}
		return s.substring(begin, end+1);
//		return s;
	}
	public static void main(String[] args) {
		String s;
		int t,k;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			s = sc.next();
			if(s.length()>=1 && s.length()<=1000) {
				k = sc.nextInt();
				String s_new = longestSubString(s,k);
				System.out.println(s_new.length());
//				System.out.println(longestSubString(s,k));
			}
            t--;
		}
	}
}
