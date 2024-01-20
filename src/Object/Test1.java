package Object;

import java.util.Scanner;

class Arithmetic
{
    private  int real;
    private int img;

    public Arithmetic(){
        real=1;
        img=1;
    }

    public Arithmetic(int r1){
        real=r1;
        img=1;
    }

    public Arithmetic(int r1,int r2){
        real=r1;
        img=r2;
    }

    public Arithmetic(Arithmetic x){
        real=x.real;
        img=x.img;
    }

    public void input(){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Real part: ");
        real=x.nextInt();
        System.out.println("Enter the Imginary part: ");
        img=x.nextInt();
    }

    public void show1(){
        System.out.println("The Complex no= "+real+"+"+img+"i");
    }

    public void add(Arithmetic  x, Arithmetic  y){
        int p=x.real+y.real;
        int q=x.img+y.img;
        System.out.println("The addition of two complex number is : "+p+"+"+q+"i");
    }

    public void sub(Arithmetic  x, Arithmetic  y){
        int p=x.real-y.real;
        int q=x.img-y.img;
        System.out.println("The Subtraction of two complex number is : "+p+"+"+q+"i");
    }

    public void multi(Arithmetic  x, Arithmetic y){
        int p=x.real*y.real;
        int q=x.img*y.img;
        System.out.println("The Multiplication of two complex number is : "+p+"+"+q+"i");
    }

    public void div(Arithmetic  x, Arithmetic  y){
        int p=x.real/y.real;
        int q=x.img/y.img;
        System.out.println("The Division of two complex number is : "+p+"+"+q+"i");
    }

    public void rem(Arithmetic  x, Arithmetic y){
        int p=x.real%y.real;
        int q=x.img%y.img;
        System.out.println("The Remainder of two complex number after division is : "+p+"+"+q+"i");
    }

}
public class Test1 {
    public static void main(String[] args) {

        Arithmetic a2=new Arithmetic();
        a2.input();
        a2.show1();
        Arithmetic a1=new Arithmetic(5,6);
        a1.show1();
        Arithmetic a3=new Arithmetic(3);
        a3.show1();
        a3.add(a1,a2);
        a3.sub(a1,a2);
        a3.multi(a1,a2);
        a3.div(a1,a2);
        a3.rem(a1,a2);
        Arithmetic a4=new Arithmetic(a2);
        a4.show1();
    }





}
