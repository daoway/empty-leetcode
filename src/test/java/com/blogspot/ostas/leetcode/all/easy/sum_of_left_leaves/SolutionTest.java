package com.blogspot.ostas.leetcode.all.easy.sum_of_left_leaves;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: 24
    Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
    Example 2:
    Input: root = [1]
    Output: 0
      Constraints:
    The number of nodes in the tree is in the range [1, 1000].
    -1000 <= Node.val <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        int expected = 24;
        var result = solution.sumOfLeftLeaves(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        int expected = 0;
        var result = solution.sumOfLeftLeaves(root);
        assertThat(result).isEqualTo(expected);
    }

}
