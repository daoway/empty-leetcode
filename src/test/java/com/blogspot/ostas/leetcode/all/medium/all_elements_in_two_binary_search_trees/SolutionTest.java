package com.blogspot.ostas.leetcode.all.medium.all_elements_in_two_binary_search_trees;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root1 = [2,1,4], root2 = [1,0,3]
    Output: [0,1,1,2,3,4]
    Example 2:
    Input: root1 = [1,null,8], root2 = [8,1]
    Output: [1,1,8,8]
      Constraints:
    The number of nodes in each tree is in the range [0, 5000].
    -105 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root1 = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(4, null, null));
        TreeNode root2 = new TreeNode(1, new TreeNode(0, null, null), new TreeNode(3, null, null));
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 4);
        var result = solution.getAllElements(root1, root2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root1 = new TreeNode(1, null, new TreeNode(8, null, null));
        TreeNode root2 = new TreeNode(8, new TreeNode(1, null, null), null);
        List<Integer> expected = List.of(1, 1, 8, 8);
        var result = solution.getAllElements(root1, root2);
        assertThat(result).isEqualTo(expected);
    }

}
