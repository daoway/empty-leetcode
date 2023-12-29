package com.blogspot.ostas.leetcode.all.easy.maximum_depth_of_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      104. maximum depth of binary tree

https://leetcode.com/problems/maximum-depth-of-binary-tree

Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/

class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    } else {
      int lsize = maxDepth(root.left);
      int rsize = maxDepth(root.right);
      if (lsize > rsize) {
        return lsize + 1;
      } else {
        return rsize + 1;
      }
    }
  }
}