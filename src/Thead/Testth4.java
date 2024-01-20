class M1
{
    synchronized public void show(String str)
    {
        System.out.print("[");
        try
        {
            System.out.print(str);
            Thread.sleep(500);
        }
            catch (InterruptedException e)
    {
        System.out.println("M thread interrupted");
    }
        System.out.println("]");
}
}

class N101 extends Thread
{
    String s1;
    M1 a1;
    public N101(String msg,M1 p)
    {
        s1=new String(msg);
        a1=p;
        start();
    }
    public void run()
    {
        a1.show(s1);
    }
}



public class Testth4 {
    public static void main(String[] args) {
        M1 m1=new M1();
        N101 n1=new N101("Hello",m1);
        N101 n2=new N101("Nice",m1);
        N101 n3=new N101("Day",m1);

    }
}
