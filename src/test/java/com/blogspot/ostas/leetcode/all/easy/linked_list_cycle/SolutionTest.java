package com.blogspot.ostas.leetcode.all.easy.linked_list_cycle;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [3,2,0,-4], pos = 1
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
    Example 2:
    Input: head = [1,2], pos = 0
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
    Example 3:
    Input: head = [1], pos = -1
    Output: false
    Explanation: There is no cycle in the linked list.
      Constraints:
    The number of the nodes in the list is in the range [0, 104].
    -105 <= Node.val <= 105
    pos is -1 or a valid index in the linked-list.
      Follow up: Can you solve it using O(1) (i.e. constant) memory?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        // Creating the linked list with a cycle starting at position 1
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeMinus4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = nodeMinus4;
        nodeMinus4.next = node2;  // This creates the cycle starting at position 1

        boolean expected = true;
        var result = solution.hasCycle(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        // Creating the linked list with a cycle starting at position 0
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);

        head.next = node2;
        node2.next = head;  // This creates the cycle starting at position 0

        boolean expected = true;
        var result = solution.hasCycle(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head = new ListNode(1);
        boolean expected = false;
        var result = solution.hasCycle(head);
        assertThat(result).isEqualTo(expected);
    }

}
