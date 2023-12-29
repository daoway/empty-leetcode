package com.blogspot.ostas.leetcode.all.easy.cousins_in_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4], x = 4, y = 3
    Output: false
    Example 2:
    Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
    Output: true
    Example 3:
    Input: root = [1,2,3,null,4], x = 2, y = 3
    Output: false
      Constraints:
    The number of nodes in the tree is in the range [2, 100].
    1 <= Node.val <= 100
    Each node has a unique value.
    x != y
    x and y are exist in the tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), null),
                new TreeNode(3, null, null));
        int x = 4;
        int y = 3;
        boolean expected = false;
        var result = solution.isCousins(root, x, y);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4, null, null)),
                new TreeNode(3, null, new TreeNode(5, null, null)));
        int x = 5;
        int y = 4;
        boolean expected = true;
        var result = solution.isCousins(root, x, y);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4, null, null)),
                new TreeNode(3, null, null));
        int x = 2;
        int y = 3;
        boolean expected = false;
        var result = solution.isCousins(root, x, y);
        assertThat(result).isEqualTo(expected);
    }

}
