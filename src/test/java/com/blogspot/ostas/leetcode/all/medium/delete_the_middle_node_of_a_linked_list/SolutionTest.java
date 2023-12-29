package com.blogspot.ostas.leetcode.all.medium.delete_the_middle_node_of_a_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,3,4,7,1,2,6]
    Output: [1,3,4,1,2,6]
    Explanation:
    The above figure represents the given linked list. The indices of the nodes are written below.
    Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
    We return the new list after removing this node.
    Example 2:
    Input: head = [1,2,3,4]
    Output: [1,2,4]
    Explanation:
    The above figure represents the given linked list.
    For n = 4, node 2 with value 3 is the middle node, which is marked in red.
    Example 3:
    Input: head = [2,1]
    Output: [2]
    Explanation:
    The above figure represents the given linked list.
    For n = 2, node 1 with value 1 is the middle node, which is marked in red.
    Node 0 with value 2 is the only node remaining after removing node 1.
      Constraints:
    The number of nodes in the list is in the range [1, 105].
    1 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(1,
                new ListNode(3,
                        new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))));
        ListNode expected = new ListNode(1,
                new ListNode(3, new ListNode(4, new ListNode(1, new ListNode(2, new ListNode(6))))));
        var result = solution.deleteMiddle(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(4)));
        var result = solution.deleteMiddle(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head = new ListNode(2, new ListNode(1));
        ListNode expected = new ListNode(2);
        var result = solution.deleteMiddle(head);
        assertThat(result).isEqualTo(expected);
    }

}
