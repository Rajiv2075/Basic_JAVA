package Constructor;
import java.util.Scanner;

class Datee
{
    private int d;
    private int m;
    private int y;
    public void input()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the date: ");
        d=x.nextInt();
        System.out.println("Enter the month: ");
        m=x.nextInt();
        System.out.println("Enter the year: ");
        y=x.nextInt();
    }
    public Datee()
    {
        d=1;
        m=1;
        y=2023;
    }
    public Datee( int d1)
    {
        d=d1;
        m=1;
        y=2023;
    }
    public Datee(int d1,int m1)
    {
        d=d1;
        m=m1;
        y=2023;
    }
    public Datee(int d1,int m1,int y1)
    {
        d=d1;
        m=m1;
        y=y1;
    }
    public Datee(Datee x)
    {
        d= x.d;
        m= x.m;
        y= x.y;
    }
    public void show()
    {
        System.out.println("The Date: "+d+"/"+m+"/"+y);
    }
}


public class Date {
    public static void main(String[] args) {
        Datee dt=new Datee();
        dt.show();
        Datee dt1=new Datee(29);
        dt1.show();
        Datee dt2=new Datee(29,5);
        dt2.show();
        Datee dt3=new Datee(29,5,2024);
        dt3.show();
        Datee dt4=new Datee(dt2);
        dt4.show();
        Datee dt5=new Datee();
        dt5.input();
        dt5.show();
    }
}

