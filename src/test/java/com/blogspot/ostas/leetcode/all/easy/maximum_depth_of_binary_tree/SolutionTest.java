package com.blogspot.ostas.leetcode.all.easy.maximum_depth_of_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: 3
    Example 2:
    Input: root = [1,null,2]
    Output: 2
      Constraints:
    The number of nodes in the tree is in the range [0, 104].
    -100 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        int expected = 3;
        var result = solution.maxDepth(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, null));
        int expected = 2;
        var result = solution.maxDepth(root);
        assertThat(result).isEqualTo(expected);
    }

}
