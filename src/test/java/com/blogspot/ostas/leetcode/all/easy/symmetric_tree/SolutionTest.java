package com.blogspot.ostas.leetcode.all.easy.symmetric_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,2,3,4,4,3]
    Output: true
    Example 2:
    Input: root = [1,2,2,null,3,null,3]
    Output: false
      Constraints:
    The number of nodes in the tree is in the range [1, 1000].
    -100 <= Node.val <= 100
      Follow up: Could you solve it both recursively and iteratively?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)),
                        new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null)));
        boolean expected = true;
        var result = solution.isSymmetric(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3, null, null)),
                new TreeNode(2, null, new TreeNode(3, null, null)));
        boolean expected = false;
        var result = solution.isSymmetric(root);
        assertThat(result).isEqualTo(expected);
    }

}
