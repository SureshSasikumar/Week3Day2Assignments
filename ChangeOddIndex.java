package week3.day2.string;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String test = "changeme";

		 // a) Convert the String to character array
		char[] ch = test.toCharArray();

		 // b) Traverse through each character (using loop)
		
		for (int i=0; i<ch.length; i++) {
			//find the odd index within the loop (use modules operator) 
			
			if((i%2)!=0)
			{
				String upper= ""+ch[i];
				System.out.print(upper.toUpperCase());
			
					
			}
			else
			{
				String lower= ""+ch[i];
				System.out.print(lower.toLowerCase());
				
			}
		
		 
	}
	}

}
