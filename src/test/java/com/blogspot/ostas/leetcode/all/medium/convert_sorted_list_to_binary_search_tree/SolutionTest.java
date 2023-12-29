package com.blogspot.ostas.leetcode.all.medium.convert_sorted_list_to_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [-10,-3,0,5,9]
    Output: [0,-3,9,-10,null,5]
    Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
    Example 2:
    Input: head = []
    Output: []
      Constraints:
    The number of nodes in head is in the range [0, 2 * 104].
    -105 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(-10, new ListNode(-3, new ListNode(0, new ListNode(5, new ListNode(9)))));
//        TreeNode expected = new TreeNode(0, new TreeNode(-3, new TreeNode(-10, null, null), null),
//                new TreeNode(9, new TreeNode(5, null, null), null));
        TreeNode expected = new TreeNode(0, new TreeNode(-10, null, new TreeNode(-3, null, null)), new TreeNode(5, null, new TreeNode(9, null, null)));
        var result = solution.sortedListToBST(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = null;
        TreeNode expected = null;
        var result = solution.sortedListToBST(head);
        assertThat(result).isEqualTo(expected);
    }

}
