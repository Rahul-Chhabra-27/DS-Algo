package interviewQuestions;

public class FindMajorityElement2 {

	public static void main(String[] args) {
		
		int a [] = {5,5,0,0,5,5,4,5,3};
		
		int n = a.length;
		int e1 = 0;
		int c1 = 0;
		for(int i = 0; i < n; i++) {
			
		if (c1 == 0) {
			
			e1 = a[i];
		}
		
		if(a[i] == e1) {
			
			c1++;
		} else {
			
			c1--;
		}
		
		
		
		
		
		}	
		c1 = 0;

		for(int i = 0; i < n; i++) {
			
			if (a[i] == e1) {
				c1++;
			}
			
		}
		
		if ( c1 >  n/2) {
			System.out.println(e1);
		}
	}

}
