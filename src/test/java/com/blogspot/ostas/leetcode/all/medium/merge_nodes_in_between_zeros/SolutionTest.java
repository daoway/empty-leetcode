package com.blogspot.ostas.leetcode.all.medium.merge_nodes_in_between_zeros;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [0,3,1,0,4,5,2,0]
    Output: [4,11]
    Explanation:
    The above figure represents the given linked list. The modified list contains
    - The sum of the nodes marked in green: 3 + 1 = 4.
    - The sum of the nodes marked in red: 4 + 5 + 2 = 11.
    Example 2:
    Input: head = [0,1,0,3,0,2,2,0]
    Output: [1,3,4]
    Explanation:
    The above figure represents the given linked list. The modified list contains
    - The sum of the nodes marked in green: 1 = 1.
    - The sum of the nodes marked in red: 3 = 3.
    - The sum of the nodes marked in yellow: 2 + 2 = 4.
      Constraints:
    The number of nodes in the list is in the range [3, 2 * 105].
    0 <= Node.val <= 1000
    There are no two consecutive nodes with Node.val == 0.
    The beginning and end of the linked list have Node.val == 0.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(0, new ListNode(3,
                new ListNode(1,
                        new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))));
        ListNode expected = new ListNode(4, new ListNode(11));
        var result = solution.mergeNodes(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(0, new ListNode(1,
                new ListNode(0,
                        new ListNode(3, new ListNode(0, new ListNode(2, new ListNode(2, new ListNode(0))))))));
        ListNode expected = new ListNode(1, new ListNode(3, new ListNode(4)));
        var result = solution.mergeNodes(head);
        assertThat(result).isEqualTo(expected);
    }

}
