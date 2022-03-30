package oops;
import java.util.Scanner;

public class students {

	
				private int rollno,mark;
				String name;
				public void setdata()
				{
					Scanner s=new Scanner(System.in);
					System.out.println("Enter Rollno, Name, Mark");
					rollno=s.nextInt();
					name=s.next();
					mark=s.nextInt();		
				}
				public void getdata()
				{
					System.out.println("Rollno:"+rollno);
					System.out.println("Name:"+name);
					System.out.println("Mark:"+mark);
				}
			

	}


