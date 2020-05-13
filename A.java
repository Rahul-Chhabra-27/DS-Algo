package interviewQuestions;

public class A {

	public static void main(String[] args) {
		int a[] = { 3, -2, -2, 4, 3 ,-1 ,5};
		
		int sum[] = new int[a.length + 1];
		
		int x = 0;
		
		for(int i = 0; i< a.length; i++) {
			
			x += a[i];
			sum[i] = x;
			
			System.out.println(sum[i]);
			
			
		}
			

	}

}
