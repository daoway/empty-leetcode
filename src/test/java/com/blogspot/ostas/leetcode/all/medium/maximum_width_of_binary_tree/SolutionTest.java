package com.blogspot.ostas.leetcode.all.medium.maximum_width_of_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,3,2,5,3,null,9]
    Output: 4
    Explanation: The maximum width exists in the third level with length 4 (5,3,null,9).
    Example 2:
    Input: root = [1,3,2,5,null,null,9,6,null,7]
    Output: 7
    Explanation: The maximum width exists in the fourth level with length 7 (6,null,null,null,null,null,7).
    Example 3:
    Input: root = [1,3,2,5]
    Output: 2
    Explanation: The maximum width exists in the second level with length 2 (3,2).
      Constraints:
    The number of nodes in the tree is in the range [1, 3000].
    -100 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(3, new TreeNode(5, null, null), new TreeNode(3, null, null)),
                        new TreeNode(2, null, new TreeNode(9, null, null)));
        int expected = 4;
        var result = solution.widthOfBinaryTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(3, new TreeNode(5, new TreeNode(6, null, null), null), null),
                        new TreeNode(2, null, new TreeNode(9, new TreeNode(7, null, null), null)));
        int expected = 7;
        var result = solution.widthOfBinaryTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(5, null, null), null),
                new TreeNode(2, null, null));
        int expected = 2;
        var result = solution.widthOfBinaryTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
