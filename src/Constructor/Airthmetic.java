package Constructor;

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
    public Arith()
    {
        a=1;
        b=1;
    }
    public Arith(int a1)
    {
        a=a1;
        b=1;
    }
    public Arith(int a1,int b1)
    {
        a=a1;
        b=b1;
    }
    public Arith(Arith x)
    {
        a= x.a;
        b= x.b;
    }

    public void add()
    {
        System.out.println("\nValue of A: "+a);
        System.out.println("Value of B: "+b);
        System.out.println("Result for addition: "+(a+b));
    }
    public void sub()
    {
        System.out.println("\nValue of A: "+a);
        System.out.println("Value of B: "+b);
        System.out.println("Result for subtraction: "+(a-b));
    }
    public void multi()
    {
        System.out.println("\nValue of A: "+a);
        System.out.println("Value of B: "+b);
        System.out.println("Result for Multiplication: "+(a*b));
    }
    public void quot()
    {
        System.out.println("\nValue of A: "+a);
        System.out.println("Value of B: "+b);
        System.out.println("Result for Division: "+(a/b));
    }
    public void remain()
    {
        System.out.println("\nValue of A: "+a);
        System.out.println("Value of B: "+b);
        System.out.println("Result for Remainder: "+(a%b));
    }
}

 class Arithmetic
{
    public static void main(String[] args) {
       Arith a1=new Arith();
       a1.add();
       Arith a2=new Arith(3);
       a2.multi();
       Arith a3=new Arith(9,4);
       a3.quot();
       Arith a4=new Arith(a2);
       a4.remain();
        Arith a=new Arith();
        a1.input();
        a1.add();
        a1.sub();
        a1.multi();
        a1.quot();
        a1.remain();
    }
}
