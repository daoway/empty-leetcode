package com.blogspot.ostas.leetcode.all.easy.path_sum;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      112. path sum

https://leetcode.com/problems/path-sum

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
A leaf is a node with no children.

*/

class Solution {

  public boolean hasPathSum(TreeNode root, int targetSum) {
    return dfs(0, root, targetSum);
  }

  private boolean dfs(int sum, TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    sum += root.val;
    if (root.left == null && root.right == null) {
      if (sum == targetSum) {
        return true;
      }
    }
    return dfs(sum, root.left, targetSum) || dfs(sum, root.right, targetSum);
  }
}
