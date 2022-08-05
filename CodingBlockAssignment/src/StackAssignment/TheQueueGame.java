import java.util.*;

class Queue{
	int[] arr;
	int s;
	int size;
	
	public Queue() {
		arr = new int[5];
		s = 0;
		size = 0;
	}
	public Queue(int N) {
		arr = new int[N];
		s = 0;
		size = 0;
	}
//	public void add(int x) {
//		arr[s+size] = x;
//		size++;
//	}
	
	public void add(int x) {
//		used for circular array
		if(isFull()) {
			throw new RuntimeException("Queue is full");
		}
		int idx = (s+size)%arr.length;
		arr[idx] = x;
		size++;
	}
	public void push(int x) {
		add(x);
	}
	
	public int pull() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		int ans = arr[s];
		s++;
//		used for circular array
		s = s % arr.length;
		size--;
		return ans;
	}
	
	public int peak() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is an Empty");
		}
		return arr[s];
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public boolean isFull() {
		return size() == arr.length-1;
	}
	
	public int size() {
		return size;
	}
	
	public void dis() {
		int c = 0;
		while(c<size()) {
			System.out.println(arr[c]);
			c++;
		}
	}
}
public class Main {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<arr.length;i++){
				arr[i] = sc.nextInt();
			}
			int count = 0;
			Queue q = new Queue(n);
			for(int i = 0;i<arr.length;i++){
				int x = arr[i];
				if(x == 1){
					q.add(x);
				}
				if(x == 0){
					try{
						q.pull();
					}
					catch(Exception e){
						count = -1;
					}
				}
			}
			if(count == 0){
				System.out.println("Valid");
			}
			if(count == -1){
				System.out.println("Invalid");
			}
			t--;
		}
    }
}
