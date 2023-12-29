package com.blogspot.ostas.leetcode.all.medium.split_linked_list_in_parts;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3], k = 5
    Output: [[1],[2],[3],[],[]]
    Explanation:
    The first element output[0] has output[0].val = 1, output[0].next = null.
    The last element output[4] is null, but its string representation as a ListNode is [].
    Example 2:
    Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
    Output: [[1,2,3,4],[5,6,7],[8,9,10]]
    Explanation:
    The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.
      Constraints:
    The number of nodes in the list is in the range [0, 1000].
    0 <= Node.val <= 1000
    1 <= k <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        int k = 5;
        ListNode[] expected = new ListNode[]{new ListNode(1), new ListNode(2), new ListNode(3), null, null};
        var result = solution.splitListToParts(head, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,
                new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9, new ListNode(10))))))))));
        int k = 3;
        ListNode[] expected =
                new ListNode[]{new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))),
                        new ListNode(5, new ListNode(6, new ListNode(7))),
                        new ListNode(8, new ListNode(9, new ListNode(10)))};
        var result = solution.splitListToParts(head, k);
        assertThat(result).isEqualTo(expected);
    }

}
