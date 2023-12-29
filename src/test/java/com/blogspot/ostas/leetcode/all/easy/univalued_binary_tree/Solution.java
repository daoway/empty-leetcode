package com.blogspot.ostas.leetcode.all.easy.univalued_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      965. univalued binary tree

https://leetcode.com/problems/univalued-binary-tree

A binary tree is uni-valued if every node in the tree has the same value.
Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

*/

class Solution {
  public boolean isUnivalTree(TreeNode root) {
    if (root == null) {
      return true;
    }
    return dfs(root, root.val);
  }

  private boolean dfs(TreeNode root, int r) {
    if (root == null) {
      return true;
    }
    if (root.val != r) {
      return false;
    }
    return dfs(root.left, r) && dfs(root.right, r);
  }

}