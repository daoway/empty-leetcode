package com.blogspot.ostas.leetcode.all.medium.construct_binary_tree_from_inorder_and_postorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
    Output: [3,9,20,null,null,15,7]
    Example 2:
    Input: inorder = [-1], postorder = [-1]
    Output: [-1]
      Constraints:
    1 <= inorder.length <= 3000
    postorder.length == inorder.length
    -3000 <= inorder[i], postorder[i] <= 3000
    inorder and postorder consist of unique values.
    Each value of postorder also appears in inorder.
    inorder is guaranteed to be the inorder traversal of the tree.
    postorder is guaranteed to be the postorder traversal of the tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};
        TreeNode expected = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        var result = solution.buildTree(inorder, postorder);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] inorder = new int[]{-1};
        int[] postorder = new int[]{-1};
        TreeNode expected = new TreeNode(-1, null, null);
        var result = solution.buildTree(inorder, postorder);
        assertThat(result).isEqualTo(expected);
    }

}
