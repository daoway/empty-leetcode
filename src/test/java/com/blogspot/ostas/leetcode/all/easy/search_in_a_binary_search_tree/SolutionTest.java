package com.blogspot.ostas.leetcode.all.easy.search_in_a_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [4,2,7,1,3], val = 2
    Output: [2,1,3]
    Example 2:
    Input: root = [4,2,7,1,3], val = 5
    Output: []
      Constraints:
    The number of nodes in the tree is in the range [1, 5000].
    1 <= Node.val <= 107
    root is a binary search tree.
    1 <= val <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(7, null, null));
        int val = 2;
        TreeNode expected = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        var result = solution.searchBST(root, val);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(7, null, null));
        int val = 5;
        TreeNode expected = null;
        var result = solution.searchBST(root, val);
        assertThat(result).isEqualTo(expected);
    }

}
