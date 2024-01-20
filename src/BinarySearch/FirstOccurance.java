package BinarySearch;

public class FirstOccurance {
    public static void main(String[] args) {
        int []arr={1,2,5,6,7,5,4,4,3,3,3,3,3,3,3,3,1};
        int target=3;
//        int ans=findInMountainArray(target,arr);
//        System.out.println(ans);
        System.out.println(Math.round(2.25));
    }

    public static int findInMountainArray(int target, int [] mountainArr) {
        int peak=peakIndexInMountainArray(mountainArr);
        int ans=order(mountainArr,target,0,peak);
        if(ans!=-1)
            return ans;
        return order(mountainArr,target,peak+1,mountainArr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return end;
    }

    static int order(int []arr,int target,int start,int end){
        int x=-1;
        boolean check=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                x=mid;
            }
            if(check){
                if(target<arr[mid])
                    end=mid-1;
                else if(target==arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }else {
                if(target<arr[mid])
                    start=mid+1;
                else if(target==arr[mid])
                    end=mid-1;
                else
                    end=mid-1;
            }
        }

        return x;
    }

}
