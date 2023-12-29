package com.blogspot.ostas.leetcode.all.easy.balanced_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: true
    Example 2:
    Input: root = [1,2,2,3,3,null,null,4,4]
    Output: false
    Example 3:
    Input: root = []
    Output: true
      Constraints:
    The number of nodes in the tree is in the range [0, 5000].
    -104 <= Node.val <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        boolean expected = true;
        var result = solution.isBalanced(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2,
                new TreeNode(3, new TreeNode(4, null, null), new TreeNode(4, null, null)),
                new TreeNode(3, null, null)),
                new TreeNode(2, null, null));
        boolean expected = false;
        var result = solution.isBalanced(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = null;
        boolean expected = true;
        var result = solution.isBalanced(root);
        assertThat(result).isEqualTo(expected);
    }

}
