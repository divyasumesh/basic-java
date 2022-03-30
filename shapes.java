package oops;

public class shapes {

	int area;int l,w;
	
	public void area()
	{
	System.out.println("Display the area");
	}
	
}
class square extends shapes{
	public void area(int a)
	{
	
	area = a;
	a=a*a;
	System.out.println("Area of the square is "+a);
	}
}
class rectangle extends shapes{
	public void area(int b,int l,int w)
	{
	
    area= b;
	b =l * w;
	System.out.println("Area is "+b);
	}
}
