package interviewQuestions;

import java.util.Scanner;

public class ReverseofArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of an array");
		
		int n = sc.nextInt();
		
		int a[] = new int[n]; 
		
		System.out.println("Enter array's Elements");
		
		for(int i = 0; i< n; i++) {
			
			a[i] = sc.nextInt();
		}
		
		// Reverse the full array.
//		int start = 0;
//		int end = n-1;
//		
//		int temp = 0;
//		
//		while(start < end) {
//			
//			temp = a[start];
//			a[start] = a[end];
//			a[end] = temp;
//			
//			
//			start++;
//			end--;
//			
//			
//			
//			
//		}
		
		// Reverse in a given size
		
//		int k = sc.nextInt();
//		
//		int temp = 0;
//		
//		int start = 0;
//		int end = k-1;
//		
//		while(start < end) {
//			
//			temp = a[start];
//			a[start] = a[end];
//			a[end] = temp;
//			
//			start++;
//			end--;
//			
//				
//		}
//		
//		
		
		System.out.println("Reverse Array");
		for(int x : a) {
			System.out.println(x);
		}
		

	}

}
