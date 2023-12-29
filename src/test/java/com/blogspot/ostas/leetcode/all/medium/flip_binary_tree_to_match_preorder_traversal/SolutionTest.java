package com.blogspot.ostas.leetcode.all.medium.flip_binary_tree_to_match_preorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2], voyage = [2,1]
    Output: [-1]
    Explanation: It is impossible to flip the nodes such that the pre-order traversal matches voyage.
    Example 2:
    Input: root = [1,2,3], voyage = [1,3,2]
    Output: [1]
    Explanation: Flipping node 1 swaps nodes 2 and 3, so the pre-order traversal matches voyage.
    Example 3:
    Input: root = [1,2,3], voyage = [1,2,3]
    Output: []
    Explanation: The tree's pre-order traversal already matches voyage, so no nodes need to be flipped.
      Constraints:
    The number of nodes in the tree is n.
    n == voyage.length
    1 <= n <= 100
    1 <= Node.val, voyage[i] <= n
    All the values in the tree are unique.
    All the values in voyage are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), null);
        int[] voyage = new int[]{2, 1};
        List<Integer> expected = List.of(1);
        var result = solution.flipMatchVoyage(root, voyage);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        int[] voyage = new int[]{1, 3, 2};
        List<Integer> expected = List.of(1);
        var result = solution.flipMatchVoyage(root, voyage);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        int[] voyage = new int[]{1, 2, 3};
        List<Integer> expected = List.of();
        var result = solution.flipMatchVoyage(root, voyage);
        assertThat(result).isEqualTo(expected);
    }

}
