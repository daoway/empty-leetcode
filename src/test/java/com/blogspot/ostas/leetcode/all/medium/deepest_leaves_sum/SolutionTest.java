package com.blogspot.ostas.leetcode.all.medium.deepest_leaves_sum;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
    Output: 15
    Example 2:
    Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
    Output: 19
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    1 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(7, null, null), null),
                        new TreeNode(5, null, null)),
                new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8, null, null))));
        int expected = 15;
        var result = solution.deepestLeavesSum(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(6,
                new TreeNode(7, new TreeNode(2, new TreeNode(9, null, null), null),
                        new TreeNode(7, new TreeNode(1, null, null), new TreeNode(4, null, null))),
                new TreeNode(8, new TreeNode(1, null, null),
                        new TreeNode(3, null, new TreeNode(5, null, null))));
        int expected = 19;
        var result = solution.deepestLeavesSum(root);
        assertThat(result).isEqualTo(expected);
    }

}
