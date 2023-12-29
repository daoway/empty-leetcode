package com.blogspot.ostas.leetcode.all.easy.merge_two_binary_trees;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
    Output: [3,4,5,5,4,null,7]
    Example 2:
    Input: root1 = [1], root2 = [1,2]
    Output: [2,2]
      Constraints:
    The number of nodes in both trees is in the range [0, 2000].
    -104 <= Node.val <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5, null, null), null),
                new TreeNode(2, null, null));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4, null, null)),
                new TreeNode(3, null, new TreeNode(7, null, null)));
        TreeNode expected =
                new TreeNode(3, new TreeNode(4, new TreeNode(5, null, null), new TreeNode(4, null, null)),
                        new TreeNode(5, null, new TreeNode(7, null, null)));
        var result = solution.mergeTrees(root1, root2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root1 = new TreeNode(1, null, null);
        TreeNode root2 = new TreeNode(1, new TreeNode(2, null, null), null);
        TreeNode expected = new TreeNode(2, new TreeNode(2, null, null), null);
        var result = solution.mergeTrees(root1, root2);
        assertThat(result).isEqualTo(expected);
    }

}
