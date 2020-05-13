package interviewQuestions;

import java.util.*;

public class BFprtc {

	public static void main(String[] args) {

    int a[] = {1,2,3,5,-1,5,-4,-1,2,3};
    int n = a.length;
    int k = 9;
   int count = 0;
		
    boolean found = false;
    
		for(int i = 0; i < n; i++){
			
			int sum = 0;
			
			for(int j = i; j < n ; j++) {
				
				sum += a[j];
				
				if(sum  == k) {
					
					count++;
				}
				
				
				
			}
			
			
			
			
			
			
		}
			
			
		System.out.println("found --->> " + found);
		System.out.println("count --->>" + count);
		
		
		
		

	}

}
