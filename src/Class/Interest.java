package Class;

import java.util.*;

class Interestt
{
    private int p;
    private float r;
    private float t;

    public void input()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Principle amount: ");
        p=x.nextInt();
        System.out.println("Enter the Rate: ");
        r=x.nextFloat();
        System.out.println("Enter the Time: ");
        t=x.nextFloat();

    }
    public void simpleShow()
    {
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
        Interestt dt=new Interestt();
        dt.input();
        dt.simpleShow();
        dt.compoundShow();
    }
}
