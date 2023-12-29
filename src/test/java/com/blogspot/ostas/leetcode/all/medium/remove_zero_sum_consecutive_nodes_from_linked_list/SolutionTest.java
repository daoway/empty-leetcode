package com.blogspot.ostas.leetcode.all.medium.remove_zero_sum_consecutive_nodes_from_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,-3,3,1]
    Output: [3,1]
    Note: The answer [1,2,1] would also be accepted.
    Example 2:
    Input: head = [1,2,3,-3,4]
    Output: [1,2,4]
    Example 3:
    Input: head = [1,2,3,-3,-2]
    Output: [1]
      Constraints:
    The given linked list will contain between 1 and 1000 nodes.
    Each node in the linked list has -1000 <= node.val <= 1000.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(-3, new ListNode(3, new ListNode(1)))));
        ListNode expected = new ListNode(3, new ListNode(1));
        var result = solution.removeZeroSumSublists(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(-3, new ListNode(4)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(4)));
        var result = solution.removeZeroSumSublists(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(-3, new ListNode(-2)))));
        ListNode expected = new ListNode(1);
        var result = solution.removeZeroSumSublists(head);
        assertThat(result).isEqualTo(expected);
    }

}
