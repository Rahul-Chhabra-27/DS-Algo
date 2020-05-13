package interviewQuestions;

import java.util.*;

public class BruteForce2 {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
//		This question is most important for interview purpose :
//		This question comprises two questions  :-
		
//		1 - In this question we have to check  whether sum of continous subarray
//		is equal to k;

		
		int a[] = {1,2,3,5,-1,5,-4,-1,2,3};
		int k = sc.nextInt();
		boolean found = false;
		int sum = 0;
		
		Set<Integer> s = new HashSet<>();
		
		for(int elements : a) {
			
			s.add(sum);
			
			sum += elements;
			
			if(s.contains(sum - k)) {
				
				found = true;
				break;
			}	
			
			
		}
		
		
		System.out.println("Found--->>> " + found);
		
		
		
		
		
		
		
		
		
		
		

	}

}
