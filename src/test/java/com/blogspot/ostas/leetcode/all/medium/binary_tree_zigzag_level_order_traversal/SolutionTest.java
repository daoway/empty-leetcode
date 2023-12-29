package com.blogspot.ostas.leetcode.all.medium.binary_tree_zigzag_level_order_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: [[3],[20,9],[15,7]]
    Example 2:
    Input: root = [1]
    Output: [[1]]
    Example 3:
    Input: root = []
    Output: []
      Constraints:
    The number of nodes in the tree is in the range [0, 2000].
    -100 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        List<List<Integer>> expected = List.of(List.of(3), List.of(20, 9), List.of(15, 7));
        var result = solution.zigzagLevelOrder(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        List<List<Integer>> expected = List.of(List.of(1));
        var result = solution.zigzagLevelOrder(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = null;
        List<List<Integer>> expected = List.of();
        var result = solution.zigzagLevelOrder(root);
        assertThat(result).isEqualTo(expected);
    }

}
