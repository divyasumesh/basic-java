package oops;

public abstract class Abstractsample {
	public String fname= "Divya";
	public int age=25;
	public abstract void study();

}
class stud extends Abstractsample {
	public int graduationYear= 2018;
	public void study(){
		System.out.println("Studying all day");
	}
	
}
