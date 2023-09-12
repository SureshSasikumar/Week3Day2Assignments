package week3.day2.string;

import org.apache.xmlbeans.impl.soap.Text;

public class RemoveDuplicates {   //remove duplicate string from the given line
	

		public static void main(String[] args) {
		
		
			String text ="We learn java basics as part of java sessions in java week1";
			int count;
			
			//convert the string into lowercase
			
			text = text.toLowerCase();
			
			//Split the string
			String words[] = text.split(" ");
		
			
			for (int i=0; i<words.length; i++) {
				
				count=1;
				if(words[i]!="0") {
					for (int j=i+1; j<words.length; j++) {
						if(words[i].equals(words[j])) {
							count++;
							//set word[i] to 0 to avoid printing visited word 
							words [j]="0";	
					
		}
			
		}
			}
				if (count>1) {
					System.out.println(words[i]);
			}		
			
		}
			
		}
			
}
	
