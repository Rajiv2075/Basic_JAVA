class A
{
    private int x;
    private int y;
    public A(int x1,int y1){
        x=x1;
        y=y1;
    }
    public void show() {
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
    }
}

class B extends A
{
    private int z;
    public B(int x1,int y1,int z1){
        super(x1,y1);
        z=z1;
    }
    public void display(){
        System.out.println("Value of z= "+z);
    }
}

public class Super1 {
    public static void main(String[] args) {
        B b1=new B(9,6,2);
        b1.show();
        b1.display();
        System.out.println("Address= "+ b1.hashCode());
    }
}
