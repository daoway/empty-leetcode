package com.blogspot.ostas.leetcode.all.easy.n_ary_tree_postorder_traversal;

import com.blogspot.ostas.leetcode.all.common.Node;
import java.util.ArrayList;
import java.util.List;

/*
      590. n-ary tree postorder traversal

https://leetcode.com/problems/n-ary-tree-postorder-traversal

Given the root of an n-ary tree, return the postorder traversal of its nodes' values.
Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

*/
class Solution {
  private final List<Integer> result = new ArrayList<>();
  public List<Integer> postorder(Node root) {
    if(root == null) return List.of();
    if(root.children!=null){
      for(var child : root.children){
        postorder(child);
      }
    }
    result.add(root.val);
    return result;
  }
}