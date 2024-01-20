package Class;

import java.util.Scanner;

class Timee
{
    private int h;
    private int m;
    private int s;
    public void input()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Hour: ");
        h=x.nextInt();
        System.out.println("Enter the Minute: ");
        m=x.nextInt();
        System.out.println("Enter the Second: ");
        s=x.nextInt();
    }
    public void show()
    {
        System.out.println("The Time: "+h+":"+m+":"+s);
    }
}


public class Time {
    public static void main(String[] args) {
        Timee dt=new Timee();
        dt.input();
        dt.show();

    }
}
