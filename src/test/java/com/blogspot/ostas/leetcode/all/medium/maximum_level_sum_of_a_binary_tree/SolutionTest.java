package com.blogspot.ostas.leetcode.all.medium.maximum_level_sum_of_a_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,7,0,7,-8,null,null]
    Output: 2
    Explanation:
    Level 1 sum = 1.
    Level 2 sum = 7 + 0 = 7.
    Level 3 sum = 7 + -8 = -1.
    So we return the level with the maximum sum which is level 2.
    Example 2:
    Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
    Output: 2
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -105 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(7, new TreeNode(7, null, null), new TreeNode(-8, null, null)),
                        new TreeNode(0, null, null));
        int expected = 2;
        var result = solution.maxLevelSum(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(989, null, new TreeNode(10250, new TreeNode(98693, null, null),
                new TreeNode(-89388, null, new TreeNode(-32127, null, null))));
        int expected = 2;
        var result = solution.maxLevelSum(root);
        assertThat(result).isEqualTo(expected);
    }

}
