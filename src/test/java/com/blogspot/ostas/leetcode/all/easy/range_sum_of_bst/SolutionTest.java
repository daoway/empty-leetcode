package com.blogspot.ostas.leetcode.all.easy.range_sum_of_bst;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
    Output: 32
    Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
    Example 2:
    Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
    Output: 23
    Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
      Constraints:
    The number of nodes in the tree is in the range [1, 2 * 104].
    1 <= Node.val <= 105
    1 <= low <= high <= 105
    All Node.val are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(10, new TreeNode(5, new TreeNode(3, null, null), new TreeNode(7, null, null)),
                        new TreeNode(15, null, new TreeNode(18, null, null)));
        int low = 7;
        int high = 15;
        int expected = 32;
        var result = solution.rangeSumBST(root, low, high);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3, new TreeNode(1, null, null), null),
                        new TreeNode(7, new TreeNode(6, null, null), null)),
                new TreeNode(15, new TreeNode(13, null, null), new TreeNode(18, null, null)));
        int low = 6;
        int high = 10;
        int expected = 23;
        var result = solution.rangeSumBST(root, low, high);
        assertThat(result).isEqualTo(expected);
    }

}
