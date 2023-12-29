package com.blogspot.ostas.leetcode.all.easy.n_ary_tree_preorder_traversal;

/*
      589. n-ary tree preorder traversal

https://leetcode.com/problems/n-ary-tree-preorder-traversal

Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

*/


import com.blogspot.ostas.leetcode.all.common.Node;
import java.util.ArrayList;
import java.util.List;

class Solution {
  private List<Integer> preorderResult = new ArrayList<>();

  public List<Integer> preorder(Node root) {
    if(root == null) return List.of();
    preorderResult.add(root.val);
    if(root.children!=null){
      for(var child : root.children){
        preorder(child);
      }
    }
    return preorderResult;
  }
}