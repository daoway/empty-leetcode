package com.blogspot.ostas.leetcode.all.hard.time_to_cross_a_bridge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1, k = 3, time = [[1,1,2,1],[1,1,3,1],[1,1,4,1]]
    Output: 6
    Explanation:
    From 0 to 1: worker 2 crosses the bridge from the left bank to the right bank.
    From 1 to 2: worker 2 picks up a box from the old warehouse.
    From 2 to 6: worker 2 crosses the bridge from the right bank to the left bank.
    From 6 to 7: worker 2 puts a box at the new warehouse.
    The whole process ends after 7 minutes. We return 6 because the problem asks for the instance of time at which the last worker reaches the left bank.
    Example 2:
    Input: n = 3, k = 2, time = [[1,9,1,8],[10,10,10,10]]
    Output: 50
    Explanation:
    From 0  to 10: worker 1 crosses the bridge from the left bank to the right bank.
    From 10 to 20: worker 1 picks up a box from the old warehouse.
    From 10 to 11: worker 0 crosses the bridge from the left bank to the right bank.
    From 11 to 20: worker 0 picks up a box from the old warehouse.
    From 20 to 30: worker 1 crosses the bridge from the right bank to the left bank.
    From 30 to 40: worker 1 puts a box at the new warehouse.
    From 30 to 31: worker 0 crosses the bridge from the right bank to the left bank.
    From 31 to 39: worker 0 puts a box at the new warehouse.
    From 39 to 40: worker 0 crosses the bridge from the left bank to the right bank.
    From 40 to 49: worker 0 picks up a box from the old warehouse.
    From 49 to 50: worker 0 crosses the bridge from the right bank to the left bank.
    From 50 to 58: worker 0 puts a box at the new warehouse.
    The whole process ends after 58 minutes. We return 50 because the problem asks for the instance of time at which the last worker reaches the left bank.
      Constraints:
    1 <= n, k <= 104
    time.length == k
    time[i].length == 4
    1 <= leftToRighti, pickOldi, rightToLefti, putNewi <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int k = 3;
        int[][] time = new int[][]{{1, 1, 2, 1}, {1, 1, 3, 1}, {1, 1, 4, 1}};
        int expected = 6;
        var result = solution.findCrossingTime(n, k, time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int k = 2;
        int[][] time = new int[][]{{1, 9, 1, 8}, {10, 10, 10, 10}};
        int expected = 50;
        var result = solution.findCrossingTime(n, k, time);
        assertThat(result).isEqualTo(expected);
    }

}
