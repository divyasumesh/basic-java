package oops;
import java.util.Scanner;

public class constructclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor s1= new constructor();
		constructor s2= new constructor(1200);
		Scanner s=new Scanner(System.in);
		System.out.println("enter rollno,name,mark");
		int r=s.nextInt();
		String n=s.next();
		int m=s.nextInt();	
		s1.setdata(r,n,m);
		float per=s1.getdata();
		System.out.println(per);

	}

}
