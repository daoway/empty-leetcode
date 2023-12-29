package com.blogspot.ostas.leetcode.all.easy.reverse_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]
    Example 2:
    Input: head = [1,2]
    Output: [2,1]
    Example 3:
    Input: head = []
    Output: []
      Constraints:
    The number of nodes in the list is the range [0, 5000].
    -5000 <= Node.val <= 5000
      Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected =
                new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        var result = solution.reverseList(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(2, new ListNode(1));
        var result = solution.reverseList(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head = null;
        ListNode expected = null;
        var result = solution.reverseList(head);
        assertThat(result).isEqualTo(expected);
    }

}
