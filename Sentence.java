package oops;

public class Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question : Accept a sentence  and display no of words, no of characters, no of spaces and no of vowels 
		
		
		String name = "Java is simple and robust";
		
		//Number of characters
		int len=name.length();
		System.out.println("Number of Characters : "+len);
		
		
		
		//Number of Words
		 String[] words = name.split("\\s+");
	     System.out.println("Number of words : "+words.length);
	     
	     //Number of Spaces
	     
	     String[] split = name.split(" ");
	     System.out.println("Number of spaces : "+split.length); 
	     
	     //Number of Vowels
	       int vcount=0;
	     
	       for (int i = 0; i < name.length(); i++) {
	       char ch = name.charAt(i);

	       
	       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	         vcount++;
	        
	       }
	      
	      }
	       System.out.println("Number of Vowels : "+vcount);
	}

}
