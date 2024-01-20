package Collection.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddUnsortedArray {
    public static void main(String[] args) {
        int []nums={2,7,11,15};
        int target = 9;
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
