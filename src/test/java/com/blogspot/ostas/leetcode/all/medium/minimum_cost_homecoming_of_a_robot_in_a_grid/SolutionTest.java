package com.blogspot.ostas.leetcode.all.medium.minimum_cost_homecoming_of_a_robot_in_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: startPos = [1, 0], homePos = [2, 3], rowCosts = [5, 4, 3], colCosts = [8, 2, 6, 7]
    Output: 18
    Explanation: One optimal path is that:
    Starting from (1, 0)
    -> It goes down to (2, 0). This move costs rowCosts[2] = 3.
    -> It goes right to (2, 1). This move costs colCosts[1] = 2.
    -> It goes right to (2, 2). This move costs colCosts[2] = 6.
    -> It goes right to (2, 3). This move costs colCosts[3] = 7.
    The total cost is 3 + 2 + 6 + 7 = 18
    Example 2:
    Input: startPos = [0, 0], homePos = [0, 0], rowCosts = [5], colCosts = [26]
    Output: 0
    Explanation: The robot is already at its home. Since no moves occur, the total cost is 0.
      Constraints:
    m == rowCosts.length
    n == colCosts.length
    1 <= m, n <= 105
    0 <= rowCosts[r], colCosts[c] <= 104
    startPos.length == 2
    homePos.length == 2
    0 <= startrow, homerow < m
    0 <= startcol, homecol < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] startPos = new int[]{1, 0};
        int[] homePos = new int[]{2, 3};
        int[] rowCosts = new int[]{5, 4, 3};
        int[] colCosts = new int[]{8, 2, 6, 7};
        int expected = 18;
        var result = solution.minCost(startPos, homePos, rowCosts, colCosts);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] startPos = new int[]{0, 0};
        int[] homePos = new int[]{0, 0};
        int[] rowCosts = new int[]{5};
        int[] colCosts = new int[]{26};
        int expected = 0;
        var result = solution.minCost(startPos, homePos, rowCosts, colCosts);
        assertThat(result).isEqualTo(expected);
    }


}
