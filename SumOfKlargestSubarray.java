package interviewQuestions;

import java.util.Scanner;

public class SumOfKlargestSubarray {

	public static void main(String[] args) {
		
		
		
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		int k = sc.nextInt();
		
		int a [] = new int[n];
		
		
		for(int i = 0; i <n ; i++) {
			
			
			a[i] = sc.nextInt();
			
		}	
			
			int i = 0;
			int start = 0;
			for(; i<k ; i++) {
				
			sum = sum + a[i];	
			
			}	
			
			int max = sum;
				
				for(; i <n; i++) {
					
					
				sum = sum + a[i] - a[start]	;
					
			
					
					start++;
					
					if(sum > max) {
						
						max = sum;
					}
					
					
				}
			
		
		System.out.println(max);
		
		
		
		
		
		
		

	}

}
