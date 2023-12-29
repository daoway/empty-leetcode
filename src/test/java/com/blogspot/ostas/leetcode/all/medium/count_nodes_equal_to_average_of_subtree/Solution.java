package com.blogspot.ostas.leetcode.all.medium.count_nodes_equal_to_average_of_subtree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      2265. count nodes equal to average of subtree

https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree

Given the root of a binary tree, return the number of nodes where the value of the node is equal to the average of the values in its subtree.
Note:
The average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
A subtree of root is a tree consisting of root and all of its descendants.

*/
class Solution {
  static final class Pair<K,V>{
    K sum;
    V count;

    public Pair(K sum, V count) {
      this.sum = sum;
      this.count = count;
    }
  }
  private int result=0;
  public int averageOfSubtree(TreeNode root) {
    dfs(root);
    return result;
  }

  private Pair<Integer, Integer> dfs(TreeNode root) {
    if (root == null)
      return new Pair<>(0, 0);
    var left = dfs(root.left);
    var right = dfs(root.right);
    final int sum = root.val + left.sum + right.sum;
    final int count = 1 + left.count + right.count;
    if (root.val  == sum / count){
      result++;
    }
    return new Pair<>(sum, count);
  }
}
