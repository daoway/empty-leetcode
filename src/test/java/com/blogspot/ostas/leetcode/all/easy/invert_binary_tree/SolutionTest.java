package com.blogspot.ostas.leetcode.all.easy.invert_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [4,2,7,1,3,6,9]
    Output: [4,7,2,9,6,3,1]
    Example 2:
    Input: root = [2,1,3]
    Output: [2,3,1]
    Example 3:
    Input: root = []
    Output: []
      Constraints:
    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(7, new TreeNode(6, null, null), new TreeNode(9, null, null)));
        TreeNode expected =
                new TreeNode(4, new TreeNode(7, new TreeNode(9, null, null), new TreeNode(6, null, null)),
                        new TreeNode(2, new TreeNode(3, null, null), new TreeNode(1, null, null)));
        var result = solution.invertTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        TreeNode expected = new TreeNode(2, new TreeNode(3, null, null), new TreeNode(1, null, null));
        var result = solution.invertTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = null;
        TreeNode expected = null;
        var result = solution.invertTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
