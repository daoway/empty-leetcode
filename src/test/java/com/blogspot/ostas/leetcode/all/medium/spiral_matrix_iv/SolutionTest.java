package com.blogspot.ostas.leetcode.all.medium.spiral_matrix_iv;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
    Output: [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
    Explanation: The diagram above shows how the values are printed in the matrix.
    Note that the remaining spaces in the matrix are filled with -1.
    Example 2:
    Input: m = 1, n = 4, head = [0,1,2]
    Output: [[0,1,2,-1]]
    Explanation: The diagram above shows how the values are printed from left to right in the matrix.
    The last space in the matrix is set to -1.
      Constraints:
    1 <= m, n <= 105
    1 <= m * n <= 105
    The number of nodes in the list is in the range [1, m * n].
    0 <= Node.val <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 3;
        int n = 5;
        ListNode head = new ListNode(3, new ListNode(0,
                new ListNode(2,
                        new ListNode(6, new ListNode(8, new ListNode(1, new ListNode(7, new ListNode(9,
                                new ListNode(4,
                                        new ListNode(2, new ListNode(5, new ListNode(5, new ListNode(0)))))))))))));
        int[][] expected = new int[][]{{3, 0, 2, 6, 8}, {5, 0, -1, -1, 1}, {5, 2, 4, 9, 7}};
        var result = solution.spiralMatrix(m, n, head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 1;
        int n = 4;
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2)));
        int[][] expected = new int[][]{{0, 1, 2, -1}};
        var result = solution.spiralMatrix(m, n, head);
        assertThat(result).isEqualTo(expected);
    }

}
