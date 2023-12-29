package com.blogspot.ostas.leetcode.all.medium.smallest_subtree_with_all_the_deepest_nodes;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,5,1,6,2,0,8,null,null,7,4]
    Output: [2,7,4]
    Explanation: We return the node with value 2, colored in yellow in the diagram.
    The nodes coloured in blue are the deepest nodes of the tree.
    Notice that nodes 5, 3 and 2 contain the deepest nodes in the tree but node 2 is the smallest subtree among them, so we return it.
    Example 2:
    Input: root = [1]
    Output: [1]
    Explanation: The root is the deepest node in the tree.
    Example 3:
    Input: root = [0,1,3,null,2]
    Output: [2]
    Explanation: The deepest node in the tree is 2, the valid subtrees are the subtrees of nodes 2, 1 and 0 but the subtree of node 2 is the smallest.
      Constraints:
    The number of nodes in the tree will be in the range [1, 500].
    0 <= Node.val <= 500
    The values of the nodes in the tree are unique.
      Note: This question is the same as 1123: https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6, null, null),
                        new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null))),
                new TreeNode(1, new TreeNode(0, null, null), new TreeNode(8, null, null)));
        TreeNode expected = new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null));
        var result = solution.subtreeWithAllDeepest(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        TreeNode expected = new TreeNode(1, null, null);
        var result = solution.subtreeWithAllDeepest(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0, new TreeNode(1, null, new TreeNode(2, null, null)),
                new TreeNode(3, null, null));
        TreeNode expected = new TreeNode(2, null, null);
        var result = solution.subtreeWithAllDeepest(root);
        assertThat(result).isEqualTo(expected);
    }

}
