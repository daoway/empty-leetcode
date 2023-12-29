package com.blogspot.ostas.leetcode.all.medium.distribute_coins_in_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,0,0]
    Output: 2
    Explanation: From the root of the tree, we move one coin to its left child, and one coin to its right child.
    Example 2:
    Input: root = [0,3,0]
    Output: 3
    Explanation: From the left child of the root, we move two coins to the root [taking two moves]. Then, we move one coin from the root of the tree to the right child.
      Constraints:
    The number of nodes in the tree is n.
    1 <= n <= 100
    0 <= Node.val <= n
    The sum of all Node.val is n.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(0, null, null), new TreeNode(0, null, null));
        int expected = 2;
        var result = solution.distributeCoins(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0, new TreeNode(3, null, null), new TreeNode(0, null, null));
        int expected = 3;
        var result = solution.distributeCoins(root);
        assertThat(result).isEqualTo(expected);
    }

}
