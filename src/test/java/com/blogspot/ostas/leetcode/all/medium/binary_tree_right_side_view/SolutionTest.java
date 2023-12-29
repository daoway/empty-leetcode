package com.blogspot.ostas.leetcode.all.medium.binary_tree_right_side_view;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,null,5,null,4]
    Output: [1,3,4]
    Example 2:
    Input: root = [1,null,3]
    Output: [1,3]
    Example 3:
    Input: root = []
    Output: []
      Constraints:
    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5, null, null)),
                new TreeNode(3, null, new TreeNode(4, null, null)));
        List<Integer> expected = List.of(1, 3, 4);
        var result = solution.rightSideView(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(3, null, null));
        List<Integer> expected = List.of(1, 3);
        var result = solution.rightSideView(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = null;
        List<Integer> expected = List.of();
        var result = solution.rightSideView(root);
        assertThat(result).isEqualTo(expected);
    }

}
