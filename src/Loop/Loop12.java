package Loop;

public class Loop12{
    public static void main(String[] args) {

        int s=0;
        for (int i=1;i<=30;i++){
            if(i%2==0){
                s=s+i;

            }
        }
        System.out.println("Sum of Even type number from 1 to 30: "+s);

    }
}
