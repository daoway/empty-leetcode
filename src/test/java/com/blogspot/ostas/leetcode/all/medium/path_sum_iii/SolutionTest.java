package com.blogspot.ostas.leetcode.all.medium.path_sum_iii;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
    Output: 3
    Explanation: The paths that sum to 8 are shown.
    Example 2:
    Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
    Output: 3
      Constraints:
    The number of nodes in the tree is in the range [0, 1000].
    -109 <= Node.val <= 109
    -1000 <= targetSum <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3, new TreeNode(3, null, null), new TreeNode(-2, null, null)),
                        new TreeNode(2, null, new TreeNode(1, null, null))),
                new TreeNode(-3, null, new TreeNode(11, null, null)));
        int targetSum = 8;
        int expected = 3;
        var result = solution.pathSum(root, targetSum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7, null, null), new TreeNode(2, null, null)),
                        null),
                new TreeNode(8, new TreeNode(13, null, null),
                        new TreeNode(4, new TreeNode(5, null, null), new TreeNode(1, null, null))));
        int targetSum = 22;
        int expected = 3;
        var result = solution.pathSum(root, targetSum);
        assertThat(result).isEqualTo(expected);
    }

}
