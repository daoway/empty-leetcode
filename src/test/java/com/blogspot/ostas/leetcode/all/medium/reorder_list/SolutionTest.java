package com.blogspot.ostas.leetcode.all.medium.reorder_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
        Example 1:
    Input: head = [1,2,3,4]
    Output: [1,4,2,3]
    Example 2:
    Input: head = [1,2,3,4,5]
    Output: [1,5,2,4,3]
      Constraints:
    The number of nodes in the list is in the range [1, 5 * 104].
    1 <= Node.val <= 1000
    */

    @Test
    void test_0() {
        var solution = new Solution();
        ListNode head = new ListNode();
        solution.reorderList(head);
    }
}
