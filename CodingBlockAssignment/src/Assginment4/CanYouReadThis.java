import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch>='A' && ch<='Z' && i!=0){
                System.out.println();
            }
            System.out.print(ch);
        }
    }
}
