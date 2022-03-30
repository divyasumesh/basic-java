package oops;

public class college {
	
	String collegename;

	public void setcollegename(String name)
	{
	collegename=name;
	}
	public void getcollegename()
	{
	System.out.println(collegename);
	}
}
class teacher extends college{
String teachername;
public void setteachername(String name)
{
teachername=name;
}
public void getteachername()
{
System.out.println(teachername);
}
}

class student extends college{
String studentname;
public void setstudentname(String name)
{
studentname=name;
}
public void getstudentname()
{
System.out.println(studentname);
}
}


