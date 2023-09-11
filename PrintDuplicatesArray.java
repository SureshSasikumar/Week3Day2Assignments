//FindDublicateValue
package week3.day2.assignment4;

public class PrintDuplicatesArray {
	
	public static void main(String[] args) {
		
	
		
		//Declare an array
			int a[] = {1,2,4,1,6,8,2,};
			//Find duplicate from the above list
			
			
			for (int i=0; i<=a.length-1; i++) {
				for (int j=i+1; j<=a.length-1; j++) 
				{
					if (a[i]==a[j]) 
					{
						System.out.println(a[i]);
					}
				}
			
			}
		}
	}
					
				
			
		
		