package com.blogspot.ostas.leetcode.all.medium.merge_in_between_linked_lists;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
    Output: [0,1,2,1000000,1000001,1000002,5]
    Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
    Example 2:
    Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
    Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
    Explanation: The blue edges and nodes in the above figure indicate the result.
      Constraints:
    3 <= list1.length <= 104
    1 <= a <= b < list1.length - 1
    1 <= list2.length <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode list1 = new ListNode(0,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        int a = 3;
        int b = 4;
        ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002)));
        ListNode expected = new ListNode(0, new ListNode(1,
                new ListNode(2,
                        new ListNode(1000000, new ListNode(1000001, new ListNode(1000002, new ListNode(5)))))));
        var result = solution.mergeInBetween(list1, a, b, list2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode list1 = new ListNode(0,
                new ListNode(1,
                        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        int a = 2;
        int b = 5;
        ListNode list2 = new ListNode(1000000,
                new ListNode(1000001, new ListNode(1000002, new ListNode(1000003, new ListNode(1000004)))));
        ListNode expected = new ListNode(0, new ListNode(1, new ListNode(1000000, new ListNode(1000001,
                new ListNode(1000002, new ListNode(1000003, new ListNode(1000004, new ListNode(6))))))));
        var result = solution.mergeInBetween(list1, a, b, list2);
        assertThat(result).isEqualTo(expected);
    }

}
