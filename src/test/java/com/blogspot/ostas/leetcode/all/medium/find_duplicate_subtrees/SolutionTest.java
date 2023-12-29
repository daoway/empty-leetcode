package com.blogspot.ostas.leetcode.all.medium.find_duplicate_subtrees;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4,null,2,4,null,null,4]
    Output: [[2,4],[4]]
    Example 2:
    Input: root = [2,1,1]
    Output: [[1]]
    Example 3:
    Input: root = [2,2,2,3,null,3,null]
    Output: [[2,3],[3]]
      Constraints:
    The number of the nodes in the tree will be in the range [1, 5000]
    -200 <= Node.val <= 200
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), null),
                new TreeNode(3, new TreeNode(2, new TreeNode(4, null, null), null),
                        new TreeNode(4, null, null)));
        List<TreeNode> expected = List.of(new TreeNode(2, new TreeNode(4, null, null), null),
                new TreeNode(4, null, null));
        var result = solution.findDuplicateSubtrees(root);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(1, null, null));
        List<TreeNode> expected = List.of(new TreeNode(1, null, null));
        var result = solution.findDuplicateSubtrees(root);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(2, new TreeNode(3, null, null), null),
                new TreeNode(2, new TreeNode(3, null, null), null));
        List<TreeNode> expected = List.of(new TreeNode(2, new TreeNode(3, null, null), null),
                new TreeNode(3, null, null));
        var result = solution.findDuplicateSubtrees(root);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}
