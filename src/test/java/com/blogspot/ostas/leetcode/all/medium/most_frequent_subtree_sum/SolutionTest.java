package com.blogspot.ostas.leetcode.all.medium.most_frequent_subtree_sum;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [5,2,-3]
    Output: [2,-3,4]
    Example 2:
    Input: root = [5,2,-5]
    Output: [2]
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -105 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(2, null, null), new TreeNode(-3, null, null));
        int[] expected = new int[]{2, -3, 4};
        var result = solution.findFrequentTreeSum(root);
        assertThat(result).containsExactlyInAnyOrder(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(2, null, null), new TreeNode(-5, null, null));
        int[] expected = new int[]{2};
        var result = solution.findFrequentTreeSum(root);
        assertThat(result).isEqualTo(expected);
    }

}
