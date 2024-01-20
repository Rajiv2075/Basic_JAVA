package Object;

class Ab
{
    private int x;
    private int y;

    public Ab(){
        x=1;
        y=1;
    }
    public Ab(int x1,int y1){
        x=x1;
        y=y1;
    }
    public void show(){
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
    }
    public void swap(Ab p){
        int r=p.x;
        p.x=p.y;
        p.y=r;
    }
}

public class CallByReference {
    public static void main(String[] args) {
        Ab a1=new Ab(9,6);
        a1.show();
      Ab a2=new Ab(5,7);
      a2.show();
      a1.swap(a2);
      a1.show();
      a2.show();
      a1.swap(a1);
      a1.show();
    }
}


