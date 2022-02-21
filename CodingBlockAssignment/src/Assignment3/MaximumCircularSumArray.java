// Java program for maximum contiguous circular sum problem
package Assignment3;
import java.io.*;
import java.util.*;

class MaximumCircularSumArray{
	public static int kadane(int a[],int n){
		int res = 0;
		int x = a[0];
		for(int i = 0; i < n; i++){
			res = Math.max(a[i],res+a[i]);
			x= Math.max(x,res);
		}
		return x;
	}
	public static int reverseKadane(int a[]){
		int n = a.length;
		int total = 0;
		for(int i = 0; i< n; i++){
			total +=a[i];
			
		}
		for(int i = 0; i<n ; i++){
			a[i] = -a[i];
		}
		int k = kadane(a,n); 
		int ress = total+k;
		if(total == -k ){
			return total;
		}
		else{
		return ress;
		}
		
	}

	public static void main(String[] args) {
		int t,N;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		if(t>=1 && t<=100) {
			while(t>0) {
				N = sc.nextInt();
				if(N>=1 && N<=1000) {
					int arr[] = new int[N];
					for(int i = 0;i<N;i++) {
						arr[i] = sc.nextInt();
					}
					System.out.println(reverseKadane(arr));
				}
				t--;
			}
		}
	}
} /* This code is contributed by Mohit Kumar*/
