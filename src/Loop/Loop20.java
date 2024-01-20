package Loop;

public class Loop20{
    public static void main(String[] args) {

        long s=1;
        for (int i=1;i<=30;i++){
            if(i%2==1){
                s=s*i;

            }
        }
        System.out.println("Product of Odd type number from 1 to 30: "+s);

    }
}
