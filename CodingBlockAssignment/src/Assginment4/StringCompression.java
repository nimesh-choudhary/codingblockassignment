import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int count = 0;

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<n-1; i++){
            char ch = s.charAt(i);
            char next = s.charAt(i+1);

            if (ch==next){
                count++;
            } else{
                count++;
                stringBuilder.append(ch);
                if (count>1){
                    stringBuilder.append(count);
                }
                count=0;
            }
        }

        if (s.charAt(n-1)==s.charAt(n-2)){
            count++;
        }
        stringBuilder.append(s.charAt(n-1));
        if (count>1){
            stringBuilder.append(count);
        }

        System.out.println(stringBuilder);
    }

}
