package Constructor;

import java.util.*;

class Interestt
{
    private int p;
    private float r;
    private float t;

    public void input()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("\nEnter the Principle amount: ");
        p=x.nextInt();
        System.out.println("Enter the Rate: ");
        r=x.nextFloat();
        System.out.println("Enter the Time: ");
        t=x.nextFloat();

    }
    public Interestt()
    {
        p=1000;
        r=5;
        t=2;
    }
    public Interestt(int p1)
    {
        p=p1;
        r=5;
        t=2;
    }
    public Interestt(int p1,int r1)
    {
        p=p1;
        r=r1;
        t=2;
    }
    public Interestt(int p1,int r1,int t1)
    {
        p=p1;
        r=r1;
        t=t1;
    }
    public Interestt(Interestt x)
    {
        p= x.p;
        r= x.r;
        t= x.t;
    }
    public void simpleShow()
    {
        System.out.println("\nValue of P: "+p);
        System.out.println("Value of R: "+r);
        System.out.println("Value of T: "+t);
        float c=p*r*t/100;
        System.out.println("The Simple Interest is: "+c);
    }

    public void compoundShow()
    {
        double ci=p*Math.pow((1+r/100),t);
        System.out.println("The Compound Interest is: "+ci);
    }
}


public class Interest {
    public static void main(String[] args) {

        Interestt i1=new Interestt();
        i1.simpleShow();
        i1.compoundShow();

        Interestt i2=new Interestt(10000);
        i2.simpleShow();
        i2.compoundShow();

        Interestt i3=new Interestt(10000,4);
        i3.simpleShow();
        i3.compoundShow();

        Interestt i4=new Interestt(10000,7,3);
        i4.simpleShow();
        i4.compoundShow();

        Interestt i5=new Interestt(i3);
        i5.simpleShow();
        i5.compoundShow();

        Interestt dt=new Interestt();
        dt.input();
        dt.simpleShow();
        dt.compoundShow();
    }
}
