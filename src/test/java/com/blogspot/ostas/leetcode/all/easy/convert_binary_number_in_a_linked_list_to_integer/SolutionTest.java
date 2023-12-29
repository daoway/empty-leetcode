package com.blogspot.ostas.leetcode.all.easy.convert_binary_number_in_a_linked_list_to_integer;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,0,1]
    Output: 5
    Explanation: (101) in base 2 = (5) in base 10
    Example 2:
    Input: head = [0]
    Output: 0
      Constraints:
    The Linked List is not empty.
    Number of nodes will not exceed 30.
    Each node's value is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        int expected = 5;
        var result = solution.getDecimalValue(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(0);
        int expected = 0;
        var result = solution.getDecimalValue(head);
        assertThat(result).isEqualTo(expected);
    }

}
