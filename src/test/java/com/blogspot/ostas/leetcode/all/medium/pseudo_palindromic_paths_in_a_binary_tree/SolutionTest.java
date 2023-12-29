package com.blogspot.ostas.leetcode.all.medium.pseudo_palindromic_paths_in_a_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [2,3,1,3,1,null,1]
    Output: 2
    Explanation: The figure above represents the given binary tree. There are three paths going from the root node to leaf nodes: the red path [2,3,3], the green path [2,1,1], and the path [2,3,1]. Among these paths only red path and green path are pseudo-palindromic paths since the red path [2,3,3] can be rearranged in [3,2,3] (palindrome) and the green path [2,1,1] can be rearranged in [1,2,1] (palindrome).
    Example 2:
    Input: root = [2,1,1,1,3,null,null,null,null,null,1]
    Output: 1
    Explanation: The figure above represents the given binary tree. There are three paths going from the root node to leaf nodes: the green path [2,1,1], the path [2,1,3,1], and the path [2,1]. Among these paths only the green path is pseudo-palindromic since [2,1,1] can be rearranged in [1,2,1] (palindrome).
    Example 3:
    Input: root = [9]
    Output: 1
      Constraints:
    The number of nodes in the tree is in the range [1, 105].
    1 <= Node.val <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(2, new TreeNode(3, new TreeNode(3, null, null), new TreeNode(1, null, null)),
                        new TreeNode(1, null, new TreeNode(1, null, null)));
        int expected = 2;
        var result = solution.pseudoPalindromicPaths(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2,
                new TreeNode(1, new TreeNode(1, null, null),
                        new TreeNode(3, null, new TreeNode(1, null, null))),
                new TreeNode(1, null, null));
        int expected = 1;
        var result = solution.pseudoPalindromicPaths(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(9, null, null);
        int expected = 1;
        var result = solution.pseudoPalindromicPaths(root);
        assertThat(result).isEqualTo(expected);
    }

}
