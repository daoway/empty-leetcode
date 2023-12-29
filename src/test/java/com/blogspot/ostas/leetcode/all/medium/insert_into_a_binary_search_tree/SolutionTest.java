package com.blogspot.ostas.leetcode.all.medium.insert_into_a_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [4,2,7,1,3], val = 5
    Output: [4,2,7,1,3,5]
    Explanation: Another accepted tree is:
    Example 2:
    Input: root = [40,20,60,10,30,50,70], val = 25
    Output: [40,20,60,10,30,50,70,null,null,25]
    Example 3:
    Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
    Output: [4,2,7,1,3,5]
      Constraints:
    The number of nodes in the tree will be in the range [0, 104].
    -108 <= Node.val <= 108
    All the values Node.val are unique.
    -108 <= val <= 108
    It's guaranteed that val does not exist in the original BST.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(7, null, null));
        int val = 5;
        TreeNode expected =
                new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(7, new TreeNode(5, null, null), null));
        var result = solution.insertIntoBST(root, val);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(40,
                new TreeNode(20, new TreeNode(10, null, null), new TreeNode(30, null, null)),
                new TreeNode(60, new TreeNode(50, null, null), new TreeNode(70, null, null)));
        int val = 25;
        TreeNode expected = new TreeNode(40,
                new TreeNode(20, new TreeNode(10, null, null),
                        new TreeNode(30, new TreeNode(25, null, null), null)),
                new TreeNode(60, new TreeNode(50, null, null), new TreeNode(70, null, null)));
        var result = solution.insertIntoBST(root, val);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(7, null, null));
        int val = 5;
        TreeNode expected =
                new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                        new TreeNode(7, new TreeNode(5, null, null), null));
        var result = solution.insertIntoBST(root, val);
        assertThat(result).isEqualTo(expected);
    }

}
