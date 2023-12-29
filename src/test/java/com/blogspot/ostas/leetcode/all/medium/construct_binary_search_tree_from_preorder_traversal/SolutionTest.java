package com.blogspot.ostas.leetcode.all.medium.construct_binary_search_tree_from_preorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: preorder = [8,5,1,7,10,12]
    Output: [8,5,10,1,7,null,12]
    Example 2:
    Input: preorder = [1,3]
    Output: [1,null,3]
      Constraints:
    1 <= preorder.length <= 100
    1 <= preorder[i] <= 1000
    All the values of preorder are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] preorder = new int[]{8, 5, 1, 7, 10, 12};
        TreeNode expected =
                new TreeNode(8, new TreeNode(5, new TreeNode(1, null, null), new TreeNode(7, null, null)),
                        new TreeNode(10, null, new TreeNode(12, null, null)));
        var result = solution.bstFromPreorder(preorder);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] preorder = new int[]{1, 3};
        TreeNode expected = new TreeNode(1, null, new TreeNode(3, null, null));
        var result = solution.bstFromPreorder(preorder);
        assertThat(result).isEqualTo(expected);
    }

}
