package com.blogspot.ostas.leetcode.all.easy.search_in_a_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      700. search in a binary search tree

https://leetcode.com/problems/search-in-a-binary-search-tree

You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

*/

class Solution {
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null) {
      return null;
    }
    if (root.val == val) {
      return root;
    }
    if (val < root.val) {
      return searchBST(root.left, val);
    }
    if (val > root.val) {
      return searchBST(root.right, val);
    }
    return null;
  }
}
