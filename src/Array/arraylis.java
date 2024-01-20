package Array;
import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class arraylis {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(15);
        int k=4;
        int ans=maximumChocolates(arr,k);
        System.out.println(ans);

    }
    public static int maximumChocolates(ArrayList<Integer> arr,int k){
        // Write your code here.
        int sum=0;
        int mod=1000000007;
        for (int i = 0; i < k ; i++) {
            int a=getIndex(arr);
            int x=arr.get(a);
            sum=((sum%mod)+x)%mod;
            arr.set(a,x/2);
        }
        return sum;
    }

    public static int getIndex(ArrayList<Integer> arr){
        int n=arr.size();
        int index=0;
        int max=arr.get(0);
        for(int i=0;i<n;i++){
            if(max<arr.get(i)){
                max=arr.get(i);
               index=i;
            }
        }
       // System.out.println(max);
        return index;
    }
}
