package com.blogspot.ostas.leetcode.all.medium.delete_leaves_with_a_given_value;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,2,null,2,4], target = 2
    Output: [1,null,3,null,4]
    Explanation: Leaf nodes in green with value (target = 2) are removed (Picture in left).
    After removing, new nodes become leaf nodes with value (target = 2) (Picture in center).
    Example 2:
    Input: root = [1,3,3,3,2], target = 3
    Output: [1,3,null,null,2]
    Example 3:
    Input: root = [1,2,null,2,null,2], target = 2
    Output: [1]
    Explanation: Leaf nodes in green with value (target = 2) are removed at each step.
      Constraints:
    The number of nodes in the tree is in the range [1, 3000].
    1 <= Node.val, target <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(2, null, null), null),
                new TreeNode(3, new TreeNode(2, null, null), new TreeNode(4, null, null)));
        int target = 2;
        TreeNode expected = new TreeNode(1, null, new TreeNode(3, null, new TreeNode(4, null, null)));
        var result = solution.removeLeafNodes(root, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(3, new TreeNode(3, null, null), new TreeNode(2, null, null)),
                        new TreeNode(3, null, null));
        int target = 3;
        TreeNode expected = new TreeNode(1, new TreeNode(3, null, new TreeNode(2, null, null)), null);
        var result = solution.removeLeafNodes(root, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(2, new TreeNode(2, new TreeNode(2, null, null), null), null),
                        null);
        int target = 2;
        TreeNode expected = new TreeNode(1, null, null);
        var result = solution.removeLeafNodes(root, target);
        assertThat(result).isEqualTo(expected);
    }

}
