package com.blogspot.ostas.leetcode.all.medium.insufficient_nodes_in_root_to_leaf_paths;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = 1
    Output: [1,2,3,4,null,null,7,8,9,null,14]
    Example 2:
    Input: root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22
    Output: [5,4,8,11,null,17,4,7,null,null,null,5]
    Example 3:
    Input: root = [1,2,-3,-5,null,4,null], limit = -1
    Output: [1,null,-3,4]
      Constraints:
    The number of nodes in the tree is in the range [1, 5000].
    -105 <= Node.val <= 105
    -109 <= limit <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(8, null, null), new TreeNode(9, null, null)),
                        new TreeNode(-99, new TreeNode(-99, null, null), new TreeNode(-99, null, null))),
                new TreeNode(3,
                        new TreeNode(-99, new TreeNode(12, null, null), new TreeNode(13, null, null)),
                        new TreeNode(7, new TreeNode(-99, null, null), new TreeNode(14, null, null))));
        int limit = 1;
        TreeNode expected = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(8, null, null), new TreeNode(9, null, null)),
                        null),
                new TreeNode(3, null, new TreeNode(7, null, new TreeNode(14, null, null))));
        var result = solution.sufficientSubset(root, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7, null, null), new TreeNode(1, null, null)),
                        null),
                new TreeNode(8, new TreeNode(17, null, null),
                        new TreeNode(4, new TreeNode(5, null, null), new TreeNode(3, null, null))));
        int limit = 22;
        TreeNode expected =
                new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7, null, null), null), null),
                        new TreeNode(8, new TreeNode(17, null, null),
                                new TreeNode(4, new TreeNode(5, null, null), null)));
        var result = solution.sufficientSubset(root, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(-5, null, null), null),
                new TreeNode(-3, new TreeNode(4, null, null), null));
        int limit = -1;
        TreeNode expected = new TreeNode(1, null, new TreeNode(-3, new TreeNode(4, null, null), null));
        var result = solution.sufficientSubset(root, limit);
        assertThat(result).isEqualTo(expected);
    }

}
