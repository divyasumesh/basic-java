package oops;

import java.util.Scanner;

public class studentgetset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1= new student();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rollno, Name, Mark");
		int r= s.nextInt();
		String n= s.next();
		int m= s.nextInt();
		
		s1.setdata(r, n, m);
		s1.getdata();
	}

}
