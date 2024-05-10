package com.blogspot.ostas.leetcode.all.medium.range_sum_query_mutable.segment_tree;

public class NumArray {
    private final int[] tree;
    private final int len;

    public NumArray(int[] nums) {
        this.len = nums.length;
        this.tree = new int[nums.length * 4];
        this.buildTree(0, 0, nums.length - 1, nums);
    }

    public void update(int index, int val) {
        update(0, 0, len - 1, index, val);
    }

    public int sumRange(int left, int right) {
        return query(0, 0, len - 1, left, right);
    }

    private int query(int node, int start, int end, int left, int right) {
        if (right < start || end < left) {
            return 0;
        }
        if (left <= start && end <= right) {
            return tree[node];
        }

        int sum = 0;
        int mid = start + (end - start) / 2;
        if (left <= mid) {
            sum += query(2 * node + 1, start, mid, left, right);
        }
        if (right > mid) {
            sum += query(2 * node + 2, mid + 1, end, left, right);
        }

        return sum;
    }

    private void update(int node, int start, int end, int idx, int val) {
        if (idx < start || end < idx) {
            return;
        }
        if (idx == start && idx == end) {
            tree[node] = val;
            return;
        }

        int leftChild = 2 * node + 1;
        int rightChild = 2 * node + 2;
        int mid = start + (end - start) / 2;

        if (idx <= mid) {
            update(leftChild, start, mid, idx, val);
        } else {
            update(rightChild, mid + 1, end, idx, val);
        }

        tree[node] = tree[leftChild] + tree[rightChild];
    }

    private void buildTree(int node, int start, int end, int[] nums) {
        if (start == end) {
            tree[node] = nums[start];
            return;
        }

        int leftChild = 2 * node + 1;
        int rightChild = 2 * node + 2;
        int mid = start + (end - start) / 2;

        buildTree(leftChild, start, mid, nums);
        buildTree(rightChild, mid + 1, end, nums);

        tree[node] = tree[leftChild] + tree[rightChild];
    }
}
