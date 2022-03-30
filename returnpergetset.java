package oops;

import java.util.Scanner;

public class returnpergetset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    retunperc s1= new retunperc();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Rollno, Name, Mark");
			int r= s.nextInt();
			String n= s.next();
			int m= s.nextInt();
			
			s1.setdata(r, n, m);
			float per = s1.getdata();
			System.out.println("Percentage is " + per);
	}

}
