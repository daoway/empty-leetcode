package com.blogspot.ostas.leetcode.all.easy.symmetric_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      101. symmetric tree

https://leetcode.com/problems/symmetric-tree

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

*/

class Solution {
  public boolean isSymmetric(TreeNode root) {
    return isSymmetric(root, root);
  }

  private boolean isSymmetric(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;

    return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
  }
}
