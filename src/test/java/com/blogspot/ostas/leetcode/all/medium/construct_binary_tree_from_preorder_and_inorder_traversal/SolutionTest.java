package com.blogspot.ostas.leetcode.all.medium.construct_binary_tree_from_preorder_and_inorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
    Output: [3,9,20,null,null,15,7]
    Example 2:
    Input: preorder = [-1], inorder = [-1]
    Output: [-1]
      Constraints:
    1 <= preorder.length <= 3000
    inorder.length == preorder.length
    -3000 <= preorder[i], inorder[i] <= 3000
    preorder and inorder consist of unique values.
    Each value of inorder also appears in preorder.
    preorder is guaranteed to be the preorder traversal of the tree.
    inorder is guaranteed to be the inorder traversal of the tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode expected = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        var result = solution.buildTree(preorder, inorder);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] preorder = new int[]{-1};
        int[] inorder = new int[]{-1};
        TreeNode expected = new TreeNode(-1, null, null);
        var result = solution.buildTree(preorder, inorder);
        assertThat(result).isEqualTo(expected);
    }

}
