import java.util.*;
public class Main {
    public static String removeDuplicates(String s) {
		if(s.length()<=1) {
			return s;
		}
		if(s.charAt(0) == s.charAt(1)) {
			return removeDuplicates(s.substring(1));
		}
		else {
			return s.charAt(0)+removeDuplicates(s.substring(1));
		}
	}
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(s.length()>=1 && s.length()<=1000) {
			System.out.println(removeDuplicates(s));
		}
	}
}
