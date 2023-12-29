package com.blogspot.ostas.leetcode.all.medium.validate_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [2,1,3]
    Output: true
    Example 2:
    Input: root = [5,1,4,null,null,3,6]
    Output: false
    Explanation: The root node's value is 5 but its right child's value is 4.
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -231 <= Node.val <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        boolean expected = true;
        var result = solution.isValidBST(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(1, null, null),
                new TreeNode(4, new TreeNode(3, null, null), new TreeNode(6, null, null)));
        boolean expected = false;
        var result = solution.isValidBST(root);
        assertThat(result).isEqualTo(expected);
    }

}
