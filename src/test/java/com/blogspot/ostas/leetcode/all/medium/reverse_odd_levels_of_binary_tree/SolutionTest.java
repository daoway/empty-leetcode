package com.blogspot.ostas.leetcode.all.medium.reverse_odd_levels_of_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [2,3,5,8,13,21,34]
    Output: [2,5,3,8,13,21,34]
    Explanation:
    The tree has only one odd level.
    The nodes at level 1 are 3, 5 respectively, which are reversed and become 5, 3.
    Example 2:
    Input: root = [7,13,11]
    Output: [7,11,13]
    Explanation:
    The nodes at level 1 are 13, 11, which are reversed and become 11, 13.
    Example 3:
    Input: root = [0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]
    Output: [0,2,1,0,0,0,0,2,2,2,2,1,1,1,1]
    Explanation:
    The odd levels have non-zero values.
    The nodes at level 1 were 1, 2, and are 2, 1 after the reversal.
    The nodes at level 3 were 1, 1, 1, 1, 2, 2, 2, 2, and are 2, 2, 2, 2, 1, 1, 1, 1 after the reversal.
      Constraints:
    The number of nodes in the tree is in the range [1, 214].
    0 <= Node.val <= 105
    root is a perfect binary tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(2, new TreeNode(3, new TreeNode(8, null, null), new TreeNode(13, null, null)),
                        new TreeNode(5, new TreeNode(21, null, null), new TreeNode(34, null, null)));
        TreeNode expected =
                new TreeNode(2, new TreeNode(5, new TreeNode(8, null, null), new TreeNode(13, null, null)),
                        new TreeNode(3, new TreeNode(21, null, null), new TreeNode(34, null, null)));
        var result = solution.reverseOddLevels(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(7, new TreeNode(13, null, null), new TreeNode(11, null, null));
        TreeNode expected = new TreeNode(7, new TreeNode(11, null, null), new TreeNode(13, null, null));
        var result = solution.reverseOddLevels(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0,
                new TreeNode(1, new TreeNode(0, new TreeNode(1, null, null), new TreeNode(1, null, null)),
                        new TreeNode(0, new TreeNode(1, null, null), new TreeNode(1, null, null))),
                new TreeNode(2, new TreeNode(0, new TreeNode(2, null, null), new TreeNode(2, null, null)),
                        new TreeNode(0, new TreeNode(2, null, null), new TreeNode(2, null, null))));
        TreeNode expected = new TreeNode(0,
                new TreeNode(2, new TreeNode(0, new TreeNode(2, null, null), new TreeNode(2, null, null)),
                        new TreeNode(0, new TreeNode(2, null, null), new TreeNode(2, null, null))),
                new TreeNode(1, new TreeNode(0, new TreeNode(1, null, null), new TreeNode(1, null, null)),
                        new TreeNode(0, new TreeNode(1, null, null), new TreeNode(1, null, null))));
        var result = solution.reverseOddLevels(root);
        assertThat(result).isEqualTo(expected);
    }

}
