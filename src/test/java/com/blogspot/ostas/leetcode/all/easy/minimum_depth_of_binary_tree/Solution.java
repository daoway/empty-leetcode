package com.blogspot.ostas.leetcode.all.easy.minimum_depth_of_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      111. minimum depth of binary tree

https://leetcode.com/problems/minimum-depth-of-binary-tree

Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.

*/

class Solution {

  public int minDepth(TreeNode root) {
    if(root == null){
      return 0;
    }
    // If the node is a leaf, return 1
    if (root.left == null && root.right == null) {
      return 1;
    }

    int leftDepth = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
    int rightDepth = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;

    return Math.min(leftDepth, rightDepth) + 1;
  }
}
