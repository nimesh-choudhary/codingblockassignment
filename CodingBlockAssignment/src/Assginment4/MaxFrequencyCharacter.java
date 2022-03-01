import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int freq = 0;
        int idx = 0;
        int maxFreq = Integer.MIN_VALUE;

        for(int i=0; i<s.length(); i++){
            char chi = s.charAt(i);

            for(int j=i+1; j<s.length(); j++){
                char chj = s.charAt(j);
                if(chi==chj){
                    freq++;
                }
            }

            if(freq>maxFreq){
                maxFreq=freq;
                idx=i;
            }
        }

        System.out.print(s.charAt(idx));

    }
}
