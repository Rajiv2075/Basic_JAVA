class  A1 extends Thread
{
    String nm;
 public A1(String s1)
 {
     nm=new String(s1);
     System.out.println("Constructor of A1");

 }
 public void run()
    {
        int x;
        try
        {
            for (x=1;x<=5;x++)
            {
                System.out.println("Thread:  "+nm+" Value of x = "+x);
                sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread A1 interrupted");
        }
        System.out.println("End of Thread A1");
    }
}

public class TestTh1
{
    public static void main(String[] args) {
        A1 a1=new A1("Sirst");
        A1 a2=new A1("Second");
        A1 a3=new A1("Third");
        a1.start();
        a2.start();
        a3.start();
        int y;
        try
        {
            for (y=10;y>=7;y--)
            {
                System.out.println("Value of y = "+y);
                Thread.sleep(700);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("End of main Thread");
    }
}
