package LinearSearch;

public class CountEven {
    public static void main(String[] args) {
        int [] num={1232,345,32,63,7896};
        int res=findNumbers(num);
       // System.out.println(res);
        int [][]arr={
                {1,2,3},
                {3,23,5},
                {4,8,545}
        };
        int s=check(arr);
        System.out.println(s);
    }
    public static  int findNumbers(int[] nums) {
        int count=0;
        for(int num: nums){
            if(iseven(num)){
                count++;
            }
        }
        return count;
    }
    static boolean iseven(int num){
        int total=digit(num);
        return total % 2 == 0;
    }
    static  int digit(int num){
        int count=0;
        while (num>0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static int check(int [][]account){
       int ans=Integer.MIN_VALUE;
       for(int person=0;person<account.length;person++){
           int sum=0;
           for (int acc=0;acc<account[person].length;acc++){
               sum=sum+account[person][acc];
           }
           if(ans<sum){
               ans=sum;
           }
       }
       return  ans;
    }
}
