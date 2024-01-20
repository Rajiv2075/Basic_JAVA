package IfWala;

import IfWala.*;
class A
{
    protected int  p=4;
    protected   int x=3;
    public A(){

    }
}
class B extends A
{
    public int j=0;
    public  void show()
    {
        j=super.p+x;
        System.out.println(x);
        System.out.println(p);
        System.out.println(j);
    }
}

public class Declear {
    public static void main(String[] args) {

      B b1=new B();
      b1.show();


    }
}
