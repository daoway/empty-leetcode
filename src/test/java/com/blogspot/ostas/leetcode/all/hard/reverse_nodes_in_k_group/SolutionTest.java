package com.blogspot.ostas.leetcode.all.hard.reverse_nodes_in_k_group;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3,4,5], k = 2
    Output: [2,1,4,3,5]
    Example 2:
    Input: head = [1,2,3,4,5], k = 3
    Output: [3,2,1,4,5]
      Constraints:
    The number of nodes in the list is n.
    1 <= k <= n <= 5000
    0 <= Node.val <= 1000
      Follow-up: Can you solve the problem in O(1) extra memory space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        ListNode expected =
                new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(5)))));
        var result = solution.reverseKGroup(head, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 3;
        ListNode expected =
                new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(5)))));
        var result = solution.reverseKGroup(head, k);
        assertThat(result).isEqualTo(expected);
    }

}
