package oops;

public class Car {
	
	String color;
	
	public Car(String c) {
		color = c;
	}
	
	public static void main(String[] args) {
		
		Car toyota = new Car("red");
		System.out.println(toyota.color);
		
		Car nissan = new Car("Black");
		System.out.println(nissan.color);
		
		
	}
	

}
