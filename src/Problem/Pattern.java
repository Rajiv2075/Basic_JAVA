package Problem;

public class Pattern {
    public static void main(String[] args) {
        int n=10;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==j||i==n+1-j){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
            System.out.print("  ");
        }
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i-1;j++){
            System.out.print("  ");
        }
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
