package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
     int [] nums = {5,6,8,9,11,13,16,18};
     int target =6;
     int pivot=peakIndexInMountainArray(nums);
     System.out.println(pivot);
     if(pivot!=-1){
            int ans=first(nums,target,true,0,pivot);
            if(ans==-1){
                int ans1=first(nums,target,false,pivot+1, nums.length-1);
                System.out.println("ans1 "+ans1);
             }
          System.out.println("ans"+ans);
        }

    }

    public static int first(int []nums,int target,boolean ischeck,int start,int end){
        int x=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ischeck) {
                if (target == nums[mid]) {
                    x = mid;
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else{
                if (target == nums[mid]) {
                    x = mid;
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return x;
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
