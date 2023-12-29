package com.blogspot.ostas.leetcode.all.medium.house_robber_iii;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,2,3,null,3,null,1]
    Output: 7
    Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
    Example 2:
    Input: root = [3,4,5,1,3,null,1]
    Output: 9
    Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    0 <= Node.val <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(2, null, new TreeNode(3, null, null)),
                new TreeNode(3, null, new TreeNode(1, null, null)));
        int expected = 7;
        var result = solution.rob(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(3, new TreeNode(4, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(5, null, new TreeNode(1, null, null)));
        int expected = 9;
        var result = solution.rob(root);
        assertThat(result).isEqualTo(expected);
    }

}
