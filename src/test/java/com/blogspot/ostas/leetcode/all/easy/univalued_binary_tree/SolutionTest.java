package com.blogspot.ostas.leetcode.all.easy.univalued_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,1,1,1,1,null,1]
    Output: true
    Example 2:
    Input: root = [2,2,2,5,2]
    Output: false
      Constraints:
    The number of nodes in the tree is in the range [1, 100].
    0 <= Node.val < 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(1, new TreeNode(1, null, null), new TreeNode(1, null, null)),
                        new TreeNode(1, null, new TreeNode(1, null, null)));
        boolean expected = true;
        var result = solution.isUnivalTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(2, new TreeNode(2, new TreeNode(5, null, null), new TreeNode(2, null, null)),
                        new TreeNode(2, null, null));
        boolean expected = false;
        var result = solution.isUnivalTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
