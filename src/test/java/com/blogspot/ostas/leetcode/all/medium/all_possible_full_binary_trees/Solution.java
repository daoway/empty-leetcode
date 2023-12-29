package com.blogspot.ostas.leetcode.all.medium.all_possible_full_binary_trees;

/*
      894. all possible full binary trees

https://leetcode.com/problems/all-possible-full-binary-trees

Given an integer n, return a list of all possible full binary trees with n nodes. Each node of each tree in the answer must have Node.val == 0.
Each element of the answer is the root node of one possible tree. You may return the final list of trees in any order.
A full binary tree is a binary tree where each node has exactly 0 or 2 children.

*/

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {
  private final Map<Integer, List<TreeNode>> memo = new HashMap<>();

  public List<TreeNode> allPossibleFBT(int n) {
    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    List<TreeNode> result = new ArrayList<>();
    if (n % 2 == 0) {
      return result; // No full binary trees with even nodes
    }
    if (n == 1) {
      result.add(new TreeNode(0));
      return result; // Base case: Single node with val = 0
    }

    for (int i = 1; i < n; i += 2) {
      List<TreeNode> leftSubtrees = allPossibleFBT(i);
      List<TreeNode> rightSubtrees = allPossibleFBT(n - i - 1);

      for (TreeNode left : leftSubtrees) {
        for (TreeNode right : rightSubtrees) {
          TreeNode root = new TreeNode(0);
          root.left = left;
          root.right = right;
          result.add(root);
        }
      }
    }

    memo.put(n, result);
    return result;
  }
}
