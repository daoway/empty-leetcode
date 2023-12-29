package com.blogspot.ostas.leetcode.all.medium.binary_tree_pruning;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,null,0,0,1]
    Output: [1,null,0,null,1]
    Explanation:
    Only the red nodes satisfy the property "every subtree not containing a 1".
    The diagram on the right represents the answer.
    Example 2:
    Input: root = [1,0,1,0,0,0,1]
    Output: [1,null,1,null,1]
    Example 3:
    Input: root = [1,1,0,1,1,0,1,0]
    Output: [1,1,0,1,1,null,1]
      Constraints:
    The number of nodes in the tree is in the range [1, 200].
    Node.val is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null,
                new TreeNode(0, new TreeNode(0, null, null), new TreeNode(1, null, null)));
        TreeNode expected = new TreeNode(1, null, new TreeNode(0, null, new TreeNode(1, null, null)));
        var result = solution.pruneTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null)),
                        new TreeNode(1, new TreeNode(0, null, null), new TreeNode(1, null, null)));
        TreeNode expected = new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, null, null)));
        var result = solution.pruneTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1,
                new TreeNode(1, new TreeNode(1, new TreeNode(0, null, null), null),
                        new TreeNode(1, null, null)),
                new TreeNode(0, new TreeNode(0, null, null), new TreeNode(1, null, null)));
        TreeNode expected =
                new TreeNode(1, new TreeNode(1, new TreeNode(1, null, null), new TreeNode(1, null, null)),
                        new TreeNode(0, null, new TreeNode(1, null, null)));
        var result = solution.pruneTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
