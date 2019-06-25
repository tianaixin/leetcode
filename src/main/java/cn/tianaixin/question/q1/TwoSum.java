package cn.tianaixin.question.q1;

import java.util.HashMap;

/**
 * 1. 数组初始化方式
 */
public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {1,3,3,3,4};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;

            if (map.containsKey(y)) {
                a[0] = i;
                a[1] = map.get(y);
                return a;
            }
        }
        return new int[2];
    }
}
