package week3.day2.arrays;

import java.util.Arrays;

public class FindMissingElement {


		public static void main(String[] args) {
			// Here is the input
			int[] arr = {1,2,3,4,7,6,8};
	     
			int sum1=0,sum2=0;
			
			for (int i=1; i<=8; i++) {
			
				sum1 = sum1+i;
			
			}
			//System.out.println(sum1);
			for (int i=0; i<arr.length; i++) {
				
				sum2 = sum2+arr[i];
				
			}
			//System.out.println(sum2);
				int m =sum1-sum2;
				System.out.println("The missing number is:"+ m);
			
			
			
		}
}