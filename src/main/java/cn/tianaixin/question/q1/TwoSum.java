package cn.tianaixin.question.q1;

import java.util.HashMap;

/**
 * 1. 数组初始化方式
 */
public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }

        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if (map.containsKey(y)) {
                a[0] = x;
                a[1] = y;
                return a;
            }
        }
        return new int[2];
    }
}
