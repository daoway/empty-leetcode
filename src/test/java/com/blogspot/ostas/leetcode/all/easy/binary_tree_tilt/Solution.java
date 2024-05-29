package com.blogspot.ostas.leetcode.all.easy.binary_tree_tilt;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      563. binary tree tilt

https://leetcode.com/problems/binary-tree-tilt

Given the root of a binary tree, return the sum of every tree node's tilt.
The tilt of a tree node is the absolute difference between the sum of all left subtree node values and all right subtree node values.
If a node does not have a left child, then the sum of the left subtree node values is treated as 0. The rule is similar if the node does not have a right child.

*/
class Solution {
  private int totalTilt = 0;

  public int findTilt(TreeNode root) {
    dfs(root);
    return totalTilt;
  }

  private int dfs(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int leftSum = dfs(node.left);
    int rightSum = dfs(node.right);
    int tilt = Math.abs(leftSum - rightSum);
    totalTilt += tilt;

    return node.val + leftSum + rightSum;
  }
}