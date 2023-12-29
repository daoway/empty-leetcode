package com.blogspot.ostas.leetcode.all.hard.binary_tree_cameras;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [0,0,null,0,0]
    Output: 1
    Explanation: One camera is enough to monitor all nodes if placed as shown.
    Example 2:
    Input: root = [0,0,null,0,null,0,null,null,0]
    Output: 2
    Explanation: At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.
      Constraints:
    The number of nodes in the tree is in the range [1, 1000].
    Node.val == 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(0, new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null)),
                        null);
        int expected = 1;
        var result = solution.minCameraCover(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0,
                new TreeNode(0, new TreeNode(0, new TreeNode(0, null, new TreeNode(0, null, null)), null),
                        null), null);
        int expected = 2;
        var result = solution.minCameraCover(root);
        assertThat(result).isEqualTo(expected);
    }

}
