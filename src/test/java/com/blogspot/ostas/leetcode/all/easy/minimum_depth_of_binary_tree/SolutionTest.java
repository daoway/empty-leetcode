package com.blogspot.ostas.leetcode.all.easy.minimum_depth_of_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: 2
    Example 2:
    Input: root = [2,null,3,null,4,null,5,null,6]
    Output: 5
      Constraints:
    The number of nodes in the tree is in the range [0, 105].
    -1000 <= Node.val <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        int expected = 2;
        var result = solution.minDepth(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, null,
                new TreeNode(3, null,
                        new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6, null, null)))));
        int expected = 5;
        var result = solution.minDepth(root);
        assertThat(result).isEqualTo(expected);
    }

}
