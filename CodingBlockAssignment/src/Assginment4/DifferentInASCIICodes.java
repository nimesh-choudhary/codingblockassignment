import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int diff = 0;

        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            char chnext = s.charAt(i+1);

            diff = chnext-ch;

            System.out.print(ch + "" + diff);
        }
        System.out.println(s.charAt(s.length()-1));

    }
}
