package com.blogspot.ostas.leetcode.all.medium.add_one_row_to_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [4,2,6,3,1,5], val = 1, depth = 2
    Output: [4,1,1,2,null,null,6,3,1,5]
    Example 2:
    Input: root = [4,2,null,3,1], val = 1, depth = 3
    Output: [4,2,null,1,1,3,null,null,1]
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    The depth of the tree is in the range [1, 104].
    -100 <= Node.val <= 100
    -105 <= val <= 105
    1 <= depth <= the depth of tree + 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(1, null, null)),
                        new TreeNode(6, new TreeNode(5, null, null), null));
        int val = 1;
        int depth = 2;
        TreeNode expected = new TreeNode(4,
                new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(1, null, null)),
                        null),
                new TreeNode(1, null, new TreeNode(6, new TreeNode(5, null, null), null)));
        var result = solution.addOneRow(root, val, depth);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(1, null, null)),
                        null);
        int val = 1;
        int depth = 3;
        TreeNode expected =
                new TreeNode(4, new TreeNode(2, new TreeNode(1, new TreeNode(3, null, null), null),
                        new TreeNode(1, null, new TreeNode(1, null, null))), null);
        var result = solution.addOneRow(root, val, depth);
        assertThat(result).isEqualTo(expected);
    }

}
