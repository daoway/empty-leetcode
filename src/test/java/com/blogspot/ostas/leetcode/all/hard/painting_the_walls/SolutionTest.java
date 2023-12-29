package com.blogspot.ostas.leetcode.all.hard.painting_the_walls;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cost = [1,2,3,2], time = [1,2,3,2]
    Output: 3
    Explanation: The walls at index 0 and 1 will be painted by the paid painter, and it will take 3 units of time; meanwhile, the free painter will paint the walls at index 2 and 3, free of cost in 2 units of time. Thus, the total cost is 1 + 2 = 3.
    Example 2:
    Input: cost = [2,3,4,2], time = [1,1,1,1]
    Output: 4
    Explanation: The walls at index 0 and 3 will be painted by the paid painter, and it will take 2 units of time; meanwhile, the free painter will paint the walls at index 1 and 2, free of cost in 2 units of time. Thus, the total cost is 2 + 2 = 4.
      Constraints:
    1 <= cost.length <= 500
    cost.length == time.length
    1 <= cost[i] <= 106
    1 <= time[i] <= 500
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] cost = new int[]{1, 2, 3, 2};
        int[] time = new int[]{1, 2, 3, 2};
        int expected = 3;
        var result = solution.paintWalls(cost, time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] cost = new int[]{2, 3, 4, 2};
        int[] time = new int[]{1, 1, 1, 1};
        int expected = 4;
        var result = solution.paintWalls(cost, time);
        assertThat(result).isEqualTo(expected);
    }

}
