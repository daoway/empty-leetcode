package com.blogspot.ostas.leetcode.all.medium.odd_even_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3,4,5]
    Output: [1,3,5,2,4]
    Example 2:
    Input: head = [2,1,3,5,6,4,7]
    Output: [2,3,6,7,1,5,4]
      Constraints:
    The number of nodes in the linked list is in the range [0, 104].
    -106 <= Node.val <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected =
                new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2, new ListNode(4)))));
        var result = solution.oddEvenList(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(2,
                new ListNode(1,
                        new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(7)))))));
        ListNode expected = new ListNode(2,
                new ListNode(3,
                        new ListNode(6, new ListNode(7, new ListNode(1, new ListNode(5, new ListNode(4)))))));
        var result = solution.oddEvenList(head);
        assertThat(result).isEqualTo(expected);
    }

}
