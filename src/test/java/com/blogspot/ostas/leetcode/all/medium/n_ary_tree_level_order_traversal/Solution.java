package com.blogspot.ostas.leetcode.all.medium.n_ary_tree_level_order_traversal;

import com.blogspot.ostas.leetcode.all.common.Node;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
      429. n-ary tree level order traversal

https://leetcode.com/problems/n-ary-tree-level-order-traversal

Given an n-ary tree, return the level order traversal of its nodes' values.
Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

*/

class Solution {
  public List<List<Integer>> levelOrder(Node root) {
    final Map<Integer,List<Integer>> resultMap = new LinkedHashMap<>();
    dfs_(resultMap, 0, root);
    return new ArrayList<>(resultMap.values());
  }

  private void dfs_(Map<Integer, List<Integer>> resultMap, int level, Node root) {
    if(root == null) {
      return;
    }
    resultMap.computeIfAbsent(level, k -> new ArrayList<>());
    resultMap.get(level).add(root.val);
    if(root.children!=null){
      for (var child: root.children){
        dfs_(resultMap,level+1,child);
      }
    }
  }
}