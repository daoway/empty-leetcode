package com.blogspot.ostas.leetcode.all.medium.unique_binary_search_trees_ii;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
    Example 2:
    Input: n = 1
    Output: [[1]]
      Constraints:
    1 <= n <= 8
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        List<TreeNode> expected =
                List.of(new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, null))),
                        new TreeNode(1, null, new TreeNode(3, new TreeNode(2, null, null), null)),
                        new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(3, new TreeNode(1, null, new TreeNode(2, null, null)), null),
                        new TreeNode(3, new TreeNode(2, new TreeNode(1, null, null), null), null));
        var result = solution.generateTrees(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        List<TreeNode> expected = List.of(new TreeNode(1, null, null));
        var result = solution.generateTrees(n);
        assertThat(result).isEqualTo(expected);
    }

}
