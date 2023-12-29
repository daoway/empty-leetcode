package com.blogspot.ostas.leetcode.all.easy.range_sum_of_bst;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      938. range sum of bst

https://leetcode.com/problems/range-sum-of-bst

Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

*/

class Solution {
  public int rangeSumBST(TreeNode root, int low, int high) {
    if (root == null) {
      return 0;
    }
    int sum = 0;
    if (root.val >= low && root.val <= high) {
      sum += root.val;
    }
    sum += rangeSumBST(root.left, low, high);
    sum += rangeSumBST(root.right, low, high);
    return sum;
  }
}
