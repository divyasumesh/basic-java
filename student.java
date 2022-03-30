package oops;


public class student {
	private int rollno,mark;
	String name;
	public void setdata(int r, String n, int m)
	{
		
		rollno= r;
		name= n;
		mark= m;	
	}
	public void getdata()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Mark:"+mark);
	}

}
