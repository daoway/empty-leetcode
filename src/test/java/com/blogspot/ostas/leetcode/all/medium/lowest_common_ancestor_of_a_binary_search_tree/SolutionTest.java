package com.blogspot.ostas.leetcode.all.medium.lowest_common_ancestor_of_a_binary_search_tree;

import static org.assertj.core.api.Assertions.assertThat;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

  /*
    Example 1:
  Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
  Output: 6
  Explanation: The LCA of nodes 2 and 8 is 6.
  Example 2:
  Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
  Output: 2
  Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
  Example 3:
  Input: root = [2,1], p = 2, q = 1
  Output: 2
    Constraints:
  The number of nodes in the tree is in the range [2, 105].
  -109 <= Node.val <= 109
  All Node.val are unique.
  p != q
  p and q will exist in the BST.
  */
  @Test
  void example_0() {
    var solution = new Solution();
    TreeNode root = new TreeNode(6,
        new TreeNode(2, new TreeNode(0, null, null),
            new TreeNode(4, new TreeNode(3, null, null), new TreeNode(5, null, null))),
        new TreeNode(8, new TreeNode(7, null, null), new TreeNode(9, null, null)));
    TreeNode p = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode q = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode expected = new TreeNode(0);//mismatch method/test data
    var result = solution.lowestCommonAncestor(root, p, q);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    TreeNode root = new TreeNode(6,
        new TreeNode(2, new TreeNode(0, null, null),
            new TreeNode(4, new TreeNode(3, null, null), new TreeNode(5, null, null))),
        new TreeNode(8, new TreeNode(7, null, null), new TreeNode(9, null, null)));
    TreeNode p = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode q = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode expected = new TreeNode(0);//mismatch method/test data
    var result = solution.lowestCommonAncestor(root, p, q);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_2() {
    var solution = new Solution();
    TreeNode root = new TreeNode(2, new TreeNode(1, null, null), null);
    TreeNode p = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode q = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode expected = new TreeNode(0);//mismatch method/test data
    var result = solution.lowestCommonAncestor(root, p, q);
    assertThat(result).isEqualTo(expected);
  }

}
