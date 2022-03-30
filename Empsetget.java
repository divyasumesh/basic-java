package oops;
import java.util.Scanner;
public class Empsetget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e1= new Employee();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of leaves");
		
	    int leaves=s.nextInt();
		
		
		
        
		e1.calculate();
		e1.getdata();
		
		
		//Employee e2= new Employee();
		//e1.setdata();
		//e2.setdata();
		
		//e2.getdata();
		
	  
		

	}

}
