package BinarySearch;
import java.util.*;

public class FirstAndLast {
    public static void main(String[] args) {

    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int target) {
        // Write your code here.
        int x=-1,y=-1;
        int n1=arr.size();
        for(int i=0;i<n1;i++){
            if(target==arr.get(i)){
                x=i;
            }
            if(target==arr.get(n1-1-i)){
                y=n1-1-i;
            }
        }
        return new int[]{y,x};
    }
}
