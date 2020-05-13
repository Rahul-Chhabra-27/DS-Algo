package interviewQuestions;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		
		int a[] = {-1, 4, -2, -4, -1, -3, -5, -6};
		int n = a.length;
		
		int max = Integer.MIN_VALUE;
		int cursum = 0;
		
		for(int i = 0; i < n; i++) {
			
			  cursum += a[i];
			
			  if(cursum > max) {
				
				max = cursum;
			}
			
			 if(cursum < 0) {
				
				 cursum = 0;
			}
			
		}
		
		System.out.println(max);

	}

}
