package oops;

/* another */

import java.util.Scanner;

public class Employees {
	private int id,salary, deduction, netsalary;
	String name;
	int leaves;
	
	
	public Employees()
	{
		leaves= 2;		
	}
	public Employees(int leave)
	{
		leaves=leave;
	}
	
	public void setdata(int id,String names,int leaves, int salary)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employees Id, Name, Number of leaves, Salary");
		id =s.nextInt();
		name=s.next();
		leaves=s.nextInt();
		salary=s.nextInt();		
	}
	
	
	public void getdata()
	{
		calculate(); 
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Number of leaves:"+leaves);
		System.out.println("Salary:"+salary);
		System.out.println("Netsalary:"+netsalary);
	}
	
	public void calculate()
	{
		
		deduction = salary*leaves/30;
		netsalary = salary - deduction;
	}
	


}
