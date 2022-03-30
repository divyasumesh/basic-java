package oops;

public abstract class animal {
	
	String name;
	public abstract void sound();
	//{
	//System.out.println("Animal Sound");
	//}
	public void eat()
	{
	System.out.println("animal eats");
	}
	}

	class dog extends animal
	{
	public void sound()
	{
	//super.sound();
	System.out.println("Bow Bow");
	}
	}


	class cat extends animal
	{
	public void sound()
	{

	}

}
