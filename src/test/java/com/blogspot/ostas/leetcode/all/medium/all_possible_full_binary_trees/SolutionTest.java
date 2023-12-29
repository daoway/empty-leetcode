package com.blogspot.ostas.leetcode.all.medium.all_possible_full_binary_trees;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 7
    Output: [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]
    Example 2:
    Input: n = 3
    Output: [[0,0,0]]
      Constraints:
    1 <= n <= 20
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 7;
        List<TreeNode> expected = List.of(
                new TreeNode(0, new TreeNode(0, null, null),
                        new TreeNode(0, new TreeNode(0, null, null),
                                new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null)))),
                new TreeNode(0, new TreeNode(0, null, null),
                        new TreeNode(0,
                                new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null)),
                                new TreeNode(0, null, null))),
                new TreeNode(0, new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null)),
                        new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null))),
                new TreeNode(0,
                        new TreeNode(0, new TreeNode(0, null, null),
                                new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null))),
                        new TreeNode(0, null, null)),
                new TreeNode(0,
                        new TreeNode(0,
                                new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null)),
                                new TreeNode(0, null, null)),
                        new TreeNode(0, null, null)));
        var result = solution.allPossibleFBT(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        List<TreeNode> expected =
                List.of(new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null)));
        var result = solution.allPossibleFBT(n);
        assertThat(result).isEqualTo(expected);
    }

}
