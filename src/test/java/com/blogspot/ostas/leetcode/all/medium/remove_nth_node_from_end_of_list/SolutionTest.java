package com.blogspot.ostas.leetcode.all.medium.remove_nth_node_from_end_of_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]
    Example 2:
    Input: head = [1], n = 1
    Output: []
    Example 3:
    Input: head = [1,2], n = 1
    Output: [1]
      Constraints:
    The number of nodes in the list is sz.
    1 <= sz <= 30
    0 <= Node.val <= 100
    1 <= n <= sz
      Follow up: Could you do this in one pass?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        var result = solution.removeNthFromEnd(head, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(1);
        int n = 1;
        ListNode expected = null;
        var result = solution.removeNthFromEnd(head, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 1;
        ListNode expected = new ListNode(1);
        var result = solution.removeNthFromEnd(head, n);
        assertThat(result).isEqualTo(expected);
    }

}
