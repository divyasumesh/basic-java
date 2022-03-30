package oops;

public class EncapsPerson {
	
	
	private int age;
	private String name;

	public void setAge(int age)
	{
	this.age=age;
	}
	public void setName(String name)
	{
	this.name=name;
	}
	public int getAge()
	{
	return(age);
	}
	public String getName()
	{
	return(name);
	}
	public static void main(String args[])
	{
	EncapsPerson p= new EncapsPerson();
	p.setAge(20);
	p.setName("Divya");
	System.out.println(p.getAge());
	System.out.println(p.getName());
	}
	

}
