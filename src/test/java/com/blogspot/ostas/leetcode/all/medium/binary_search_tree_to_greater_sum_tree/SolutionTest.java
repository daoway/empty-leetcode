package com.blogspot.ostas.leetcode.all.medium.binary_search_tree_to_greater_sum_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
    Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
    Example 2:
    Input: root = [0,null,1]
    Output: [1,null,1]
      Constraints:
    The number of nodes in the tree is in the range [1, 100].
    0 <= Node.val <= 100
    All the values in the tree are unique.
      Note: This question is the same as 538: https://leetcode.com/problems/convert-bst-to-greater-tree/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(4,
                new TreeNode(1, new TreeNode(0, null, null),
                        new TreeNode(2, null, new TreeNode(3, null, null))),
                new TreeNode(6, new TreeNode(5, null, null),
                        new TreeNode(7, null, new TreeNode(8, null, null))));
        TreeNode expected = new TreeNode(30,
                new TreeNode(36, new TreeNode(36, null, null),
                        new TreeNode(35, null, new TreeNode(33, null, null))),
                new TreeNode(21, new TreeNode(26, null, null),
                        new TreeNode(15, null, new TreeNode(8, null, null))));
        var result = solution.bstToGst(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0, null, new TreeNode(1, null, null));
        TreeNode expected = new TreeNode(1, null, new TreeNode(1, null, null));
        var result = solution.bstToGst(root);
        assertThat(result).isEqualTo(expected);
    }

}
