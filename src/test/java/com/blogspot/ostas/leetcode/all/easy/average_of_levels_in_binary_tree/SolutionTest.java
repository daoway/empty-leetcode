package com.blogspot.ostas.leetcode.all.easy.average_of_levels_in_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: [3.00000,14.50000,11.00000]
    Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
    Hence return [3, 14.5, 11].
    Example 2:
    Input: root = [3,9,20,15,7]
    Output: [3.00000,14.50000,11.00000]
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -231 <= Node.val <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        List<Double> expected = List.of(3.00000, 14.50000, 11.00000);
        var result = solution.averageOfLevels(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(3, new TreeNode(9, new TreeNode(15, null, null), new TreeNode(7, null, null)),
                        new TreeNode(20, null, null));
        List<Double> expected = List.of(3.00000, 14.50000, 11.00000);
        var result = solution.averageOfLevels(root);
        assertThat(result).isEqualTo(expected);
    }

}
