package com.blogspot.ostas.leetcode.all.easy.maximum_depth_of_n_ary_tree;

/*
      559. maximum depth of n-ary tree

https://leetcode.com/problems/maximum-depth-of-n-ary-tree

Given a n-ary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

*/

import com.blogspot.ostas.leetcode.all.common.Node;

class Solution {
  public int maxDepth(Node root) {
    int maxChildDepth = 0;
    if (root == null) {
      return 0;
    } else {
      if (root.children != null) {
        for (var child : root.children) {
          int depth = maxDepth(child);
          maxChildDepth = Math.max(depth, maxChildDepth);
        }
      }
    }
    return maxChildDepth + 1;
  }
}