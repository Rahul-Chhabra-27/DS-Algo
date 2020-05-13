package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KlargestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the no. of elements");
      int k = sc.nextInt();
      int n = sc.nextInt();
      System.out.println("enter size");
      int a[] = new int[n];
		
		for(int i = 0; i <n ; i++) {
			
	
			a[i] = sc.nextInt();	
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i <n; i++) {
			
			if(i < k ) {
				
				pq.add(a[i]);
				
				
				
			} else{
				
				if(pq.peek() < a[i]) {
					
					pq.add(a[i]);
					pq.poll();
				}
			}
		}
		
			ArrayList<Integer> arr = new ArrayList<>(pq);
			
		Collections.sort(arr,Collections.reverseOrder());
				

		for(int x : arr) {
			
			System.out.print(x + " ");
		}
			
			System.out.println();
			
			
			
			
			
			
			
			
		
		
		
		
	}

}
