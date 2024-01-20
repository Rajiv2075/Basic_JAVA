package Object;

class Add
{
    public Add(){}
    public void add(int a,int b){
        int s=a+b;
        System.out.println("Result1= "+s);
    }
    public void add(int a,float b){
        float s =a+b;
        System.out.println("Result2= "+s);
    }
    public void add(Float a,float b){
        float s =a+b;
        System.out.println("Result4= "+s);
    }
    public void add(float a,int b){
        float s =a+b;
        System.out.println("Result3= "+s);
    }
}
public class MethodOver {
    public static void main(String[] args) {
        Add ad=new Add();
        ad.add(2,5);
        ad.add(2 ,4.8f);
        ad.add(3.5f,7);
        ad.add(3.4f,4.5f);

    }
}
