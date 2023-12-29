package com.blogspot.ostas.leetcode.all.medium.binary_tree_coloring_game;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4,5,6,7,8,9,10,11], n = 11, x = 3
    Output: true
    Explanation: The second player can choose the node with value 2.
    Example 2:
    Input: root = [1,2,3], n = 3, x = 1
    Output: false
      Constraints:
    The number of nodes in the tree is n.
    1 <= x <= n <= 100
    n is odd.
    1 <= Node.val <= n
    All the values of the tree are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(8, null, null), new TreeNode(9, null, null)),
                        new TreeNode(5, new TreeNode(10, null, null), new TreeNode(11, null, null))),
                new TreeNode(3, new TreeNode(6, null, null), new TreeNode(7, null, null)));
        int n = 11;
        int x = 3;
        boolean expected = true;
        var result = solution.btreeGameWinningMove(root, n, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        int n = 3;
        int x = 1;
        boolean expected = false;
        var result = solution.btreeGameWinningMove(root, n, x);
        assertThat(result).isEqualTo(expected);
    }

}
