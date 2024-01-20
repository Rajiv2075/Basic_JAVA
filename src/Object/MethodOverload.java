package Object;

class Adh
{
    public Adh(){}
    public void add(int a,int b){
        int s=a+b;
        System.out.println("Result1= "+s);
    }
    public void add(int a,int b,int c){
        int s =a+b+c;
        System.out.println("Result2= "+s);
    }
    public void add(int a,int b,int c,int d){
        int s =a+b+c+d;
        System.out.println("Result4= "+s);
    }
    public void add(int a,int b,int c,int d,int e){
        int s =a+b+c+d+e;
        System.out.println("Result3= "+s);
    }
}
public class MethodOverload {
    public static void main(String[] args) {
        Adh ad=new Adh();
        ad.add(2,5);
        ad.add(2 ,4,5);
        ad.add(3,7,8,6,5);
        ad.add(3,4,5,6);

    }
}
