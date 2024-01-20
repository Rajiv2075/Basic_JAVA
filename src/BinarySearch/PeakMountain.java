package BinarySearch;

public class PeakMountain {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,7,6,4,2,1};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return end;
    }
}
