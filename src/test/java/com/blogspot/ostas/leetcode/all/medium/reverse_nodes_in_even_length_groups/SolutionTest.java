package com.blogspot.ostas.leetcode.all.medium.reverse_nodes_in_even_length_groups;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [5,2,6,3,9,1,7,3,8,4]
    Output: [5,6,2,3,9,1,4,8,3,7]
    Explanation:
    - The length of the first group is 1, which is odd, hence no reversal occurs.
    - The length of the second group is 2, which is even, hence the nodes are reversed.
    - The length of the third group is 3, which is odd, hence no reversal occurs.
    - The length of the last group is 4, which is even, hence the nodes are reversed.
    Example 2:
    Input: head = [1,1,0,6]
    Output: [1,0,1,6]
    Explanation:
    - The length of the first group is 1. No reversal occurs.
    - The length of the second group is 2. The nodes are reversed.
    - The length of the last group is 1. No reversal occurs.
    Example 3:
    Input: head = [1,1,0,6,5]
    Output: [1,0,1,5,6]
    Explanation:
    - The length of the first group is 1. No reversal occurs.
    - The length of the second group is 2. The nodes are reversed.
    - The length of the last group is 2. The nodes are reversed.
      Constraints:
    The number of nodes in the list is in the range [1, 105].
    0 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(5, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(9,
                new ListNode(1, new ListNode(7, new ListNode(3, new ListNode(8, new ListNode(4))))))))));
        ListNode expected =
                new ListNode(5, new ListNode(6, new ListNode(2, new ListNode(3, new ListNode(9,
                        new ListNode(1,
                                new ListNode(4, new ListNode(8, new ListNode(3, new ListNode(7))))))))));
        var result = solution.reverseEvenLengthGroups(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(6))));
        ListNode expected = new ListNode(1, new ListNode(0, new ListNode(1, new ListNode(6))));
        var result = solution.reverseEvenLengthGroups(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(6, new ListNode(5)))));
        ListNode expected =
                new ListNode(1, new ListNode(0, new ListNode(1, new ListNode(5, new ListNode(6)))));
        var result = solution.reverseEvenLengthGroups(head);
        assertThat(result).isEqualTo(expected);
    }

}
