package Object;

import java.util.Scanner;

class Time
{
    private int h;
    private int m;
    private int s;
    public Time() {
        h=0;
        m=0;
        s=0;
    }

    public Time(int h) {
        this.h = h;
        m=0;
        s=0;
    }
    public Time(int h1,int m1){
        h=h1;
        m=m1;
        s=0;
    }
    public Time(int h1,int m1,int s1){
        h=h1;
        m=m1;
        s=s1;
    }
    public Time(Time x){
        h=x.h;
        m= x.m;
        s= x.s;
    }

    public void input(){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the hour: ");
        h=x.nextInt();
        System.out.println("Enter the minute: ");
        m=x.nextInt();
        System.out.println("Enter the Second: ");
        s= x.nextInt();
    }
    public void show(){
        System.out.println("The Time is : "+h+":"+m+":"+s);
    }

    public void add(Time x,Time y){
        h=x.h+y.h;
        m=x.m+ y.m;
        s= x.s+y.s;
        if(s>60){
            s=s%60;
            m++;
        }
        if(m>60){
            m=m%60;
            h++;
        }
        if(h>12){
            h=h%12;


        }
        System.out.println("The Time is : "+h+":"+m+":"+s);
    }

}
public class Test3 {
    public static void main(String[] args) {
        Time t1=new Time();
        t1.input();
        t1.show();
        Time t2=new Time(5,56,40);
        t2.show();
        Time t3=new Time();
        t3.add(t1,t2);
    }
}
