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
    public void add(Complex x, Complex y){
        real=x.real+y.real;
        img=x.img+y.img;
    }
}


public class PassObj {
    public static void main(String[] args) {
        Complex c1=new Complex(2,3);
        c1.show();
        Complex c3=new Complex(5,7);
        c3.show();
        Complex c4=new Complex();
        c4.show();
        c4.add(c1,c3);
        c4.show();

    }
}
