package com.blogspot.ostas.leetcode.all.easy.count_complete_tree_nodes;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/*
      222. count complete tree nodes

https://leetcode.com/problems/count-complete-tree-nodes

Given the root of a complete binary tree, return the number of the nodes in the tree.
According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
Design an algorithm that runs in less than O(n) time complexity.

*/
class Solution {
  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int count = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      count++;

      if (current.left != null) {
        queue.offer(current.left);
      }

      if (current.right != null) {
        queue.offer(current.right);
      }
    }

    return count;
  }
}
