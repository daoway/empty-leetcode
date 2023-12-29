package com.blogspot.ostas.leetcode.all.easy.same_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: p = [1,2,3], q = [1,2,3]
    Output: true
    Example 2:
    Input: p = [1,2], q = [1,null,2]
    Output: false
    Example 3:
    Input: p = [1,2,1], q = [1,1,2]
    Output: false
      Constraints:
    The number of nodes in both trees is in the range [0, 100].
    -104 <= Node.val <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode q = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        boolean expected = true;
        var result = solution.isSameTree(p, q);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2, null, null));
        boolean expected = false;
        var result = solution.isSameTree(p, q);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(1, null, null));
        TreeNode q = new TreeNode(1, new TreeNode(1, null, null), new TreeNode(2, null, null));
        boolean expected = false;
        var result = solution.isSameTree(p, q);
        assertThat(result).isEqualTo(expected);
    }

}
