package com.blogspot.ostas.leetcode.all.easy.count_complete_tree_nodes;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4,5,6]
    Output: 6
    Example 2:
    Input: root = []
    Output: 0
    Example 3:
    Input: root = [1]
    Output: 1
      Constraints:
    The number of nodes in the tree is in the range [0, 5 * 104].
    0 <= Node.val <= 5 * 104
    The tree is guaranteed to be complete.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                        new TreeNode(3, new TreeNode(6, null, null), null));
        int expected = 6;
        var result = solution.countNodes(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = null;
        int expected = 0;
        var result = solution.countNodes(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        int expected = 1;
        var result = solution.countNodes(root);
        assertThat(result).isEqualTo(expected);
    }

}
