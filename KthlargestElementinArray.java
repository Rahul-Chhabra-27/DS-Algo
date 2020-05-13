package interviewQuestions;

import java.util.*;

public class KthlargestElementinArray {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			
			a[i] = sc.nextInt();
			
			
		}
		
		
		Arrays.sort(a);
		int sum = 0;
		
		if( n < k) {
			
			for(int i = 0; i < n; i++) {
				
				sum = a[i];
			}
			
		 
		}else if (n == k || n > k ) {
		
		for(int i = 0; i<n-k+1; i++) {
			
			sum = a[i];
			
			
		}
		} 
			
			
		
		System.out.println("The Kth largest element is");
		
		System.out.println(sum);

	}

}
