package com.blogspot.ostas.leetcode.all.easy.sum_of_left_leaves;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      404. sum of left leaves

https://leetcode.com/problems/sum-of-left-leaves

Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

*/

class Solution {
  int sum;

  public int sumOfLeftLeaves(TreeNode root) {
    dfs(root, false);
    return sum;
  }

  private void dfs(TreeNode root, boolean isLeft) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null && isLeft) {
      sum += root.val;
    }
    dfs(root.left, true);
    dfs(root.right, false);
  }
}
