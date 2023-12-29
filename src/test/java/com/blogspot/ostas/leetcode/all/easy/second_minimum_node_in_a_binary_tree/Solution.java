package com.blogspot.ostas.leetcode.all.easy.second_minimum_node_in_a_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      671. second minimum node in a binary tree

https://leetcode.com/problems/second-minimum-node-in-a-binary-tree

Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes. More formally, the property root.val = min(root.left.val, root.right.val) always holds.
Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
If no such second minimum value exists, output -1 instead.

*/

class Solution {
  public int findSecondMinimumValue(TreeNode root) {
    if (root == null) {
      return -1;
    }
    int[] minValues = {root.val, -1};
    findSecondMin(root, minValues);
    return minValues[1];
  }

  private void findSecondMin(TreeNode node, int[] minValues) {
    if (node == null) {
      return;
    }
    if (node.val < minValues[0]) {
      minValues[1] = minValues[0];
      minValues[0] = node.val;
    } else if (node.val > minValues[0] && (minValues[1] == -1 || node.val < minValues[1])) {
      minValues[1] = node.val;
    }
    findSecondMin(node.left, minValues);
    findSecondMin(node.right, minValues);
  }
}
