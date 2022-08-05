import java.util.*;

public class Main {
	public static void nextLarger(int[] arr) {

	// Write Code here
		int[] ans = new int[arr.length];
		Stack<Integer> S = new Stack<Integer>();
		for(int i = 0;i<arr.length;i++) {
			int nxt = arr[i];
			while(!S.isEmpty() && arr[S.peek()] < nxt) {
				int idx = S.pop();
				ans[idx] = nxt;
			}
			S.add(i);
		}
		while(!S.isEmpty()) {
			int idx =S.pop();
			ans[idx] = -1;
		}
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]+","+ans[i]);
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			nextLarger(arr);

			t--;
		}

	}

	// Function to print Next Greater Element for each element of the array
}
