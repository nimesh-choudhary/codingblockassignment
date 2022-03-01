import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        int count = 0;
        int maxCount = 0;

        for (int i=0; i<n; i++){
            boolean ans = true;
            char ch = s.charAt(i);

            for (int j=i; j<n; j++){
                if (s.charAt(i)!=s.charAt(j)){
                    ans = false;
                } else{
                    count++;
                }
            }

            if (count>maxCount){
                maxCount = count;
            }
        }

        System.out.println(maxCount);
    }


    public static boolean isPalindrome(String s){
        int n = s.length();
        int idx = 0;
        int revIdx = n-1;
        boolean ans = true;

        for(int i=0; i<n/2; i++){
            char ch = s.charAt(i);

            if(s.charAt(idx)!=s.charAt(revIdx)){
                ans = false;
            }
            idx++;
            revIdx--;
        }

        return ans;
    }

}
