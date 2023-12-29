package com.blogspot.ostas.leetcode.all.easy.convert_sorted_array_to_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      108. convert sorted array to binary search tree

https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree

Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced
binary search tree.

*/
class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    return sortedArrayToBST(nums, 0, nums.length - 1);
  }

  private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }

    int mid = start + (end - start) / 2;

    TreeNode root = new TreeNode(nums[mid]);

    root.left = sortedArrayToBST(nums, start, mid - 1);
    root.right = sortedArrayToBST(nums, mid + 1, end);

    return root;
  }
}