

public class SearchBinary {
    public static void main(String[] args) {
        int []arr={-9,-8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8,9};
        int target=0;
        int ans=binary(arr,target);
        System.out.println(ans);
    }
    static int binary(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = start + 1;
            else
                return mid;
        }
        return -1;
    }
}
