package Inheritance;
class M
{
    public  M(){
        System.out.println("Constructor of M :");
    }
    public  void show1(){
        System.out.println("show1 method of M");
    }
    public void show2(){
        System.out.println("show2 method of M");
    }
}
class N extends M
{
    public N(){
        System.out.println("Constructor of N");
    }
    public void show3(){
        System.out.println("show3 method of N");
    }
    public void show4(){
        System.out.println("show4 method of N");
    }
}
class  O extends N
{
    public O(){
        System.out.println("Constructor of O.");
    }
    public void show5(){
        System.out.println("show5 method of O.");
    }
    public void show6(){
        System.out.println("show6 method of O.");
    }
}
public class Test2{
    public static void main(String[] args) {
       O o1=new O();
       o1.show5();
        o1.show1();
        o1.show6();
        o1.show3();
        o1.show2();
        o1.show4();

    }
}
