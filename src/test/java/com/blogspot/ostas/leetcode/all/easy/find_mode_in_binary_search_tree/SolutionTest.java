package com.blogspot.ostas.leetcode.all.easy.find_mode_in_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,null,2,2]
    Output: [2]
    Example 2:
    Input: root = [0]
    Output: [0]
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -105 <= Node.val <= 105
      Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(2, null, null), null));
        int[] expected = new int[]{2};
        var result = solution.findMode(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0, null, null);
        int[] expected = new int[]{0};
        var result = solution.findMode(root);
        assertThat(result).isEqualTo(expected);
    }

}
