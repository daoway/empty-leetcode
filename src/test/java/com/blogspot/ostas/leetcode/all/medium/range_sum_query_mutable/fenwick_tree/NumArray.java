package com.blogspot.ostas.leetcode.all.medium.range_sum_query_mutable.fenwick_tree;

public class NumArray {
    private final int[] nums;
    private final int[] tree;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.tree = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            add(i + 1, nums[i]);
        }
    }

    public void update(int index, int val) {
        int delta = val - nums[index];
        nums[index] = val;
        add(index + 1, delta);
    }

    public int sumRange(int left, int right) {
        return query(right + 1) - query(left);
    }

    private void add(int idx, int val) {
        for (int i = idx; i < tree.length; i += lowbit(i)) {
            tree[i] += val;
        }
    }

    private int query(int idx) {
        int sum = 0;
        for (int i = idx; i > 0; i -= lowbit(i)) {
            sum += tree[i];
        }
        return sum;
    }

    private int lowbit(int x) {
        return x & -x;
    }
}