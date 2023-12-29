package com.blogspot.ostas.leetcode.all.medium.partition_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,4,3,2,5,2], x = 3
    Output: [1,2,2,4,3,5]
    Example 2:
    Input: head = [2,1], x = 2
    Output: [1,2]
      Constraints:
    The number of nodes in the list is in the range [0, 200].
    -100 <= Node.val <= 100
    -200 <= x <= 200
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(1,
                new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        int x = 3;
        ListNode expected = new ListNode(1,
                new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(5))))));
        var result = solution.partition(head, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(2, new ListNode(1));
        int x = 2;
        ListNode expected = new ListNode(1, new ListNode(2));
        var result = solution.partition(head, x);
        assertThat(result).isEqualTo(expected);
    }

}
