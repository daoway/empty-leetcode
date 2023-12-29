package com.blogspot.ostas.leetcode.all.medium.most_profit_assigning_work;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
    Output: 100
    Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get a profit of [20,20,30,30] separately.
    Example 2:
    Input: difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]
    Output: 0
      Constraints:
    n == difficulty.length
    n == profit.length
    m == worker.length
    1 <= n, m <= 104
    1 <= difficulty[i], profit[i], worker[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] difficulty = new int[]{2, 4, 6, 8, 10};
        int[] profit = new int[]{10, 20, 30, 40, 50};
        int[] worker = new int[]{4, 5, 6, 7};
        int expected = 100;
        var result = solution.maxProfitAssignment(difficulty, profit, worker);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] difficulty = new int[]{85, 47, 57};
        int[] profit = new int[]{24, 66, 99};
        int[] worker = new int[]{40, 25, 25};
        int expected = 0;
        var result = solution.maxProfitAssignment(difficulty, profit, worker);
        assertThat(result).isEqualTo(expected);
    }

}
