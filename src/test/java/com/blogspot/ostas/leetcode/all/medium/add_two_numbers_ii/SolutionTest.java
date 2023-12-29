package com.blogspot.ostas.leetcode.all.medium.add_two_numbers_ii;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: l1 = [7,2,4,3], l2 = [5,6,4]
    Output: [7,8,0,7]
    Example 2:
    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [8,0,7]
    Example 3:
    Input: l1 = [0], l2 = [0]
    Output: [0]
      Constraints:
    The number of nodes in each linked list is in the range [1, 100].
    0 <= Node.val <= 9
    It is guaranteed that the list represents a number that does not have leading zeros.
      Follow up: Could you solve it without reversing the input lists?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(8, new ListNode(0, new ListNode(7))));
        var result = solution.addTwoNumbers(l1, l2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(8, new ListNode(0, new ListNode(7)));
        var result = solution.addTwoNumbers(l1, l2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);
        var result = solution.addTwoNumbers(l1, l2);
        assertThat(result).isEqualTo(expected);
    }

}
