package com.blogspot.ostas.leetcode.all.easy.binary_tree_inorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,null,2,3]
    Output: [1,3,2]
    Example 2:
    Input: root = []
    Output: []
    Example 3:
    Input: root = [1]
    Output: [1]
      Constraints:
    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100
      Follow up: Recursive solution is trivial, could you do it iteratively?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        List<Integer> expected = List.of(1, 3, 2);
        var result = solution.inorderTraversal(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = null;
        List<Integer> expected = List.of();
        var result = solution.inorderTraversal(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        List<Integer> expected = List.of(1);
        var result = solution.inorderTraversal(root);
        assertThat(result).isEqualTo(expected);
    }

}
