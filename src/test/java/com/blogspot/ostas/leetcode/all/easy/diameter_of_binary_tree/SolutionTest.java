package com.blogspot.ostas.leetcode.all.easy.diameter_of_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4,5]
    Output: 3
    Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
    Example 2:
    Input: root = [1,2]
    Output: 1
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -100 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                        new TreeNode(3, null, null));
        int expected = 3;
        var result = solution.diameterOfBinaryTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), null);
        int expected = 1;
        var result = solution.diameterOfBinaryTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
