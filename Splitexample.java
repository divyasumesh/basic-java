package oops;

public class Splitexample {

	public static void main(String[] args) {
        
		String name="java-is-interesting-asgdas";
		
		String str1="Hello";
		String str2="hello";
	
		String[] name3=name.split("-");
		System.out.println(name3[2]);
		for(int i=0;i<name3.length;i++)
			System.out.println(name3[i]);
        
		for(String s:name3)
		{
			System.out.println(s);
		}

	}

}
