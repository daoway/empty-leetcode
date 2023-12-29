package com.blogspot.ostas.leetcode.all.medium.remove_nodes_from_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [5,2,13,3,8]
    Output: [13,8]
    Explanation: The nodes that should be removed are 5, 2 and 3.
    - Node 13 is to the right of node 5.
    - Node 13 is to the right of node 2.
    - Node 8 is to the right of node 3.
    Example 2:
    Input: head = [1,1,1,1]
    Output: [1,1,1,1]
    Explanation: Every node has value 1, so no nodes are removed.
      Constraints:
    The number of the nodes in the given list is in the range [1, 105].
    1 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
        ListNode expected = new ListNode(13, new ListNode(8));
        var result = solution.removeNodes(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        var result = solution.removeNodes(head);
        assertThat(result).isEqualTo(expected);
    }

}
