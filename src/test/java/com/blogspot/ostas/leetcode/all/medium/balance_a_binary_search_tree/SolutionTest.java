package com.blogspot.ostas.leetcode.all.medium.balance_a_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,null,2,null,3,null,4,null,null]
    Output: [2,1,3,null,null,null,4]
    Explanation: This is not the only correct answer, [3,1,4,null,2] is also correct.
    Example 2:
    Input: root = [2,1,3]
    Output: [2,1,3]
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    1 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null,
                new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, null))));
        TreeNode expected = new TreeNode(2, new TreeNode(1, null, null),
                new TreeNode(3, null, new TreeNode(4, null, null)));
        var result = solution.balanceBST(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        TreeNode expected = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        var result = solution.balanceBST(root);
        assertThat(result).isEqualTo(expected);
    }

}
