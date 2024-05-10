package com.blogspot.ostas.leetcode.all.medium.range_sum_query_mutable.optimized;

/*

    Time Limit Exceeded

    16 / 16 testcases passed

    Testcases passed, but took too long.

 */
class NumArray {
    private final int[] sums;

    public NumArray(int[] nums) {
        this.sums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
    }

    public void update(int index, int val) {
        int diff = val - (sums[index + 1] - sums[index]);
        for (int i = index + 1; i < sums.length; i++) {
            sums[i] += diff;
        }
    }

    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];
    }
}
