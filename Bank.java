import java.util.*;
public class Bank
{
 public static void main(String args[])
{
 BankAccount obj1 =new BankAccount("Zeba Sayyed","123");
 obj1.showmenu();
}
}
class BankAccount
{
 int balance;
 int previoustransactions;
 String customername;
 String customerid;

  BankAccount(String cname,String cid)
{
customername= cname;
customerid= cid;
}

 void deposit(int amount)
 {
  if(amount !=0)
 {
  balance = balance + amount;
  previoustransactions= amount;
 }
}
 void withdraw(int amount)
{
 if ( amount!= 0 )
{
 balance=balance - amount;
 previoustransactions= -amount;
}
}

 void getprevioustrasaction()
{
 if(previoustransactions >0)
{
 System.out.println("Deposited: " +previoustransactions);
}
else if(previoustransactions < 0)
{
System.out.println("Withdrawn: " + previoustransactions);
}
else
{
 System.out.println("No Transaction Occured");
}
}
 void showmenu()
{
 char option = '\0';
 Scanner sc = new Scanner(System.in);
  System.out.println("Welcome " + customername);
  System.out.println("Your ID is " + customerid); 
  System.out.println("\n");
  System.out.println("A. Check Balance");
  System.out.println("B. Deposited");
  System.out.println("C. Withdraw");
  System.out.println("D. Previous Transaction");
  System.out.println("E. Exit");

  do
{
  System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
  System.out.println("Enter an Option:");
  System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
  option = sc.next().charAt(0);
  System.out.println("\n");
  
  switch(option)
{
 case 'A':
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
          System.out.println("Balance = " + balance);
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
          System.out.println("\n");
          break;   

case 'B':
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
          System.out.println("Enter a Amount to Deposit:"); 
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
          int amount=sc.nextInt();
          deposit(amount);
          System.out.println("\n");
          break;   

case 'C':
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
          System.out.println("Enter a Amount to Withdraw:"); 
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
          int amount2=sc.nextInt();
          withdraw(amount2);
          System.out.println("\n");
          break;   

case 'D':
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
          ; 
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
          System.out.println("\n");
          break;   
case 'E':
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
          break;   

default:
         System.out.println("Invalid Option!!.Please Enter Again");
         break;
}
}
while(option!='E');
System.out.println("Thank You For Using Our Services");
}
}
        









