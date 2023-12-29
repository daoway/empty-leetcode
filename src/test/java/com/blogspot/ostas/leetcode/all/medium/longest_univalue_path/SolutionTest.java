package com.blogspot.ostas.leetcode.all.medium.longest_univalue_path;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [5,4,5,1,1,null,5]
    Output: 2
    Explanation: The shown image shows that the longest path of the same value (i.e. 5).
    Example 2:
    Input: root = [1,4,5,4,4,null,5]
    Output: 2
    Explanation: The shown image shows that the longest path of the same value (i.e. 4).
      Constraints:
    The number of nodes in the tree is in the range [0, 104].
    -1000 <= Node.val <= 1000
    The depth of the tree will not exceed 1000.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(5, new TreeNode(4, new TreeNode(1, null, null), new TreeNode(1, null, null)),
                        new TreeNode(5, null, new TreeNode(5, null, null)));
        int expected = 2;
        var result = solution.longestUnivaluePath(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(4, new TreeNode(4, null, null), new TreeNode(4, null, null)),
                        new TreeNode(5, null, new TreeNode(5, null, null)));
        int expected = 2;
        var result = solution.longestUnivaluePath(root);
        assertThat(result).isEqualTo(expected);
    }

}
