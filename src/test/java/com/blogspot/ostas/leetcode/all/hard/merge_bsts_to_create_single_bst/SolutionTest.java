package com.blogspot.ostas.leetcode.all.hard.merge_bsts_to_create_single_bst;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: trees = [[2,1],[3,2,5],[5,4]]
    Output: [3,2,5,1,null,4]
    Explanation:
    In the first operation, pick i=1 and j=0, and merge trees[0] into trees[1].
    Delete trees[0], so trees = [[3,2,5,1],[5,4]].
    In the second operation, pick i=0 and j=1, and merge trees[1] into trees[0].
    Delete trees[1], so trees = [[3,2,5,1,null,4]].
    The resulting tree, shown above, is a valid BST, so return its root.
    Example 2:
    Input: trees = [[5,3,8],[3,2,6]]
    Output: []
    Explanation:
    Pick i=0 and j=1 and merge trees[1] into trees[0].
    Delete trees[1], so trees = [[5,3,8,2,6]].
    The resulting tree is shown above. This is the only valid operation that can be performed, but the resulting tree is not a valid BST, so return null.
    Example 3:
    Input: trees = [[5,4],[3]]
    Output: []
    Explanation: It is impossible to perform any operations.
      Constraints:
    n == trees.length
    1 <= n <= 5 * 104
    The number of nodes in each tree is in the range [1, 3].
    Each node in the input may have children but no grandchildren.
    No two roots of trees have the same value.
    All the trees in the input are valid BSTs.
    1 <= TreeNode.val <= 5 * 104.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<TreeNode> trees = List.of(new TreeNode(2, new TreeNode(1, null, null), null),
                new TreeNode(3, new TreeNode(2, null, null), new TreeNode(5, null, null)),
                new TreeNode(5, new TreeNode(4, null, null), null));
        TreeNode expected = new TreeNode(3, new TreeNode(2, new TreeNode(1, null, null), null),
                new TreeNode(5, new TreeNode(4, null, null), null));
        var result = solution.canMerge(trees);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<TreeNode> trees =
                List.of(new TreeNode(5, new TreeNode(3, null, null), new TreeNode(8, null, null)),
                        new TreeNode(3, new TreeNode(2, null, null), new TreeNode(6, null, null)));
        TreeNode expected = null;
        var result = solution.canMerge(trees);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<TreeNode> trees =
                List.of(new TreeNode(5, new TreeNode(4, null, null), null), new TreeNode(3, null, null));
        TreeNode expected = null;
        var result = solution.canMerge(trees);
        assertThat(result).isEqualTo(expected);
    }

}
