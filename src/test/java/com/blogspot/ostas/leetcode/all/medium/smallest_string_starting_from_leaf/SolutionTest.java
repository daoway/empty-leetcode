package com.blogspot.ostas.leetcode.all.medium.smallest_string_starting_from_leaf;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [0,1,2,3,4,3,4]
    Output: "dba"
    Example 2:
    Input: root = [25,1,3,1,3,0,2]
    Output: "adz"
    Example 3:
    Input: root = [2,2,1,null,1,0,null,0]
    Output: "abc"
      Constraints:
    The number of nodes in the tree is in the range [1, 8500].
    0 <= Node.val <= 25
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(0, new TreeNode(1, new TreeNode(3, null, null), new TreeNode(4, null, null)),
                        new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)));
        String expected = "dba";
        var result = solution.smallestFromLeaf(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(25, new TreeNode(1, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(3, new TreeNode(0, null, null), new TreeNode(2, null, null)));
        String expected = "adz";
        var result = solution.smallestFromLeaf(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(2, new TreeNode(2, null, new TreeNode(1, new TreeNode(0, null, null), null)),
                        new TreeNode(1, new TreeNode(0, null, null), null));
        String expected = "abc";
        var result = solution.smallestFromLeaf(root);
        assertThat(result).isEqualTo(expected);
    }

}
