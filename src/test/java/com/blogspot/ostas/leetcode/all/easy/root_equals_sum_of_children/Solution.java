package com.blogspot.ostas.leetcode.all.easy.root_equals_sum_of_children;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      2236. root equals sum of children

https://leetcode.com/problems/root-equals-sum-of-children

You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.
Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.

*/

class Solution {
  public boolean checkTree(TreeNode root) {
    return root.val == root.left.val + root.right.val;
  }
}