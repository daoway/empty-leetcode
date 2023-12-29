package com.blogspot.ostas.leetcode.all.medium.reverse_linked_list_ii;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3,4,5], left = 2, right = 4
    Output: [1,4,3,2,5]
    Example 2:
    Input: head = [5], left = 1, right = 1
    Output: [5]
      Constraints:
    The number of nodes in the list is n.
    1 <= n <= 500
    -500 <= Node.val <= 500
    1 <= left <= right <= n
      Follow up: Could you do it in one pass?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int left = 2;
        int right = 4;
        ListNode expected =
                new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));
        var result = solution.reverseBetween(head, left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(5);
        int left = 1;
        int right = 1;
        ListNode expected = new ListNode(5);
        var result = solution.reverseBetween(head, left, right);
        assertThat(result).isEqualTo(expected);
    }

}
