package com.blogspot.ostas.leetcode.all.medium.delete_node_in_a_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
        Example 1:
    Input: head = [4,5,1,9], node = 5
    Output: [4,1,9]
    Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
    Example 2:
    Input: head = [4,5,1,9], node = 1
    Output: [4,5,9]
    Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
      Constraints:
    The number of the nodes in the given list is in the range [2, 1000].
    -1000 <= Node.val <= 1000
    The value of each node in the list is unique.
    The node to be deleted is in the list and is not a tail node.
    */

    @Test
    void test_0() {
        var solution = new Solution();
        ListNode node = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        ListNode expected = new ListNode(4, new ListNode(1, new ListNode(9)));
        solution.deleteNode(node.next);
        assertThat(node).isEqualTo(expected);
    }

    @Test
    void test_1() {
        var solution = new Solution();
        ListNode node = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(9)));
        solution.deleteNode(node.next.next);
        assertThat(node).isEqualTo(expected);
    }

}
