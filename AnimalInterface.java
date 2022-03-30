package oops;

public interface AnimalInterface {

	public void sound();
	public void eat();

}
interface mammal {
public void sound();
public void child();
}

class dogs implements AnimalInterface,mammal{

	public void sound(){
		System.out.println("Bow Bow");

    }
    public void eat(){
    	System.out.println("Dogs eat meat");

    }
   public void child()
   {
   }
}

class cats implements AnimalInterface,mammal{

	public void sound(){
		System.out.println("Meow Meow");

    }
    public void eat(){
    	System.out.println("Cat eats meat");
    }
   public void child()
   {
	   System.out.println("Kitten");
   }
}
