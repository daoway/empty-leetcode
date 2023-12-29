package com.blogspot.ostas.leetcode.all.easy.increasing_order_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
    Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
    Example 2:
    Input: root = [5,1,7]
    Output: [1,null,5,null,7]
      Constraints:
    The number of nodes in the given tree will be in the range [1, 100].
    0 <= Node.val <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2, new TreeNode(1, null, null), null),
                        new TreeNode(4, null, null)),
                new TreeNode(6, null,
                        new TreeNode(8, new TreeNode(7, null, null), new TreeNode(9, null, null))));
        TreeNode expected = new TreeNode(1, null,
                new TreeNode(2, null,
                        new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6,
                                null,
                                new TreeNode(7, null, new TreeNode(8, null, new TreeNode(9, null, null)))))))));
        var result = solution.increasingBST(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(1, null, null), new TreeNode(7, null, null));
        TreeNode expected = new TreeNode(1, null, new TreeNode(5, null, new TreeNode(7, null, null)));
        var result = solution.increasingBST(root);
        assertThat(result).isEqualTo(expected);
    }

}
