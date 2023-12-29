package com.blogspot.ostas.leetcode.all.medium.deepest_leaves_sum;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      1302. deepest leaves sum

https://leetcode.com/problems/deepest-leaves-sum

Given the root of a binary tree, return the sum of values of its deepest leaves.

*/
class Solution {
  private int deepestLevel = 0;
  private int deepestSum = 0;

  public int deepestLeavesSum(TreeNode root) {
    dfs(0, root);
    return deepestSum;
  }

  private void dfs(int level, TreeNode root) {
    if (root == null) {
      return;
    }

    if (level > deepestLevel) {
      deepestLevel = level;
      deepestSum = root.val;
    } else if (level == deepestLevel) {
      deepestSum += root.val;
    }

    dfs(level + 1, root.left);
    dfs(level + 1, root.right);
  }
}
