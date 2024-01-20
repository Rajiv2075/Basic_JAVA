package Problem;

public class Gp1 {
    public static void main(String[] args) {
         int a=5000;
         int r=100;
         int n=20;
         int mod=1000000007;

         double x=a*(Math.pow(r,n-1));
        System.out.println(x);

        int v=(int)(x%mod);
        System.out.println(v);
    }
}
