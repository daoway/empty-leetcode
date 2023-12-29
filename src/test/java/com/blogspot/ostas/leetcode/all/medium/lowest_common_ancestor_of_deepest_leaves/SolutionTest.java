package com.blogspot.ostas.leetcode.all.medium.lowest_common_ancestor_of_deepest_leaves;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,5,1,6,2,0,8,null,null,7,4]
    Output: [2,7,4]
    Explanation: We return the node with value 2, colored in yellow in the diagram.
    The nodes coloured in blue are the deepest leaf-nodes of the tree.
    Note that nodes 6, 0, and 8 are also leaf nodes, but the depth of them is 2, but the depth of nodes 7 and 4 is 3.
    Example 2:
    Input: root = [1]
    Output: [1]
    Explanation: The root is the deepest node in the tree, and it's the lca of itself.
    Example 3:
    Input: root = [0,1,3,null,2]
    Output: [2]
    Explanation: The deepest leaf node in the tree is 2, the lca of one node is itself.
      Constraints:
    The number of nodes in the tree will be in the range [1, 1000].
    0 <= Node.val <= 1000
    The values of the nodes in the tree are unique.
      Note: This question is the same as 865: https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6, null, null),
                        new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null))),
                new TreeNode(1, new TreeNode(0, null, null), new TreeNode(8, null, null)));
        TreeNode expected = new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null));
        var result = solution.lcaDeepestLeaves(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        TreeNode expected = new TreeNode(1, null, null);
        var result = solution.lcaDeepestLeaves(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0, new TreeNode(1, null, new TreeNode(2, null, null)),
                new TreeNode(3, null, null));
        TreeNode expected = new TreeNode(2, null, null);
        var result = solution.lcaDeepestLeaves(root);
        assertThat(result).isEqualTo(expected);
    }

}
