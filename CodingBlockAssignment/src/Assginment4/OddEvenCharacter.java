import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(i%2==0){
                ch++;
            } else{
                ch--;
            }

            System.out.print(ch);
        }
    }
}
