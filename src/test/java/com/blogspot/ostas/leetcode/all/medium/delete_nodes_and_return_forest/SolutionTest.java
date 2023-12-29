package com.blogspot.ostas.leetcode.all.medium.delete_nodes_and_return_forest;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
    Output: [[1,2,null,4],[6],[7]]
    Example 2:
    Input: root = [1,2,4,null,3], to_delete = [3]
    Output: [[1,2,4]]
      Constraints:
    The number of nodes in the given tree is at most 1000.
    Each node has a distinct value between 1 and 1000.
    to_delete.length <= 1000
    to_delete contains distinct values between 1 and 1000.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                        new TreeNode(3, new TreeNode(6, null, null), new TreeNode(7, null, null)));
        int[] to_delete = new int[]{3, 5};
        List<TreeNode> expected =
                List.of(new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), null), null),
                        new TreeNode(6, null, null), new TreeNode(7, null, null));
        var result = solution.delNodes(root, to_delete);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3, null, null)),
                new TreeNode(4, null, null));
        int[] to_delete = new int[]{3};
        List<TreeNode> expected =
                List.of(new TreeNode(1, new TreeNode(2, null, null), new TreeNode(4, null, null)));
        var result = solution.delNodes(root, to_delete);
        assertThat(result).isEqualTo(expected);
    }

}
