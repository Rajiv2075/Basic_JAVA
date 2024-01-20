package BinarySearch;

public class Celing {
    public static void main(String[] args) {
        int []arr={1,2,3,8,9};
        int target=7;
        int ans=check(arr,target);
        System.out.println(ans);
    }
    public static int check(int []arr,int target){
        int start=0,end=arr.length-1;
        int x=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=target){
                x=arr[mid];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        // return x;      // approach 1 and below approach 2
        return arr[start];
    }
}
