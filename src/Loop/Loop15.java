package Loop;

public class Loop15{
    public static void main(String[] args) {

        int s=0;
        for (int i=2;i<=30;i++){
            if(i%2==1){
                s=s+i;

            }
        }
        System.out.println("Sum of all Odd  number from 2 to 30: "+s);

    }
}
