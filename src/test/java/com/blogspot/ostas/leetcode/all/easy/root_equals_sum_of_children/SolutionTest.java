package com.blogspot.ostas.leetcode.all.easy.root_equals_sum_of_children;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [10,4,6]
    Output: true
    Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
    10 is equal to 4 + 6, so we return true.
    Example 2:
    Input: root = [5,3,1]
    Output: false
    Explanation: The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
    5 is not equal to 3 + 1, so we return false.
      Constraints:
    The tree consists only of the root, its left child, and its right child.
    -100 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(10, new TreeNode(4, null, null), new TreeNode(6, null, null));
        boolean expected = true;
        var result = solution.checkTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(3, null, null), new TreeNode(1, null, null));
        boolean expected = false;
        var result = solution.checkTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
