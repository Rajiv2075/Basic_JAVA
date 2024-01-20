package Object;
import java.util.Scanner;

class Complex
{
    private int real;
    private int img;

    public Complex(){
        real =1;
        img=1;
    }
    public Complex(int x){
        real=x;
        img=1;
    }
    public Complex(int x,int y){
        real=x;
        img=y;
    }
    public Complex(Complex x){
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
}


public class ObjAssi {
    public static void main(String[] args) {
        Complex c1=new Complex();
        c1.show();
        Complex c2=new Complex(c1);
        c2.show();
        Complex c3=new Complex(5,7);
        c3.show();
        Complex c4=new Complex(5);
        c4.show();
        c4=c3;
        c4.show();
        c1.input();
        c1.show();
    }
}
