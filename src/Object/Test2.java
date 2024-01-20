package Object;
import java.util.Scanner;
class Arithmetic1
{
    private  int real;
    private int img;
    public Arithmetic1(){
        real=2;
        img=3;
    }
    public Arithmetic1(int r1){
        real=r1;
        img=3;
    }
    public Arithmetic1(int r1, int r2){
        real=r1;
        img=r2;
    }
    public Arithmetic1(Arithmetic1 x){
        real=x.real;
        img=x.img;
    }
    public void input(){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Real part: ");
        real=x.nextInt();
        System.out.println("Enter the Imaginary part: ");
        img=x.nextInt();
    }
    public void show1(){
        System.out.println("The Rational no is = "+real+"/"+img);
    }
    public void add(Arithmetic1 x, Arithmetic1 y){
        int p=(x.real*y.img)+(y.real*x.img);
        int q=x.img*y.img;
        System.out.println("The addition of two complex number is : "+p+"/"+q);
    }
    public void sub(Arithmetic1 x, Arithmetic1 y){
        int p=(x.real*y.img)-(y.real*x.img);
        int q=x.img*y.img;
        System.out.println("The Subtraction of two complex number is : "+p+"/"+q);
    }
    public void multi(Arithmetic1 x, Arithmetic1 y){
        int p=x.real*y.real;
        int q=x.img*y.img;
        System.out.println("The Multiplication of two complex number is : "+p+"/"+q);
    }
    public void div(Arithmetic1 x, Arithmetic1 y){
        int p=x.real*y.img;
        int q=x.img*y.real;
        System.out.println("The Division of two complex number is : "+p+"/"+q);
    }
}
public class Test2 {
    public static void main(String[] args) {
        Arithmetic1 a2=new Arithmetic1();
        a2.input();
        a2.show1();
        Arithmetic1 a1=new Arithmetic1(5,6);
        a1.show1();
        Arithmetic1 a3=new Arithmetic1(3);
        a3.show1();
        a3.add(a1,a2);
        a3.sub(a1,a2);
        a3.multi(a1,a2);
        a3.div(a1,a2);
        Arithmetic1 a4=new Arithmetic1(a2);
        a4.show1();
        a1.add(a1,a1);
    }
}
