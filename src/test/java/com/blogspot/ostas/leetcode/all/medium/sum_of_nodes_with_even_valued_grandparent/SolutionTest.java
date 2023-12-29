package com.blogspot.ostas.leetcode.all.medium.sum_of_nodes_with_even_valued_grandparent;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
    Output: 18
    Explanation: The red nodes are the nodes with even-value grandparent while the blue nodes are the even-value grandparents.
    Example 2:
    Input: root = [1]
    Output: 0
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    1 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(6,
                new TreeNode(7, new TreeNode(2, new TreeNode(9, null, null), null),
                        new TreeNode(7, new TreeNode(1, null, null), new TreeNode(4, null, null))),
                new TreeNode(8, new TreeNode(1, null, null),
                        new TreeNode(3, null, new TreeNode(5, null, null))));
        int expected = 18;
        var result = solution.sumEvenGrandparent(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        int expected = 0;
        var result = solution.sumEvenGrandparent(root);
        assertThat(result).isEqualTo(expected);
    }

}
