import java.util.Scanner;

class Complexx
{
    private int real;
    private int img;

    public Complexx(){
        real =1;
        img=1;
    }
    public Complexx(int x){
        real=x;
        img=1;
    }
    public Complexx(int x,int y){
        real=x;
        img=y;
    }
    public Complexx(Complexx x){
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
    public void add(Complexx x){
        real=x.real+real;
        img=x.img+img;
    }
}


public class PassSingle {
    public static void main(String[] args) {
        Complexx c1=new Complexx(2,3);
        c1.show();
        Complexx c3=new Complexx(5,7);
        c3.show();
        Complexx c4=new Complexx();
        c4.show();
        c3.add(c1);
        c3.show();

    }
}
