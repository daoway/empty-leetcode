package com.blogspot.ostas.leetcode.all.medium.swap_nodes_in_pairs;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3,4]
    Output: [2,1,4,3]
    Example 2:
    Input: head = []
    Output: []
    Example 3:
    Input: head = [1]
    Output: [1]
      Constraints:
    The number of nodes in the list is in the range [0, 100].
    0 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expected = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));
        var result = solution.swapPairs(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = null;
        ListNode expected = null;
        var result = solution.swapPairs(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode expected = new ListNode(1);
        var result = solution.swapPairs(head);
        assertThat(result).isEqualTo(expected);
    }

}
