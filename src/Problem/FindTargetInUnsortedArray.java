package Problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTargetInUnsortedArray {
    public static void main(String[] args) {

        System.out.println((-5%3));
        System.out.println((-5/3));


        int []nums={1,2,6,4,8,5};
        int target=8;
        int []ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

}
