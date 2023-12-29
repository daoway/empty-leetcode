package com.blogspot.ostas.leetcode.all.medium.check_completeness_of_a_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4,5,6]
    Output: true
    Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.
    Example 2:
    Input: root = [1,2,3,4,5,null,7]
    Output: false
    Explanation: The node with value 7 isn't as far left as possible.
      Constraints:
    The number of nodes in the tree is in the range [1, 100].
    1 <= Node.val <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                        new TreeNode(3, new TreeNode(6, null, null), null));
        boolean expected = true;
        var result = solution.isCompleteTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                        new TreeNode(3, null, new TreeNode(7, null, null)));
        boolean expected = false;
        var result = solution.isCompleteTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
