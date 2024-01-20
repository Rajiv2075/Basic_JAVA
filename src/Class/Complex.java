package Class;

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
    public void show()
    {
        System.out.println("The Complex number is : "+a+"+"+b+"i");
    }
}


public class Complex {
    public static void main(String[] args) {
        Complexx dt=new Complexx();
        dt.input();
        dt.show();
    }
}
