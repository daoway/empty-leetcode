package com.blogspot.ostas.leetcode.all.medium.insertion_sort_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [4,2,1,3]
    Output: [1,2,3,4]
    Example 2:
    Input: head = [-1,5,3,4,0]
    Output: [-1,0,3,4,5]
      Constraints:
    The number of nodes in the list is in the range [1, 5000].
    -5000 <= Node.val <= 5000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        var result = solution.insertionSortList(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head =
                new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))));
        ListNode expected =
                new ListNode(-1, new ListNode(0, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var result = solution.insertionSortList(head);
        assertThat(result).isEqualTo(expected);
    }

}
