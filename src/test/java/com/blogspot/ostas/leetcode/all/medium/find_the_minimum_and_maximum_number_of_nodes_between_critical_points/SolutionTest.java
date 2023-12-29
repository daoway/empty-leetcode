package com.blogspot.ostas.leetcode.all.medium.find_the_minimum_and_maximum_number_of_nodes_between_critical_points;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [3,1]
    Output: [-1,-1]
    Explanation: There are no critical points in [3,1].
    Example 2:
    Input: head = [5,3,1,2,5,1,2]
    Output: [1,3]
    Explanation: There are three critical points:
    - [5,3,1,2,5,1,2]: The third node is a local minima because 1 is less than 3 and 2.
    - [5,3,1,2,5,1,2]: The fifth node is a local maxima because 5 is greater than 2 and 1.
    - [5,3,1,2,5,1,2]: The sixth node is a local minima because 1 is less than 5 and 2.
    The minimum distance is between the fifth and the sixth node. minDistance = 6 - 5 = 1.
    The maximum distance is between the third and the sixth node. maxDistance = 6 - 3 = 3.
    Example 3:
    Input: head = [1,3,2,2,3,2,2,2,7]
    Output: [3,3]
    Explanation: There are two critical points:
    - [1,3,2,2,3,2,2,2,7]: The second node is a local maxima because 3 is greater than 1 and 2.
    - [1,3,2,2,3,2,2,2,7]: The fifth node is a local maxima because 3 is greater than 2 and 2.
    Both the minimum and maximum distances are between the second and the fifth node.
    Thus, minDistance and maxDistance is 5 - 2 = 3.
    Note that the last node is not considered a local maxima because it does not have a next node.
      Constraints:
    The number of nodes in the list is in the range [2, 105].
    1 <= Node.val <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(3, new ListNode(1));
        int[] expected = new int[]{-1, -1};
        var result = solution.nodesBetweenCriticalPoints(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(5,
                new ListNode(3,
                        new ListNode(1, new ListNode(2, new ListNode(5, new ListNode(1, new ListNode(2)))))));
        int[] expected = new int[]{1, 3};
        var result = solution.nodesBetweenCriticalPoints(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(3, new ListNode(2,
                new ListNode(2,
                        new ListNode(3, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(7)))))))));
        int[] expected = new int[]{3, 3};
        var result = solution.nodesBetweenCriticalPoints(head);
        assertThat(result).isEqualTo(expected);
    }

}
