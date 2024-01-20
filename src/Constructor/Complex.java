package Constructor;
import java.util.Scanner;

class Complexx
{
    private int a;
    private int b;

    public void input()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the whole number: ");
        a=x.nextInt();
        System.out.println("Enter the imaginary number: ");
        b=x.nextInt();

    }
    public Complexx()
    {
        a=1;
        b=3;
    }
    public Complexx(int a1)
    {
        a=a1;
        b=3;
    }
    public Complexx(int a1,int b1 )
    {
        a=a1;
        b=b1;
    }
    public Complexx(Complexx x)
    {
        a= x.a;
        b= x.b;
    }
    public void show()
    {
        System.out.println("The Complex number is : "+a+"+"+b+"i");
    }
}


public class Complex {
    public static void main(String[] args) {
        Complexx c1=new Complexx();
        c1.show();
        Complexx c2=new Complexx(2);
        c2.show();
        Complexx c3=new Complexx(2,5);
        c3.show();
        Complexx c4=new Complexx(c3);
        c4.show();
        Complexx dt=new Complexx();
        dt.input();
        dt.show();
    }
}

