package com.blogspot.ostas.leetcode.all.easy.remove_linked_list_elements;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,6,3,4,5,6], val = 6
    Output: [1,2,3,4,5]
    Example 2:
    Input: head = [], val = 1
    Output: []
    Example 3:
    Input: head = [7,7,7,7], val = 7
    Output: []
      Constraints:
    The number of nodes in the list is in the range [0, 104].
    1 <= Node.val <= 50
    0 <= val <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        int val = 6;
        ListNode expected =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var result = solution.removeElements(head, val);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = null;
        int val = 1;
        ListNode expected = null;
        var result = solution.removeElements(head, val);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        int val = 7;
        ListNode expected = null;
        var result = solution.removeElements(head, val);
        assertThat(result).isEqualTo(expected);
    }

}
