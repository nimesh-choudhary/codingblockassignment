package Assignment3;

import java.util.Scanner;

public class MaximumSumPathsInTwoArrays {
	public static void main(String[] args) {
		int t,n,m;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		if(t>=1 && t<=100) {
			while(t>0) {
				n = sc.nextInt();
				if(n>=1 && n<=100000) {
					m = sc.nextInt();
					if(m>=1 && m<=100000) {
						int arr1[] = new int[n];
						int arr2[] = new int[m];
						System.out.println("Enter the element of array1->");
						for(int i = 0;i<n;i++) {
							arr1[i] = sc.nextInt();
						}
						System.out.println("Enter the element of an array2->");
						for(int j = 0;j<m;j++) {
							arr2[j] = sc.nextInt();
						}
					}
				}
			}
		}
	}
}
