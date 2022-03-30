package oops;

import java.util.Scanner;

public class company {
	
	String companyname, deptname;
	public void setcompany(String cname, String dname)
	{
	companyname=cname;
	deptname=dname;
	}
	public void getcompany()
	{
	System.out.println(companyname);
	System.out.println(deptname);
	}

}

class Employ extends company {
	private int id,salary, deduction, netsalary;
	String name;
	int leaves;
	
	
	public Employ()
	{
		leaves= 2;		
	}
	public Employ(int leave)
	{
		leaves=leave;
	}
	
	public void setdata(int id,String names,int leaves, int salary)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Id, Name, Number of leaves, Salary");
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
