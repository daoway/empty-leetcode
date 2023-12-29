package com.blogspot.ostas.leetcode.all.easy.binary_tree_postorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

/*
      145. binary tree postorder traversal

https://leetcode.com/problems/binary-tree-postorder-traversal

Given the root of a binary tree, return the postorder traversal of its nodes' values.

*/
class Solution {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    postorder(result, root);
    return result;
  }

  private void postorder(List<Integer> result, TreeNode root) {
    if (root == null) {
      return;
    }
    postorder(result, root.left);
    postorder(result, root.right);
    result.add(root.val);

  }
}
