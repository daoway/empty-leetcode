package com.blogspot.ostas.leetcode.all.medium.kth_smallest_element_in_a_bst;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
      230. kth smallest element in a bst

https://leetcode.com/problems/kth-smallest-element-in-a-bst

Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

*/

class Solution {
  public int kthSmallest(TreeNode root, int k) {
    final PriorityQueue<Integer> queue = new PriorityQueue<>((Comparator.reverseOrder()));
    dfs(queue, root, k);
    return queue.poll();
  }

  private void dfs(PriorityQueue<Integer> queue, TreeNode root, int k) {
    if (root == null) {
      return;
    }
    queue.offer(root.val);
    if (queue.size() > k) {
      queue.poll();
    }
    dfs(queue, root.left, k);
    dfs(queue, root.right, k);
  }
}
