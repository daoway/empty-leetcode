package com.blogspot.ostas.leetcode.all.medium.average_waiting_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: customers = [[1,2],[2,5],[4,3]]
    Output: 5.00000
    Explanation:
    1) The first customer arrives at time 1, the chef takes his order and starts preparing it immediately at time 1, and finishes at time 3, so the waiting time of the first customer is 3 - 1 = 2.
    2) The second customer arrives at time 2, the chef takes his order and starts preparing it at time 3, and finishes at time 8, so the waiting time of the second customer is 8 - 2 = 6.
    3) The third customer arrives at time 4, the chef takes his order and starts preparing it at time 8, and finishes at time 11, so the waiting time of the third customer is 11 - 4 = 7.
    So the average waiting time = (2 + 6 + 7) / 3 = 5.
    Example 2:
    Input: customers = [[5,2],[5,4],[10,3],[20,1]]
    Output: 3.25000
    Explanation:
    1) The first customer arrives at time 5, the chef takes his order and starts preparing it immediately at time 5, and finishes at time 7, so the waiting time of the first customer is 7 - 5 = 2.
    2) The second customer arrives at time 5, the chef takes his order and starts preparing it at time 7, and finishes at time 11, so the waiting time of the second customer is 11 - 5 = 6.
    3) The third customer arrives at time 10, the chef takes his order and starts preparing it at time 11, and finishes at time 14, so the waiting time of the third customer is 14 - 10 = 4.
    4) The fourth customer arrives at time 20, the chef takes his order and starts preparing it immediately at time 20, and finishes at time 21, so the waiting time of the fourth customer is 21 - 20 = 1.
    So the average waiting time = (2 + 6 + 4 + 1) / 4 = 3.25.
      Constraints:
    1 <= customers.length <= 105
    1 <= arrivali, timei <= 104
    arrivali <= arrivali+1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] customers = new int[][]{{1, 2}, {2, 5}, {4, 3}};
        double expected = 5.00000;
        var result = solution.averageWaitingTime(customers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] customers = new int[][]{{5, 2}, {5, 4}, {10, 3}, {20, 1}};
        double expected = 3.25000;
        var result = solution.averageWaitingTime(customers);
        assertThat(result).isEqualTo(expected);
    }

}
