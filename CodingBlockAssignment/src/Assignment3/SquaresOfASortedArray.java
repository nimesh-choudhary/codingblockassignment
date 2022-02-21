import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static int[] sortArray(int arr[]) {
        int n = arr.length;
//      int sort_array[] = new int[n];
        int temp = 0;
        for(int i = 0;i<n;i++) {
            for(int j = i +1;j<n;j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if(N>=1 && N<=10000) {
            int arr[] = new int[N];
            for(int i = 0;i<N;i++) {
                arr[i] = sc.nextInt();
            }
            int arr_square[] = new int[N];
            for(int i = 0;i<N;i++) {
                arr_square[i] = (int) Math.pow(arr[i], 2);
            }
            arr = sortArray(arr_square);
//          System.out.println(Arrays.toString(arr_square));
            for(int i = 0;i<N;i++) {
                System.out.print(arr_square[i]+" ");
            }
        }
    }
}
