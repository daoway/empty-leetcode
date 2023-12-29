package com.blogspot.ostas.leetcode.all.medium.binary_tree_level_order_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
      102. binary tree level order traversal

https://leetcode.com/problems/binary-tree-level-order-traversal

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

*/
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    Map<Integer,List<Integer>> map = new HashMap<>();
    walkAtLevel(map,root,0);
    return new ArrayList<>(map.values());
  }

  // Helper method to print the tree
  public void walkAtLevel(Map<Integer,List<Integer>> map, TreeNode node, int level) {
    if (node == null) {
      return;
    }
    if(map.get(level) == null){
      var l = new ArrayList<Integer>();
      l.add(node.val);
      map.put(level, l);
    }else {
      map.get(level).add(node.val);
    }

    walkAtLevel(map,node.left, level + 1);
    walkAtLevel(map,node.right, level + 1);
  }

}
