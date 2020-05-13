package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class BruteForces {

	public static void main(String[] args) {
		
//		o(n2) solution :
//      This method is used to find out the number of possible subarray 
//		whose sum is equal to k in  an
//		given array.
		
		int a [] = {0,0,0,0,0,0,0,0,0,0};
		int n = a.length;
		int max = 0 ;
		int k = 0;
		boolean found = false;
		for(int i = 0 ;i <n;i++){
			int sum = 0;
			for(int j = i; j < n; j++){
				
				sum += a[j];
				
				if(sum == 0 ) {
					max++;;
				
			
				
					
				} 
			}
			
		}
	
			System.out.println("Found --->>> " + max);
		
//		Brute Forces method o(n) : 
//		Most Important for Interview!
//	  This method is used to check whether the sum of the subarray 
//			is equal to zero or not :	
		
//		Set<Integer> s = new HashSet<>();
//		
//		int sum = 0	;
//		boolean found = false;
//		
//		for(int element : a) {
//			
//			s.add(sum);
//			sum += element;
//			
//		if(s.contains(sum)){
//			
//			found = true;
//			break;
//			
//		}
//				
//		}
//		
//		
//		System.out.println("Found --->>> " + found);

	}

}
