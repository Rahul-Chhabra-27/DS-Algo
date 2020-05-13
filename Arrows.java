package interviewQuestions;

import java.util.Stack;

public class Arrows {

	public static void main(String[] args) {

     int a [] = { 1 , -1 , 2 , -5 , 7 , -6 , -5 , 3 , -5 , 10};
     
     int x = 0;
     boolean flag = true;
     Stack<Integer> s = new Stack<>();
     
     for(int i = 0; i < a.length ; i++) {
    	 
    	 x = a[i];
    	 
       if ( !s.isEmpty() && s.peek() > 0 && x < 0) {
    	   while(!s.isEmpty() && s.peek() > 0 && x < 0) { 
    		   
    	   if (Math.abs(x) ==  Math.abs(s.peek())) {
    		   
    		   s.pop();
    		   flag = false;
    		   
    	   } else if ( Math.abs(x) > Math.abs(s.peek())) {
    	
    			   s.pop();
    		  flag = true;
    		
    	   } else if (Math.abs(x) < Math.abs(s.peek())) {
    		   
    		  flag = false;
    		  break;
    		   
    	   } 
    	   }	   
    		if(flag)  s.push(x) ;
    		   
    	   } else {
    		   
    		   s.push(x);
    	   
    	   
       }
     
     
     
     }
     
     for(int element : s) {
    	 System.out.println(element);
     }

	}

}
