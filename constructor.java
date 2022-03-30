package oops;

public class constructor {
	int rollno,mark;
	String name;
	int total;
	
	public constructor()
	{
		total=1000;		
	}
	public constructor(int tot)
	{
		total=tot;
	}
	public constructor(float tot)
	{
		total=(int)tot;
		
	}
	public void setdata(int r,String n,int m)
	{
		rollno=r;
		name=n;
		mark=m;
	}
			
   public float getdata()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Mark:"+mark);
		float percentage=mark*100/total;
		return(percentage);
	}

}
