import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            char ch = s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
                if (count>maxCount){
                    maxCount = count;
                }
            } else{
                if (count>maxCount){
                    maxCount = count;
                }
                count=0;
            }

        }

        System.out.println(maxCount);
    }
}
