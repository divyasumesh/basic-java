package oops;

public class Stringclass {

	public static void main(String[] args) {
		
		String name = "Java is interesting";
		
		
		char ch=name.charAt(2);
		System.out.println(ch);
		
		String name1= new String();
		name1="Amy";
		char ch1=name1.charAt(0);
		System.out.println(ch1);
		
		
		
		//Length of the string
		int len=name.length();
		System.out.println(len);
		
		String str="Hello";
	    String str1="World";
	    String str2="Java";
	    String str3=" Java";
		
	    
	    //Concatenation
	    String str4=str.concat(" ").concat(str1).concat(str2).concat(str3);
	    System.out.println(str4);
	    String str5=str.concat(" ").concat(str1).concat(" ").concat(str2).concat(" ").concat(str3);
		System.out.println(str5);
		
		
		
		//Join
		String str6=String.join(" ",str,str1,str2,str3);
		System.out.println(str6);
		
		
		//Comapre
				if(str2.compareTo(str3)==0)
				    { 
					      System.out.println("equal");
				    }
				 if(str2.trim().equals(str3.trim()))
				    {
				    	  System.out.println("equal1");
				    }
				 
				 
				 
		//Subsytring
		 System.out.println(name.substring(3,7));
		 
		 //Contains
		 if(name.contains("Java"))
			{
				  
			 System.out.println(name.toLowerCase());//toLowerCase
				
			}
		 
		 //split
		 String[] namestr=name.split(" ");
		 
		 for(int i=0;i<namestr.length;i++)
				System.out.println(namestr[i]);
		 
		  
		
		
	}

}
