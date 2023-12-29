package com.blogspot.ostas.leetcode.all.medium.insert_greatest_common_divisors_in_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [18,6,10,3]
    Output: [18,6,6,2,10,1,3]
    Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
    - We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
    - We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
    - We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
    There are no more adjacent nodes, so we return the linked list.
    Example 2:
    Input: head = [7]
    Output: [7]
    Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes.
    There are no pairs of adjacent nodes, so we return the initial linked list.
      Constraints:
    The number of nodes in the list is in the range [1, 5000].
    1 <= Node.val <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3))));
        ListNode expected = new ListNode(18,
                new ListNode(6,
                        new ListNode(6, new ListNode(2, new ListNode(10, new ListNode(1, new ListNode(3)))))));
        var result = solution.insertGreatestCommonDivisors(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(7);
        ListNode expected = new ListNode(7);
        var result = solution.insertGreatestCommonDivisors(head);
        assertThat(result).isEqualTo(expected);
    }

}
