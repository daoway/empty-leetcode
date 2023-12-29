package com.blogspot.ostas.leetcode.all.easy.minimum_absolute_difference_in_bst;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [4,2,6,1,3]
    Output: 1
    Example 2:
    Input: root = [1,0,48,null,null,12,49]
    Output: 1
      Constraints:
    The number of nodes in the tree is in the range [2, 104].
    0 <= Node.val <= 105
      Note: This question is the same as 783: https://leetcode.com/problems/minimum-distance-between-bst-nodes/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(6, null, null));
        int expected = 1;
        var result = solution.getMinimumDifference(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(0, null, null),
                new TreeNode(48, new TreeNode(12, null, null), new TreeNode(49, null, null)));
        int expected = 1;
        var result = solution.getMinimumDifference(root);
        assertThat(result).isEqualTo(expected);
    }

}
