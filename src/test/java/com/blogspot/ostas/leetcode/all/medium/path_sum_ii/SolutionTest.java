package com.blogspot.ostas.leetcode.all.medium.path_sum_ii;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
    Output: [[5,4,11,2],[5,8,4,5]]
    Explanation: There are two paths whose sum equals targetSum:
    5 + 4 + 11 + 2 = 22
    5 + 8 + 4 + 5 = 22
    Example 2:
    Input: root = [1,2,3], targetSum = 5
    Output: []
    Example 3:
    Input: root = [1,2], targetSum = 0
    Output: []
      Constraints:
    The number of nodes in the tree is in the range [0, 5000].
    -1000 <= Node.val <= 1000
    -1000 <= targetSum <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7, null, null), new TreeNode(2, null, null)),
                        null),
                new TreeNode(8, new TreeNode(13, null, null),
                        new TreeNode(4, new TreeNode(5, null, null), new TreeNode(1, null, null))));
        int targetSum = 22;
        List<List<Integer>> expected = List.of(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5));
        var result = solution.pathSum(root, targetSum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        int targetSum = 5;
        List<List<Integer>> expected = List.of();
        var result = solution.pathSum(root, targetSum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), null);
        int targetSum = 0;
        List<List<Integer>> expected = List.of();
        var result = solution.pathSum(root, targetSum);
        assertThat(result).isEqualTo(expected);
    }

}
