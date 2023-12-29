package com.blogspot.ostas.leetcode.all.medium.flip_equivalent_binary_trees;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
    Output: true
    Explanation: We flipped at nodes with values 1, 3, and 5.
    Example 2:
    Input: root1 = [], root2 = []
    Output: true
    Example 3:
    Input: root1 = [], root2 = [1]
    Output: false
      Constraints:
    The number of nodes in each tree is in the range [0, 100].
    Each tree will have unique node values in the range [0, 99].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, null, null),
                        new TreeNode(5, new TreeNode(7, null, null), new TreeNode(8, null, null))),
                new TreeNode(3, new TreeNode(6, null, null), null));
        TreeNode root2 = new TreeNode(1, new TreeNode(3, null, new TreeNode(6, null, null)),
                new TreeNode(2, new TreeNode(4, null, null),
                        new TreeNode(5, new TreeNode(8, null, null), new TreeNode(7, null, null))));
        boolean expected = true;
        var result = solution.flipEquiv(root1, root2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root1 = null;
        TreeNode root2 = null;
        boolean expected = true;
        var result = solution.flipEquiv(root1, root2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root1 = null;
        TreeNode root2 = new TreeNode(1, null, null);
        boolean expected = false;
        var result = solution.flipEquiv(root1, root2);
        assertThat(result).isEqualTo(expected);
    }

}
