package com.blogspot.ostas.leetcode.all.hard.maximum_sum_bst_in_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
    Output: 20
    Explanation: Maximum sum in a valid Binary search tree is obtained in root node with key equal to 3.
    Example 2:
    Input: root = [4,3,null,1,2]
    Output: 2
    Explanation: Maximum sum in a valid Binary search tree is obtained in a single root node with key equal to 2.
    Example 3:
    Input: root = [-4,-2,-5]
    Output: 0
    Explanation: All values are negatives. Return an empty BST.
      Constraints:
    The number of nodes in the tree is in the range [1, 4 * 104].
    -4 * 104 <= Node.val <= 4 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(4, new TreeNode(2, null, null), new TreeNode(4, null, null)),
                        new TreeNode(3, new TreeNode(2, null, null),
                                new TreeNode(5, new TreeNode(4, null, null), new TreeNode(6, null, null))));
        int expected = 20;
        var result = solution.maxSumBST(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(3, new TreeNode(1, null, null), new TreeNode(2, null, null)),
                        null);
        int expected = 2;
        var result = solution.maxSumBST(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(-4, new TreeNode(-2, null, null), new TreeNode(-5, null, null));
        int expected = 0;
        var result = solution.maxSumBST(root);
        assertThat(result).isEqualTo(expected);
    }

}
