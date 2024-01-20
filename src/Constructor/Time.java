package Constructor;

import java.util.Scanner;

class Timee
{
    private int h;
    private int m;
    private int s;
    public void input()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Hour: ");
        h=x.nextInt();
        System.out.println("Enter the Minute: ");
        m=x.nextInt();
        System.out.println("Enter the Second: ");
        s=x.nextInt();
    }
    public Timee()
    {
        h=12;
        m=12;
        s=12;
    }
    public Timee(int h1)
    {
        h=h1;
        m=12;
        s=12;
    }
    public Timee(int h1,int m1)
    {
        h=h1;
        m=m1;
        s=12;
    }
    public Timee(int h1,int m1,int s1)
    {
        h=h1;
        m=m1;
        s=s1;
    }
    public Timee(Timee x)
    {
        h=x.h;
        m=x.m;
        s=x.s;
    }
    public void show()
    {
        System.out.println("The Time: "+h+":"+m+":"+s);
    }
}


public class Time {
    public static void main(String[] args) {
        Timee t1=new Timee();
        t1.show();
        Timee t2=new Timee(11);
        t2.show();
        Timee t3=new Timee(11 ,11);
        t3.show();
        Timee t4=new Timee(11,11,11);
        t4.show();
        Timee t5=new Timee(t3);
        t5.show();

        Timee dt=new Timee();
        dt.input();
        dt.show();



    }
}

