package com.blogspot.ostas.leetcode.all.medium.reverse_odd_levels_of_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      2415. reverse odd levels of binary tree

https://leetcode.com/problems/reverse-odd-levels-of-binary-tree

Given the root of a perfect binary tree, reverse the node values at each odd level of the tree.
For example, suppose the node values at level 3 are [2,1,3,4,7,11,29,18], then it should become [18,29,11,7,4,3,1,2].
Return the root of the reversed tree.
A binary tree is perfect if all parent nodes have two children and all leaves are on the same level.
The level of a node is the number of edges along the path between it and the root node.

*/

class Solution {
  public TreeNode reverseOddLevels(TreeNode root) {
    dfsWalk(root.left, root.right, true);
    return root;
  }

  private void dfsWalk(TreeNode left, TreeNode right, boolean isOddLevel) {
    if (left == null)
      return;
    if (isOddLevel) {
      final int val = left.val;
      left.val = right.val;
      right.val = val;
    }
    dfsWalk(left.left, right.right, !isOddLevel);
    dfsWalk(left.right, right.left, !isOddLevel);
  }
}
