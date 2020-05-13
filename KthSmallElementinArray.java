package interviewQuestions;

import java.util.*;

public class KthSmallElementinArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			
			a[i] = sc.nextInt();
			
		}
		
		Arrays.sort(a);
		int sum = 0;
		
		for(int i = 0; i <k; i++) {
			
			sum = a[i];
			
			
			
			
			
		}
		
		
		System.out.println(sum);
		
		
		
		
		

	}

}
