package com.blogspot.ostas.leetcode.all.easy.balanced_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      110. balanced binary tree

https://leetcode.com/problems/balanced-binary-tree

Given a binary tree, determine if it is
height-balanced
.

*/
public class Solution {
  public boolean isBalanced(TreeNode root) {
    return getHeight(root) != -1;
  }

  private int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }

    final int leftHeight = getHeight(root.left);
    if (leftHeight == -1) {
      return -1;
    }

    final int rightHeight = getHeight(root.right);
    if (rightHeight == -1) {
      return -1;
    }

    if (Math.abs(leftHeight - rightHeight) > 1) {
      return -1;
    }

    return 1 + Math.max(leftHeight, rightHeight);
  }
}
