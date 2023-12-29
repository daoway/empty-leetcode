package com.blogspot.ostas.leetcode.all.medium.longest_zigzag_path_in_a_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
    Output: 3
    Explanation: Longest ZigZag path in blue nodes (right -> left -> right).
    Example 2:
    Input: root = [1,1,1,null,1,null,null,1,1,null,1]
    Output: 4
    Explanation: Longest ZigZag path in blue nodes (left -> right -> left -> right).
    Example 3:
    Input: root = [1]
    Output: 0
      Constraints:
    The number of nodes in the tree is in the range [1, 5 * 104].
    1 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null,
                new TreeNode(1, new TreeNode(1, null, null),
                        new TreeNode(1,
                                new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, null))),
                                new TreeNode(1, null, null))));
        int expected = 3;
        var result = solution.longestZigZag(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(1, null,
                new TreeNode(1, new TreeNode(1, null, new TreeNode(1, null, null)),
                        new TreeNode(1, null, null))),
                new TreeNode(1, null, null));
        int expected = 4;
        var result = solution.longestZigZag(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        int expected = 0;
        var result = solution.longestZigZag(root);
        assertThat(result).isEqualTo(expected);
    }

}
