package com.blogspot.ostas.leetcode.all.medium.count_nodes_equal_to_average_of_subtree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [4,8,5,0,1,null,6]
    Output: 5
    Explanation:
    For the node with value 4: The average of its subtree is (4 + 8 + 5 + 0 + 1 + 6) / 6 = 24 / 6 = 4.
    For the node with value 5: The average of its subtree is (5 + 6) / 2 = 11 / 2 = 5.
    For the node with value 0: The average of its subtree is 0 / 1 = 0.
    For the node with value 1: The average of its subtree is 1 / 1 = 1.
    For the node with value 6: The average of its subtree is 6 / 1 = 6.
    Example 2:
    Input: root = [1]
    Output: 1
    Explanation: For the node with value 1: The average of its subtree is 1 / 1 = 1.
      Constraints:
    The number of nodes in the tree is in the range [1, 1000].
    0 <= Node.val <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(8, new TreeNode(0, null, null), new TreeNode(1, null, null)),
                        new TreeNode(5, null, new TreeNode(6, null, null)));
        int expected = 5;
        var result = solution.averageOfSubtree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        int expected = 1;
        var result = solution.averageOfSubtree(root);
        assertThat(result).isEqualTo(expected);
    }

}
