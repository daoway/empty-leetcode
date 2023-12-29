package com.blogspot.ostas.leetcode.all.medium.swapping_nodes_in_a_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3,4,5], k = 2
    Output: [1,4,3,2,5]
    Example 2:
    Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
    Output: [7,9,6,6,8,7,3,0,9,5]
      Constraints:
    The number of nodes in the list is n.
    1 <= k <= n <= 105
    0 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        ListNode expected =
                new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));
        var result = solution.swapNodes(head, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(7, new ListNode(9, new ListNode(6, new ListNode(6, new ListNode(7,
                new ListNode(8, new ListNode(3, new ListNode(0, new ListNode(9, new ListNode(5))))))))));
        int k = 5;
        ListNode expected =
                new ListNode(7, new ListNode(9, new ListNode(6, new ListNode(6, new ListNode(8,
                        new ListNode(7,
                                new ListNode(3, new ListNode(0, new ListNode(9, new ListNode(5))))))))));
        var result = solution.swapNodes(head, k);
        assertThat(result).isEqualTo(expected);
    }

}
