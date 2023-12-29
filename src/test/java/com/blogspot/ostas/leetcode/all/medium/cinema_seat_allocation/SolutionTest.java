package com.blogspot.ostas.leetcode.all.medium.cinema_seat_allocation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, reservedSeats = [[1,2],[1,3],[1,8],[2,6],[3,1],[3,10]]
    Output: 4
    Explanation: The figure above shows the optimal allocation for four groups, where seats mark with blue are already reserved and contiguous seats mark with orange are for one group.
    Example 2:
    Input: n = 2, reservedSeats = [[2,1],[1,8],[2,6]]
    Output: 2
    Example 3:
    Input: n = 4, reservedSeats = [[4,3],[1,4],[4,6],[1,7]]
    Output: 4
      Constraints:
    1 <= n <= 10^9
    1 <= reservedSeats.length <= min(10*n, 10^4)
    reservedSeats[i].length == 2
    1 <= reservedSeats[i][0] <= n
    1 <= reservedSeats[i][1] <= 10
    All reservedSeats[i] are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] reservedSeats = new int[][]{{1, 2}, {1, 3}, {1, 8}, {2, 6}, {3, 1}, {3, 10}};
        int expected = 4;
        var result = solution.maxNumberOfFamilies(n, reservedSeats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[][] reservedSeats = new int[][]{{2, 1}, {1, 8}, {2, 6}};
        int expected = 2;
        var result = solution.maxNumberOfFamilies(n, reservedSeats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int[][] reservedSeats = new int[][]{{4, 3}, {1, 4}, {4, 6}, {1, 7}};
        int expected = 4;
        var result = solution.maxNumberOfFamilies(n, reservedSeats);
        assertThat(result).isEqualTo(expected);
    }

}
