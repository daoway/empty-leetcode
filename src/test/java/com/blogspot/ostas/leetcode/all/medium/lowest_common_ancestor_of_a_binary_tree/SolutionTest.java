package com.blogspot.ostas.leetcode.all.medium.lowest_common_ancestor_of_a_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
    Output: 3
    Explanation: The LCA of nodes 5 and 1 is 3.
    Example 2:
    Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
    Output: 5
    Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
    Example 3:
    Input: root = [1,2], p = 1, q = 2
    Output: 1
      Constraints:
    The number of nodes in the tree is in the range [2, 105].
    -109 <= Node.val <= 109
    All Node.val are unique.
    p != q
    p and q will exist in the tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6, null, null),
                        new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null))),
                new TreeNode(1, new TreeNode(0, null, null), new TreeNode(8, null, null)));
        TreeNode p = root.left; // 5
        TreeNode q = root.right; //1

        TreeNode expected = root; //3
        var result = solution.lowestCommonAncestor(root, p, q);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6, null, null),
                        new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null))),
                new TreeNode(1, new TreeNode(0, null, null), new TreeNode(8, null, null)));
        TreeNode p = root.left; //5
        TreeNode q = root.left.right.right; //4
        TreeNode expected = root.left;//5;
        var result = solution.lowestCommonAncestor(root, p, q);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), null);
        TreeNode p = root;
        TreeNode q = root.left;
        TreeNode expected = root;
        var result = solution.lowestCommonAncestor(root, p, q);
        assertThat(result).isEqualTo(expected);
    }

}
