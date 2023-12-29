package com.blogspot.ostas.leetcode.all.medium.linked_list_components;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [0,1,2,3], nums = [0,1,3]
    Output: 2
    Explanation: 0 and 1 are connected, so [0, 1] and [3] are the two connected components.
    Example 2:
    Input: head = [0,1,2,3,4], nums = [0,3,1,4]
    Output: 2
    Explanation: 0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.
      Constraints:
    The number of nodes in the linked list is n.
    1 <= n <= 104
    0 <= Node.val < n
    All the values Node.val are unique.
    1 <= nums.length <= n
    0 <= nums[i] < n
    All the values of nums are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
        int[] nums = new int[]{0, 1, 3};
        int expected = 2;
        var result = solution.numComponents(head, nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head =
                new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        int[] nums = new int[]{0, 3, 1, 4};
        int expected = 2;
        var result = solution.numComponents(head, nums);
        assertThat(result).isEqualTo(expected);
    }

}
