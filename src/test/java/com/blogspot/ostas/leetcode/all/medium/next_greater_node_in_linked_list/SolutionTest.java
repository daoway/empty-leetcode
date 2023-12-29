package com.blogspot.ostas.leetcode.all.medium.next_greater_node_in_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [2,1,5]
    Output: [5,5,0]
    Example 2:
    Input: head = [2,7,4,3,5]
    Output: [7,0,5,5,0]
      Constraints:
    The number of nodes in the list is n.
    1 <= n <= 104
    1 <= Node.val <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(2, new ListNode(1, new ListNode(5)));
        int[] expected = new int[]{5, 5, 0};
        var result = solution.nextLargerNodes(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head =
                new ListNode(2, new ListNode(7, new ListNode(4, new ListNode(3, new ListNode(5)))));
        int[] expected = new int[]{7, 0, 5, 5, 0};
        var result = solution.nextLargerNodes(head);
        assertThat(result).isEqualTo(expected);
    }

}
