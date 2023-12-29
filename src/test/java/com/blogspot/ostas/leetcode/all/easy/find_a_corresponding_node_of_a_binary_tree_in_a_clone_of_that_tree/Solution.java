package com.blogspot.ostas.leetcode.all.easy.find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      1379. find a corresponding node of a binary tree in a clone of that tree

https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree

Given two binary trees original and cloned and given a reference to a node target in the original tree.
The cloned tree is a copy of the original tree.
Return a reference to the same node in the cloned tree.
Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree.

*/
public class Solution {
  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
    if (original == null || cloned == null) {
      return null;
    }

    if (original == target) {
      return cloned;
    }

    TreeNode left = getTargetCopy(original.left, cloned.left, target);
    if (left != null) {
      return left;
    }

    TreeNode right = getTargetCopy(original.right, cloned.right, target);
    return right;
  }
}
