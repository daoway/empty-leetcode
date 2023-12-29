package com.blogspot.ostas.leetcode.all.easy.invert_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      226. invert binary tree

https://leetcode.com/problems/invert-binary-tree

Given the root of a binary tree, invert the tree, and return its root.

*/

class Solution {
  public TreeNode invertTree(TreeNode root) {
    if(root == null){
      return null;
    }

    final TreeNode left = root.left;
    root.left = root.right;
    root.right = left;

    invertTree(root.left);
    invertTree(root.right);
    return root;
  }

}