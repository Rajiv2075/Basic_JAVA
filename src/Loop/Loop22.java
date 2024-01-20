package Loop;

public class Loop22{
    public static void main(String[] args) {

        long s=1;
        for (int i=2;i<=30;i++){
            if(i%2==1){
                s=s*i;

            }
        }
        System.out.println("Product of all Odd  number from 2 to 30: "+s);

    }
}
