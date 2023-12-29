package com.blogspot.ostas.leetcode.all.medium.rotate_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3,4,5], k = 2
    Output: [4,5,1,2,3]
    Example 2:
    Input: head = [0,1,2], k = 4
    Output: [2,0,1]
      Constraints:
    The number of nodes in the list is in the range [0, 500].
    -100 <= Node.val <= 100
    0 <= k <= 2 * 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        ListNode expected =
                new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(2, new ListNode(3)))));
        var result = solution.rotateRight(head, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2)));
        int k = 4;
        ListNode expected = new ListNode(2, new ListNode(0, new ListNode(1)));
        var result = solution.rotateRight(head, k);
        assertThat(result).isEqualTo(expected);
    }

}
