package com.blogspot.ostas.leetcode.all.medium.find_bottom_left_tree_value;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/*
      513. find bottom left tree value

https://leetcode.com/problems/find-bottom-left-tree-value

Given the root of a binary tree, return the leftmost value in the last row of the tree.

*/
class Solution {
  /*
  private int value;
  private int maxLevel = -1;

  public int findBottomLeftValue(TreeNode root) {
    dfs(root, 0);
    return value;
  }

  private void dfs(TreeNode node, int level) {
    if (node == null) {
      return;
    }

    if (level > maxLevel) {
      value = node.val;
      maxLevel = level;
    }

    dfs(node.left, level + 1);
    dfs(node.right, level + 1);
  }
  */
  //BFS
  public int findBottomLeftValue(TreeNode root) {
    final Queue<TreeNode> queue = new ArrayDeque<>(List.of(root));
    TreeNode node = null;

    while (!queue.isEmpty()) {
      node = queue.poll();
      if (node.right != null) {
        queue.offer(node.right);
      }
      if (node.left != null) {
        queue.offer(node.left);
      }
    }

    return node.val;
  }

}
