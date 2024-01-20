package Class;

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
    public void show()
    {
        System.out.println("The Rational number is: "+p+"/"+q);
    }
}


public class Rational {
    public static void main(String[] args) {
        Rationall dt=new Rationall();
        dt.input();
        dt.show();
    }
}
