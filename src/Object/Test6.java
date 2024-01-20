package Object;

import java.util.Scanner;

class Bank
{
    private int acc;
    private String name;
    private String type;
    private int bal;
    private String add;
    public Bank(){
        acc=1;
        name=new String();
        type=new String();
        bal=0;
        add=new String();
    }
    public Bank(int ac,String nm,String tpe,int bl,String ad){
        acc=ac;
        name=new String(nm);
        type=new String(tpe);
        bal=bl;
        add=new String(ad);
    }
    public Bank(Bank x){
        acc=x.acc;
        name=new String(x.name);
        type=new String(x.type);
        bal=x.bal;
        add=new String(x.add);
    }
    public void input(){
        System.out.println("---------------------------------------------------------------------------");
        Scanner x=new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        acc=x.nextInt();
        System.out.println("Enter Customer Name: ");
        name=x.next();
        System.out.println("Enter Account Type: ");
        type= x.next();
        System.out.println("Enter Account Balance amount: ");
        bal= x.nextInt();
        System.out.println("Enter Customer Address: ");
        add=x.next();
    }
    public void show(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Customer Details: ");
        System.out.println("Customer Account no: "+acc);
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Account Type: "+type);
        System.out.println("Customer Bank Balance: "+bal);
        System.out.println("Customer Address: "+add);
    }
    public void enquiry(){
        System.out.println("Your account balance is : "+bal);
    }
    public void deposit(int x){
        bal=bal+x;
        System.out.println("Your current balance is : "+bal);
    }
    public void withdraw(int x){
        if(bal<x){
            System.out.println("Your account Balance is low so can't withdraw.");
        }
        else {
            bal=bal-x;
            System.out.println("Your remaining balance is: "+bal);
        }
    }

}
public class Test6 {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.input();
        b1.show();
        b1.enquiry();
        b1.deposit(5000);
        b1.withdraw(500);

        Bank b2=new Bank(12,"Raja","Saving",200,"muz");
        b2.show();
        b2.enquiry();b2.deposit(400);
        b2.withdraw(5000);

        Bank b3=new Bank(b1);
        b3.show();

    }
}
