package interviewQuestions;

import java.util.*;

public class MostImp {
	
	static int subarray(int a[], int n , int k) {
		
		int sum [] = new int[n + 1];
		
		int x = 0;
		
		for(int i = 0; i < n; i++) {
			
			x += a[i];
			
			sum [i] = x;
			
	
		}
		
		Deque<Integer> dq = new LinkedList<>();
		Deque<Integer> dq2 = new LinkedList<>();
		
		dq.addLast(0);
		dq2.addLast(-1);
		
		int ans = Integer.MAX_VALUE;
		
	for(int i = 0 ; i < n; i++){
		
		while(!dq.isEmpty() && sum [i] - dq.peekFirst() >= k ){
		
		 
		ans = Math.min( ans , i - dq2.peekFirst());
	
		dq.pollFirst();
		dq2.pollFirst();
		
	      }	
		
		
		while(! dq.isEmpty() && sum[i] <= dq.peekLast()){
			
			dq.pollLast();
			dq2.pollLast();
			
		}
		
		
		dq.addLast(sum[i]);
		
        dq2.addLast(i);	
        
        
		
	}
	
	
	if (ans == Integer.MAX_VALUE) 
		return -1;
		
	 else
	return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int a [] = { 3, -2 , -2 , 4, 3, -1 , 5};
	
		
		
		int k = sc.nextInt();
		
		int s = subarray( a , n , k);
		System.out.println(s);
		
		
		
		
		
		

	}

}
