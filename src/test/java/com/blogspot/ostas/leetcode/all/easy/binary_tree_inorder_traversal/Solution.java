package com.blogspot.ostas.leetcode.all.easy.binary_tree_inorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Solution {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inorder(result, root);
    return result;
  }

  private void inorder(List<Integer> result, TreeNode root) {
    if (root == null) {
      return;
    }
    inorder(result, root.left);
    result.add(root.val);
    inorder(result, root.right);
  }
}
