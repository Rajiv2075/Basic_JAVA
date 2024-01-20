import java.util.Scanner;

class Complex1
{
    private int real;
    private int img;

    public Complex1(){
        real =1;
        img=1;
    }
    public Complex1(int x){
        real=x;
        img=1;
    }
    public Complex1(int x, int y){
        real=x;
        img=y;
    }
    public Complex1(Complex1 x){
        real=x.real;
        img= x.img;
    }
    public void input(){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the real part: ");
        real=x.nextInt();
        System.out.println("Enter the imaginary part: ");
        img=x.nextInt();
    }
    public void show(){
        System.out.println("The Complex No: "+real+"+"+img+"i");
    }
    public Complex1 add(Complex1 x, Complex1 y){
        Complex1 z=new Complex1();
        z.real=x.real+y.real;
        z.img=x.img+y.img;
        return z;
    }
}


public class ReturningObj {
    public static void main(String[] args) {
        Complex1 c1=new Complex1(2,3);
        c1.show();
        Complex1 c2=new Complex1(5,7);
        c2.show();
        Complex1 c3=new Complex1();
        c3.show();
        c3=c3.add(c3,c3);
        c3.show();
    }
}