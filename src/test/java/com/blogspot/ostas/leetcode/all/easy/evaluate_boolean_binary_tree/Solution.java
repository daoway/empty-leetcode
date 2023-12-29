package com.blogspot.ostas.leetcode.all.easy.evaluate_boolean_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      2331. evaluate boolean binary tree

https://leetcode.com/problems/evaluate-boolean-binary-tree

You are given the root of a full binary tree with the following properties:
Leaf nodes have either the value 0 or 1, where 0 represents False and 1 represents True.
Non-leaf nodes have either the value 2 or 3, where 2 represents the boolean OR and 3 represents the boolean AND.
The evaluation of a node is as follows:
If the node is a leaf node, the evaluation is the value of the node, i.e. True or False.
Otherwise, evaluate the node's two children and apply the boolean operation of its value with the children's evaluations.
Return the boolean result of evaluating the root node.
A full binary tree is a binary tree where each node has either 0 or 2 children.
A leaf node is a node that has zero children.

*/
class Solution {
  public boolean evaluateTree(TreeNode root) {
    if (root.val == 0 || root.val == 1) {
      return root.val == 1;
    }
    // OR
    if (root.val == 2) {
      return evaluateTree(root.left) || evaluateTree(root.right);
    }
    // AND
    return evaluateTree(root.left) && evaluateTree(root.right);
  }
}
