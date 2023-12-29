package com.blogspot.ostas.leetcode.all.medium.insert_into_a_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      701. insert into a binary search tree

https://leetcode.com/problems/insert-into-a-binary-search-tree

You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

*/


class Solution {
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }
    if (root.val > val) {
      root.left = insertIntoBST(root.left, val);
    } else {
      root.right = insertIntoBST(root.right, val);
    }
    return root;
  }
}