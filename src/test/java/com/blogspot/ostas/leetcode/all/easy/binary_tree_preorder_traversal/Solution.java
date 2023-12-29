package com.blogspot.ostas.leetcode.all.easy.binary_tree_preorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

/*
      144. binary tree preorder traversal

https://leetcode.com/problems/binary-tree-preorder-traversal

Given the root of a binary tree, return the preorder traversal of its nodes' values.

*/
class Solution {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    preorder(result, root);
    return result;
  }

  private void preorder(List<Integer> result, TreeNode root) {
    if (root == null) {
      return;
    }
    result.add(root.val);
    preorder(result, root.left);
    preorder(result, root.right);
  }

}