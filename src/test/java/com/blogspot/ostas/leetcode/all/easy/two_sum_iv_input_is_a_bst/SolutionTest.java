package com.blogspot.ostas.leetcode.all.easy.two_sum_iv_input_is_a_bst;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [5,3,6,2,4,null,7], k = 9
    Output: true
    Example 2:
    Input: root = [5,3,6,2,4,null,7], k = 28
    Output: false
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -104 <= Node.val <= 104
    root is guaranteed to be a valid binary search tree.
    -105 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(5, new TreeNode(3, new TreeNode(2, null, null), new TreeNode(4, null, null)),
                        new TreeNode(6, null, new TreeNode(7, null, null)));
        int k = 9;
        boolean expected = true;
        var result = solution.findTarget(root, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(5, new TreeNode(3, new TreeNode(2, null, null), new TreeNode(4, null, null)),
                        new TreeNode(6, null, new TreeNode(7, null, null)));
        int k = 28;
        boolean expected = false;
        var result = solution.findTarget(root, k);
        assertThat(result).isEqualTo(expected);
    }

}
