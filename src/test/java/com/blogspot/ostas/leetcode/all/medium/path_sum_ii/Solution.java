package com.blogspot.ostas.leetcode.all.medium.path_sum_ii;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Solution {
  final List<List<Integer>> result = new ArrayList<>();

  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    dfs(root, targetSum, new ArrayList<>(), 0);
    return result;
  }

  private void dfs(TreeNode root, int targetSum, List<Integer> recordedNodeValues, int currentSum) {
    if (root == null) {
      return;
    }

    currentSum += root.val;
    recordedNodeValues.add(root.val);

    if (root.left == null && root.right == null && currentSum == targetSum) {
      result.add(new ArrayList<>(recordedNodeValues));
    } else {
      dfs(root.left, targetSum, recordedNodeValues, currentSum);
      dfs(root.right, targetSum, recordedNodeValues, currentSum);
    }

    // Backtrack by removing the last element to explore other paths.
    recordedNodeValues.remove(recordedNodeValues.size() - 1);
  }
}
