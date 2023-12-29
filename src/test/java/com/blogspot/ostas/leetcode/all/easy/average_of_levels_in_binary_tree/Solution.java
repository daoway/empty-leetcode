package com.blogspot.ostas.leetcode.all.easy.average_of_levels_in_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.List;

/*
      637. average of levels in binary tree

https://leetcode.com/problems/average-of-levels-in-binary-tree

Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.

*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> averages = new ArrayList<>();
    if (root == null)
      return averages;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      double levelSum = 0;

      for (int i = 0; i < levelSize; i++) {
        TreeNode current = queue.poll();
        levelSum += current.val;

        if (current.left != null)
          queue.offer(current.left);
        if (current.right != null)
          queue.offer(current.right);
      }

      double levelAverage = levelSum / levelSize;
      averages.add(levelAverage);
    }

    return averages;
  }
}
