package interviewQuestions;

public class Container {

	public static void main(String[] args) {

 int height [] = { 1,8,6,2,5,4,8,3,7};
		
		int n = height.length;
        int right = n-1;
         int left = 0;
 
    
         int area = 0;
         
         while( left < right) {  	 
        	 
  area = Math.max(area,(Math.min( height[left] , height[right]) *( right - left)));
        	 
        	 if( height[left] < height[right]) {
        		 
        		 
        		 left++;
        	 } else {
        		 
        		 right--;
        	 }
        	 
        	 
        	 
         }
   
   
   
   System.out.println(area);
   
		

	}

}
