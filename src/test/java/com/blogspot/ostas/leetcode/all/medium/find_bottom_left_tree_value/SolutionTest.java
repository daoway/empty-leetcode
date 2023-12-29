package com.blogspot.ostas.leetcode.all.medium.find_bottom_left_tree_value;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [2,1,3]
    Output: 1
    Example 2:
    Input: root = [1,2,3,4,null,5,6,null,null,7]
    Output: 7
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -231 <= Node.val <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        int expected = 1;
        var result = solution.findBottomLeftValue(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), null),
                new TreeNode(3, new TreeNode(5, new TreeNode(7, null, null), null),
                        new TreeNode(6, null, null)));
        int expected = 7;
        var result = solution.findBottomLeftValue(root);
        assertThat(result).isEqualTo(expected);
    }

}
