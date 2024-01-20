class  A12 extends Thread
{
     public A12()
    {}
    public void run()
    {
        int x;
        try
        {
            for (x=1;x<=5;x++)
            {
                System.out.println("Value of x = "+x);
                sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread A12 interrupted");
        }
        System.out.println("End of Thread A12");
    }
}
class  B12 extends Thread
{
    public B12()
    {}
    public void run()
    {
        int y;
        try
        {
            for (y=10;y>=6;y--)
            {
                System.out.println("Value of y = "+y);
                sleep(700);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread B12 interrupted");
        }
        System.out.println("End of Thread B12");
    }
}
class  C extends Thread
{
    public C()
    {}
    public void run()
    {
        int z;
        try
        {
            for (z=101;z<=105;z++)
            {
                System.out.println("Value of z = "+z);
                sleep(400);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread C interrupted");
        }
        System.out.println("End of Thread C");
    }
}
public class Testth2 {
    public static void main(String[] args) {

        A12 a1 = new A12();
        B12 b1 = new B12();
        C c1 = new C();
        a1.start();
        b1.start();
        c1.start();
        a1.setPriority(3);
        b1.setPriority(6);
        c1.setPriority(9);

        int w;
        try {
            for (w = 10; w >= 7; w--) {
                System.out.println("Value of w = " + w);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("End of main Thread");

    }
}
