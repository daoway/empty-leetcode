package com.blogspot.ostas.leetcode.all.medium.find_largest_value_in_each_tree_row;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,3,2,5,3,null,9]
    Output: [1,3,9]
    Example 2:
    Input: root = [1,2,3]
    Output: [1,3]
      Constraints:
    The number of nodes in the tree will be in the range [0, 104].
    -231 <= Node.val <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(3, new TreeNode(5, null, null), new TreeNode(3, null, null)),
                        new TreeNode(2, null, new TreeNode(9, null, null)));
        List<Integer> expected = List.of(1, 3, 9);
        var result = solution.largestValues(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        List<Integer> expected = List.of(1, 3);
        var result = solution.largestValues(root);
        assertThat(result).isEqualTo(expected);
    }

}
