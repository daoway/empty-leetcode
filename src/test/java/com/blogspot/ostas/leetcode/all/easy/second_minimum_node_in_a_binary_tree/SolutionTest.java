package com.blogspot.ostas.leetcode.all.easy.second_minimum_node_in_a_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [2,2,5,null,null,5,7]
    Output: 5
    Explanation: The smallest value is 2, the second smallest value is 5.
    Example 2:
    Input: root = [2,2,2]
    Output: -1
    Explanation: The smallest value is 2, but there isn't any second smallest value.
      Constraints:
    The number of nodes in the tree is in the range [1, 25].
    1 <= Node.val <= 231 - 1
    root.val == min(root.left.val, root.right.val) for each internal node of the tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(2, null, null),
                new TreeNode(5, new TreeNode(5, null, null), new TreeNode(7, null, null)));
        int expected = 5;
        var result = solution.findSecondMinimumValue(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(2, null, null), new TreeNode(2, null, null));
        int expected = -1;
        var result = solution.findSecondMinimumValue(root);
        assertThat(result).isEqualTo(expected);
    }

}
