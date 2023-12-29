package com.blogspot.ostas.leetcode.all.medium.maximum_binary_tree_ii;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [4,1,3,null,null,2], val = 5
    Output: [5,4,null,1,3,null,null,2]
    Explanation: a = [1,4,2,3], b = [1,4,2,3,5]
    Example 2:
    Input: root = [5,2,4,null,1], val = 3
    Output: [5,2,4,null,1,null,3]
    Explanation: a = [2,1,5,4], b = [2,1,5,4,3]
    Example 3:
    Input: root = [5,2,3,null,1], val = 4
    Output: [5,2,4,null,1,3]
    Explanation: a = [2,1,5,3], b = [2,1,5,3,4]
      Constraints:
    The number of nodes in the tree is in the range [1, 100].
    1 <= Node.val <= 100
    All the values of the tree are unique.
    1 <= val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(4, new TreeNode(1, null, null),
                new TreeNode(3, new TreeNode(2, null, null), null));
        int val = 5;
        TreeNode expected = new TreeNode(5,
                new TreeNode(4, new TreeNode(1, null, null),
                        new TreeNode(3, new TreeNode(2, null, null), null)), null);
        var result = solution.insertIntoMaxTree(root, val);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(2, null, new TreeNode(1, null, null)),
                new TreeNode(4, null, null));
        int val = 3;
        TreeNode expected = new TreeNode(5, new TreeNode(2, null, new TreeNode(1, null, null)),
                new TreeNode(4, null, new TreeNode(3, null, null)));
        var result = solution.insertIntoMaxTree(root, val);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(2, null, new TreeNode(1, null, null)),
                new TreeNode(3, null, null));
        int val = 4;
        TreeNode expected = new TreeNode(5, new TreeNode(2, null, new TreeNode(1, null, null)),
                new TreeNode(4, new TreeNode(3, null, null), null));
        var result = solution.insertIntoMaxTree(root, val);
        assertThat(result).isEqualTo(expected);
    }

}
