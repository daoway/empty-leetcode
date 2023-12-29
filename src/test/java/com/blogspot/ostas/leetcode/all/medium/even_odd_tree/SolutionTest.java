package com.blogspot.ostas.leetcode.all.medium.even_odd_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
    Output: true
    Explanation: The node values on each level are:
    Level 0: [1]
    Level 1: [10,4]
    Level 2: [3,7,9]
    Level 3: [12,8,6,2]
    Since levels 0 and 2 are all odd and increasing and levels 1 and 3 are all even and decreasing, the tree is Even-Odd.
    Example 2:
    Input: root = [5,4,2,3,3,7]
    Output: false
    Explanation: The node values on each level are:
    Level 0: [5]
    Level 1: [4,2]
    Level 2: [3,3,7]
    Node values in level 2 must be in strictly increasing order, so the tree is not Even-Odd.
    Example 3:
    Input: root = [5,9,1,3,5,7]
    Output: false
    Explanation: Node values in the level 1 should be even integers.
      Constraints:
    The number of nodes in the tree is in the range [1, 105].
    1 <= Node.val <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1,
                new TreeNode(10, new TreeNode(3, new TreeNode(12, null, null), new TreeNode(8, null, null)),
                        null),
                new TreeNode(4, new TreeNode(7, new TreeNode(6, null, null), null),
                        new TreeNode(9, null, new TreeNode(2, null, null))));
        boolean expected = true;
        var result = solution.isEvenOddTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(5, new TreeNode(4, new TreeNode(3, null, null), new TreeNode(3, null, null)),
                        new TreeNode(2, new TreeNode(7, null, null), null));
        boolean expected = false;
        var result = solution.isEvenOddTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(5, new TreeNode(9, new TreeNode(3, null, null), new TreeNode(5, null, null)),
                        new TreeNode(1, new TreeNode(7, null, null), null));
        boolean expected = false;
        var result = solution.isEvenOddTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
