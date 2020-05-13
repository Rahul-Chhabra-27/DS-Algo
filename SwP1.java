package interviewQuestions;

import java.util.*;

public class SwP1 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a[] = { 1,2,3,4,5,6,7,8,9};
		
		int k= 2;
		
		int sum  = 0;
		for(int i = 0; i < k; i++) {
			
			sum += a[i];
		}
		
		
		int max = sum;
		int start = 0;
		
		for(int i = k ; i <a.length; i++) {
			
			sum = sum + a[i] - a[start];
			
			start++;
			
			
		if(max <= sum) {
				
				
				max = sum;
			}
			
			
			
			
		}
			
			System.out.println(max);
			
			
		
	
		
	
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}


