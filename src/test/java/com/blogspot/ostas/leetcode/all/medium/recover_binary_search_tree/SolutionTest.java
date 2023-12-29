package com.blogspot.ostas.leetcode.all.medium.recover_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
        Example 1:
    Input: root = [1,3,null,null,2]
    Output: [3,1,null,null,2]
    Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.
    Example 2:
    Input: root = [3,1,4,null,null,2]
    Output: [2,1,4,null,null,3]
    Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid.
      Constraints:
    The number of nodes in the tree is in the range [2, 1000].
    -231 <= Node.val <= 231 - 1
      Follow up: A solution using O(n) space is pretty straight-forward. Could you devise a constant O(1) space solution?
    */

    @Test
    void test_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(3, null, new TreeNode(2, null, null)), null);
        TreeNode expected = new TreeNode(3, new TreeNode(1, null, new TreeNode(2, null, null)), null);
        solution.recoverTree(root);
        assertThat(root).isEqualTo(expected);
    }

    @Test
    void test_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(1, null, null), new TreeNode(4, new TreeNode(2, null, null), null));
        TreeNode expected = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(4, new TreeNode(3, null, null), null));
        solution.recoverTree(root);
        assertThat(root).isEqualTo(expected);
    }

}
