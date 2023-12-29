package com.blogspot.ostas.leetcode.all.easy.palindrome_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,2,1]
    Output: true
    Example 2:
    Input: head = [1,2]
    Output: false
      Constraints:
    The number of nodes in the list is in the range [1, 105].
    0 <= Node.val <= 9
      Follow up: Could you do it in O(n) time and O(1) space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        boolean expected = true;
        var result = solution.isPalindrome(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2));
        boolean expected = false;
        var result = solution.isPalindrome(head);
        assertThat(result).isEqualTo(expected);
    }

}
