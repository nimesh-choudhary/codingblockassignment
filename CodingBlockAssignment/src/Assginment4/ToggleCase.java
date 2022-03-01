import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(s.length()>=1 && s.length()<=1000) {
			StringBuffer s_new = new StringBuffer(s);
			for(int i = 0;i<s.length();i++) {
				if(Character.isLowerCase(s.charAt(i))) {
					s_new.setCharAt(i, Character.toUpperCase(s.charAt(i)));
				}
				else {
					s_new.setCharAt(i, Character.toLowerCase(s.charAt(i)));
				}
			}
			System.out.println(s_new);
		}
    }
}
