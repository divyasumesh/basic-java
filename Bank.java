package oops;
import java.util.Scanner;

public class Bank {
	
	Scanner s=new Scanner(System.in);
    String name;
    int accno;
    void setdata()
    {
        System.out.println("Enter name");
        name=s.next();
        System.out.println("Enter account no");
        accno=s.nextInt();
    }
   
	
    int balance;
    void deposit()
    {
        
        
        
            int deposit;
            System.out.println("Enter deposit");
            deposit=s.nextInt();
            balance=balance+deposit;
    }
    void withdraw()
    {

    	
        int withdraw_amt;
        System.out.println("Enter withdraw_amt");
        withdraw_amt=s.nextInt();
        balance=balance-withdraw_amt;
        if(withdraw_amt>balance)
        {
            balance=balance+withdraw_amt;
           
        }
       
      }
    
    void getdata()
    {
        System.out.println("Name  : "+name);
        System.out.println("Account number  : "+accno);
        System.out.println("Balance :  "+balance);
    }
    

}

