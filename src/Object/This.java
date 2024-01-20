package Object;

class A
{
    private int x;
    private int y;

    public A(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void show(){
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
    }
}

public class This {
    public static void main(String[] args) {
        A a1=new A(9,6);
        a1.show();
    }
}
