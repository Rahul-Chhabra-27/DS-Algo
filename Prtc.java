package interviewQuestions;
import java.util.*;

public class Prtc {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(56);
		q.add(99);
		q.add(18);
		q.add(10);
		q.add(34);
	
		Stack<Integer> s = new Stack<>();
		
		int k = 3;
		
		int count = q.size();
		
		 for(int i = 0; i < count ; i++) {
			 
			 s.add(q.peek());
			 q.poll();
			 
			 
			 
		 }
		 
		 for(int i = 0; i < count ; i++) {
			 
			 q.add(s.peek());
			 s.pop();
			 
		 }
		 
		 for(int i = 0; i <q.size()-k; i++) {
			 
			 q.add(q.peek());
			 q.poll();
			 
			 
		 }
		
		 System.out.println("Reverse Queue");
		 
		for(int x : q ) {
			
			System.out.println(x + " ");
		}
		

	}

}
