package LinearSearch;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int [][]arr={
                {2,4,3,6,3},
                {74,64,634,34,23},
                {34,54,65,23,65}
        };
        int target=634;
        int []res=search(arr,target);
        System.out.println("Result: "+ Arrays.toString(res));
    }
    static int[] search(int [][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]){
                    return (new int[]{row,col});
                }
            }
        }
        return (new int[]{-1,-1});
    }
}
