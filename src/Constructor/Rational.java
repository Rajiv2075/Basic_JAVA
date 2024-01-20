package Constructor;
import java.util.Scanner;

class Rationall
{
    private int p;
    private int q;

    public void input()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the numerator value: ");
        p=x.nextInt();
        System.out.println("Enter the Denominator value: ");
        q=x.nextInt();

    }
    public Rationall()
    {
        p=3;
        q=4;
    }
    public Rationall(int p1)
    {
        p=p1;
        q=4;
    }
    public Rationall(int p1,int q1)
    {
        p=p1;
        q=q1;
    }
    public Rationall(Rationall x)
    {
        p= x.p;
        q= x.q;
    }
    public void show()
    {
        System.out.println("The Rational number is: "+p+"/"+q);
    }
}


public class Rational {
    public static void main(String[] args) {
        Rationall r1=new Rationall();
        r1.show();
        Rationall r2=new Rationall(5);
        r2.show();
        Rationall r3=new Rationall(5,9);
        r3.show();
        Rationall r4=new Rationall(r2);
        r4.show();
        Rationall dt=new Rationall();
        dt.input();
        dt.show();
    }
}

