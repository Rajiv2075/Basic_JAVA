package Class;

import java.util.Scanner;

class Datee
{
    private int d;
    private int m;
    private int y;
    public void input()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the date: ");
        d=x.nextInt();
        System.out.println("Enter the month: ");
        m=x.nextInt();
        System.out.println("Enter the year: ");
        y=x.nextInt();
    }
    public void show()
    {
        System.out.println("The Date: "+d+"/"+m+"/"+y);
    }
}


public class Date {
    public static void main(String[] args) {
        Datee dt=new Datee();
        dt.input();
        dt.show();
    }
}
