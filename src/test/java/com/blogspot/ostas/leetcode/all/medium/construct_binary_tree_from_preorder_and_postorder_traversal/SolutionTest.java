package com.blogspot.ostas.leetcode.all.medium.construct_binary_tree_from_preorder_and_postorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1]
    Output: [1,2,3,4,5,6,7]
    Example 2:
    Input: preorder = [1], postorder = [1]
    Output: [1]
      Constraints:
    1 <= preorder.length <= 30
    1 <= preorder[i] <= preorder.length
    All the values of preorder are unique.
    postorder.length == preorder.length
    1 <= postorder[i] <= postorder.length
    All the values of postorder are unique.
    It is guaranteed that preorder and postorder are the preorder traversal and postorder traversal of the same binary tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] preorder = new int[]{1, 2, 4, 5, 3, 6, 7};
        int[] postorder = new int[]{4, 5, 2, 6, 7, 3, 1};
        TreeNode expected =
                new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                        new TreeNode(3, new TreeNode(6, null, null), new TreeNode(7, null, null)));
        var result = solution.constructFromPrePost(preorder, postorder);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] preorder = new int[]{1};
        int[] postorder = new int[]{1};
        TreeNode expected = new TreeNode(1, null, null);
        var result = solution.constructFromPrePost(preorder, postorder);
        assertThat(result).isEqualTo(expected);
    }

}
