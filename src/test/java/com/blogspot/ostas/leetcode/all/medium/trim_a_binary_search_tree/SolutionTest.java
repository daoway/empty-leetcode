package com.blogspot.ostas.leetcode.all.medium.trim_a_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,0,2], low = 1, high = 2
    Output: [1,null,2]
    Example 2:
    Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
    Output: [3,2,null,1]
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    0 <= Node.val <= 104
    The value of each node in the tree is unique.
    root is guaranteed to be a valid binary search tree.
    0 <= low <= high <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(0, null, null), new TreeNode(2, null, null));
        int low = 1;
        int high = 2;
        TreeNode expected = new TreeNode(1, null, new TreeNode(2, null, null));
        var result = solution.trimBST(root, low, high);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(3, new TreeNode(0, null, new TreeNode(2, new TreeNode(1, null, null), null)),
                        new TreeNode(4, null, null));
        int low = 1;
        int high = 3;
        TreeNode expected = new TreeNode(3, new TreeNode(2, new TreeNode(1, null, null), null), null);
        var result = solution.trimBST(root, low, high);
        assertThat(result).isEqualTo(expected);
    }

}
