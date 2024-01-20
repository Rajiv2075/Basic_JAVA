package Inheritance;
class A
{
    public  A(){
        System.out.println("Constructor of A :");
    }
    public  void show1(){
        System.out.println("show1 method of A");
    }
    public void show2(){
        System.out.println("show2 method of A");
    }
}
class B extends A
{
   public B(){
       System.out.println("Constructor of B");
   }
   public void show3(){
       System.out.println("show3 method of B");
   }
   public void show4(){
       System.out.println("show4 method of B");
   }
}
public class Test1 {
    public static void main(String[] args) {
        B b1=new B();
        b1.show3();
        b1.show1();
        b1.show4();
        b1.show2();

    }
}
