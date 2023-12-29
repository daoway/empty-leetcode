package com.blogspot.ostas.leetcode.all.easy.sum_of_root_to_leaf_binary_numbers;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,0,1,0,1,0,1]
    Output: 22
    Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
    Example 2:
    Input: root = [0]
    Output: 0
      Constraints:
    The number of nodes in the tree is in the range [1, 1000].
    Node.val is 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(0, new TreeNode(0, null, null), new TreeNode(1, null, null)),
                        new TreeNode(1, new TreeNode(0, null, null), new TreeNode(1, null, null)));
        int expected = 22;
        var result = solution.sumRootToLeaf(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0, null, null);
        int expected = 0;
        var result = solution.sumRootToLeaf(root);
        assertThat(result).isEqualTo(expected);
    }

}
