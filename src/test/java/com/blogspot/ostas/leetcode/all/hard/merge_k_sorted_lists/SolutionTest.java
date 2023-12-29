package com.blogspot.ostas.leetcode.all.hard.merge_k_sorted_lists;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: lists = [[1,4,5],[1,3,4],[2,6]]
    Output: [1,1,2,3,4,4,5,6]
    Explanation: The linked-lists are:
    [
      1->4->5,
      1->3->4,
      2->6
    ]
    merging them into one sorted list:
    1->1->2->3->4->4->5->6
    Example 2:
    Input: lists = []
    Output: []
    Example 3:
    Input: lists = [[]]
    Output: []
      Constraints:
    k == lists.length
    0 <= k <= 104
    0 <= lists[i].length <= 500
    -104 <= lists[i][j] <= 104
    lists[i] is sorted in ascending order.
    The sum of lists[i].length will not exceed 104.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode[] lists = new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))), new ListNode(2, new ListNode(6))};
        ListNode expected = new ListNode(1, new ListNode(1,
                new ListNode(2,
                        new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));
        var result = solution.mergeKLists(lists);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode[] lists = new ListNode[]{null};
        ListNode expected = null;
        var result = solution.mergeKLists(lists);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode[] lists = new ListNode[]{};
        ListNode expected = null;
        var result = solution.mergeKLists(lists);
        assertThat(result).isEqualTo(expected);
    }

}
