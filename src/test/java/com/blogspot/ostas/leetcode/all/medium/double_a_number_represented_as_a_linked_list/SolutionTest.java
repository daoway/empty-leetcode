package com.blogspot.ostas.leetcode.all.medium.double_a_number_represented_as_a_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,8,9]
    Output: [3,7,8]
    Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.
    Example 2:
    Input: head = [9,9,9]
    Output: [1,9,9,8]
    Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998.
      Constraints:
    The number of nodes in the list is in the range [1, 104]
    0 <= Node.val <= 9
    The input is generated such that the list represents a number that does not have leading zeros, except the number 0 itself.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(8, new ListNode(9)));
        ListNode expected = new ListNode(3, new ListNode(7, new ListNode(8)));
        var result = solution.doubleIt(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode expected = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(8))));
        var result = solution.doubleIt(head);
        assertThat(result).isEqualTo(expected);
    }

}
