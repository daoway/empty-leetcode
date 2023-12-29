package com.blogspot.ostas.leetcode.all.medium.maximum_difference_between_node_and_ancestor;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
    Output: 7
    Explanation: We have various ancestor-node differences, some of which are given below :
    |8 - 3| = 5
    |3 - 7| = 4
    |8 - 1| = 7
    |10 - 13| = 3
    Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
    Example 2:
    Input: root = [1,null,2,null,0,3]
    Output: 3
      Constraints:
    The number of nodes in the tree is in the range [2, 5000].
    0 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(8,
                new TreeNode(3, new TreeNode(1, null, null),
                        new TreeNode(6, new TreeNode(4, null, null), new TreeNode(7, null, null))),
                new TreeNode(10, null, new TreeNode(14, new TreeNode(13, null, null), null)));
        int expected = 7;
        var result = solution.maxAncestorDiff(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null,
                new TreeNode(2, null, new TreeNode(0, new TreeNode(3, null, null), null)));
        int expected = 3;
        var result = solution.maxAncestorDiff(root);
        assertThat(result).isEqualTo(expected);
    }

}
