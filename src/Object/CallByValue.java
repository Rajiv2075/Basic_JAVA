package Object;


class Aa
{
    private int x;
    private int y;

    public Aa(){
        x=1;
        y=1;
    }
    public Aa(int x1,int y1){
        x=x1;
        y=y1;
    }
    public void show(){
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
    }
    public void swap(int p,int q){
        int r=p;
        p=q;
        q=r;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Aa a1=new Aa(9,6);
        a1.show();
        int m=2,n=3;
        System.out.println("Value of m: "+m);
        System.out.println("Value of n: "+n);
        a1.swap(m,n);
        System.out.println("Value of m: "+m);
        System.out.println("Value of n: "+n);
        a1.show();
    }
}
