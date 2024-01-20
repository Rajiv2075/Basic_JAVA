package Class;

import java.util.Scanner;

 class Arith{
    private int a;
    private int b;
    public void input()
    {
        Scanner  x=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a=x.nextInt();
        System.out.println("Enter the second number: ");
        b=x.nextInt();
    }
    public void add()
    {
        System.out.println("Result for addition: "+(a+b));
    }
    public void sub()
    {
        System.out.println("Result for subtraction: "+(a-b));
    }
    public void multi()
    {
        System.out.println("Result for Multiplication: "+(a*b));
    }
    public void quot()
    {
        System.out.println("Result for Division: "+(a/b));
    }
    public void remain()
    {
        System.out.println("Result for Remainder: "+(a%b));
    }
}

public class Arithmetic
{
    public static void main(String[] args) {
        Arith a1=new Arith();
        a1.input();
        a1.add();
        a1.sub();
        a1.multi();
        a1.quot();
        a1.remain();
    }
}