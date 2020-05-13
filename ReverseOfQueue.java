package interviewQuestions;

import java.util.*;


public class ReverseOfQueue {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		
		q.add(56);
		q.add(99);
		q.add(18);
		q.add(10);
		q.add(34);
		
		System.out.println("No. of elements in k");
		
		int k = sc.nextInt();
		
		System.out.println("Reverse Queue");
		Stack<Integer> s = new Stack<>();
		if(q.isEmpty() == true) {
			return ;
			
		} else {
		for(int i = 1; i <= k; i++) {
			
			s.add(q.peek());
			q.poll();
		}	
			
			for(int i = 1; i <= k; i++) {
				
				q.add(s.peek());
				s.pop();
				
				
				
			}
					
					
			for(int i = 1; i <=q.size() - k; i++) {
				
				q.add(q.peek());
				q.poll();
				
				
				
			}
			
			
		
		for(int x : q) {
			
			
			System.out.println( x + " ");
		}
		
		}
		
		
		
		
		
		
		
		
		
	}

}
