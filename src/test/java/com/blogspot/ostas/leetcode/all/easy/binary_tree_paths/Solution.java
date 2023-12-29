package com.blogspot.ostas.leetcode.all.easy.binary_tree_paths;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

/*
      257. binary tree paths

https://leetcode.com/problems/binary-tree-paths

Given the root of a binary tree, return all root-to-leaf paths in any order.
A leaf is a node with no children.

*/
public class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    final List<String> result = new ArrayList<>();
    if (root != null) {
      dfs(root, "", result);
    }
    return result;
  }

  private void dfs(TreeNode node, String currentPath, List<String> result) {
    if (node == null) {
      return;
    }
    currentPath += Integer.toString(node.val);
    if (node.left == null && node.right == null) {
      result.add(currentPath);
    } else {
      currentPath += "->";
      dfs(node.left, currentPath, result);
      dfs(node.right, currentPath, result);
    }
  }
}
