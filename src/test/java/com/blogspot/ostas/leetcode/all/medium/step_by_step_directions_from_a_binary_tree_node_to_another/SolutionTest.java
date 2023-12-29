package com.blogspot.ostas.leetcode.all.medium.step_by_step_directions_from_a_binary_tree_node_to_another;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [5,1,2,3,null,6,4], startValue = 3, destValue = 6
    Output: "UURL"
    Explanation: The shortest path is: 3 → 1 → 5 → 2 → 6.
    Example 2:
    Input: root = [2,1], startValue = 2, destValue = 1
    Output: "L"
    Explanation: The shortest path is: 2 → 1.
      Constraints:
    The number of nodes in the tree is n.
    2 <= n <= 105
    1 <= Node.val <= n
    All the values in the tree are unique.
    1 <= startValue, destValue <= n
    startValue != destValue
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(1, new TreeNode(3, null, null), null),
                new TreeNode(2, new TreeNode(6, null, null), new TreeNode(4, null, null)));
        int startValue = 3;
        int destValue = 6;
        String expected = "UURL";
        var result = solution.getDirections(root, startValue, destValue);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null), null);
        int startValue = 2;
        int destValue = 1;
        String expected = "L";
        var result = solution.getDirections(root, startValue, destValue);
        assertThat(result).isEqualTo(expected);
    }

}
