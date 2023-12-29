package com.blogspot.ostas.leetcode.all.easy.remove_duplicates_from_sorted_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,1,2]
    Output: [1,2]
    Example 2:
    Input: head = [1,1,2,3,3]
    Output: [1,2,3]
      Constraints:
    The number of nodes in the list is in the range [0, 300].
    -100 <= Node.val <= 100
    The list is guaranteed to be sorted in ascending order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode expected = new ListNode(1, new ListNode(2));
        var result = solution.deleteDuplicates(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        var result = solution.deleteDuplicates(head);
        assertThat(result).isEqualTo(expected);
    }

}
