package interviewQuestions;

public class FindMajorityElement {

	public static void main(String[] args) {
	
		
		int a [] = {2,2,2,1,3,2,1,1};
		
		int n = a.length;
		
		int e1 = a[0];
		int c1 = 1;
		
		int e2 = 0;
		int c2 = 0;
		
		
		for(int i = 1; i <n; i++) {
			
			if( a[i] == e1) {
				c1++;
			
			} else if( a[i] == e2) {
				
				c2++;
				
			} else if (c2 == 0) {
				
				e2 = a[i];
				
				
			} else {
				
				c1--;
				c2--;
			}
		}
			c1 = c2 = 0;
		 for(int i = 0; i < n; i++) {
			 
			 if(a[i] == e1) c1++;
			 
			 else if( a[i] == e2) c2++;
		 }
			
			
			
			if( c1 > n/3) {
			System.out.println(e1);
			
			}
			
			 if(c2 > n/3) {
				
				System.out.println(e2);
				
			}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			
		}
		
		
		
		
		
		
		
		
		

	}


