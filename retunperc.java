package oops;

public class retunperc {
	private int rollno,mark;
	String name;
	public void setdata(int r, String n, int m)
	{
		
		rollno= r;
		name= n;
		mark= m;	
	}
	public float getdata()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Mark:"+mark);
		
		float per = mark*100/1000;
		return (per);
	}

}
