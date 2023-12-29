package com.blogspot.ostas.leetcode.all.medium.convert_bst_to_greater_tree;

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
    The number of nodes in the tree is in the range [0, 104].
    -104 <= Node.val <= 104
    All the values in the tree are unique.
    root is guaranteed to be a valid binary search tree.
      Note: This question is the same as 1038: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
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
        var result = solution.convertBST(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0, null, new TreeNode(1, null, null));
        TreeNode expected = new TreeNode(1, null, new TreeNode(1, null, null));
        var result = solution.convertBST(root);
        assertThat(result).isEqualTo(expected);
    }

}
