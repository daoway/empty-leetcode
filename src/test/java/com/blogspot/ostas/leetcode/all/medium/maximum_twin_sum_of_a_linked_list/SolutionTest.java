package com.blogspot.ostas.leetcode.all.medium.maximum_twin_sum_of_a_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [5,4,2,1]
    Output: 6
    Explanation:
    Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
    There are no other nodes with twins in the linked list.
    Thus, the maximum twin sum of the linked list is 6.
    Example 2:
    Input: head = [4,2,2,3]
    Output: 7
    Explanation:
    The nodes with twins present in this linked list are:
    - Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
    - Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
    Thus, the maximum twin sum of the linked list is max(7, 4) = 7.
    Example 3:
    Input: head = [1,100000]
    Output: 100001
    Explanation:
    There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.
      Constraints:
    The number of nodes in the list is an even integer in the range [2, 105].
    1 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));
        int expected = 6;
        var result = solution.pairSum(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));
        int expected = 7;
        var result = solution.pairSum(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(100000));
        int expected = 100001;
        var result = solution.pairSum(head);
        assertThat(result).isEqualTo(expected);
    }

}
