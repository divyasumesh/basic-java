package oops;

import java.util.Scanner;

public class shapessetget {

	public static void main(String[] args) {
		shapes s1= new shapes();
		square s2= new square();
		rectangle r1= new rectangle();
		
		Scanner s=new Scanner(System.in);
		//s1.area();
		s2.area();
		
        System.out.println("Area of square");
        int a=s.nextInt();
        s2.area(a);
       
        
        System.out.println("Area of rectangle");
        
        int l=s.nextInt();
        int w=s.nextInt();
        r1.area();
       
      

	}

}
