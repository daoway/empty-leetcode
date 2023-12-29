package com.blogspot.ostas.leetcode.all.hard.profitable_schemes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, minProfit = 3, group = [2,2], profit = [2,3]
    Output: 2
    Explanation: To make a profit of at least 3, the group could either commit crimes 0 and 1, or just crime 1.
    In total, there are 2 schemes.
    Example 2:
    Input: n = 10, minProfit = 5, group = [2,3,5], profit = [6,7,8]
    Output: 7
    Explanation: To make a profit of at least 5, the group could commit any crimes, as long as they commit one.
    There are 7 possible schemes: (0), (1), (2), (0,1), (0,2), (1,2), and (0,1,2).
      Constraints:
    1 <= n <= 100
    0 <= minProfit <= 100
    1 <= group.length <= 100
    1 <= group[i] <= 100
    profit.length == group.length
    0 <= profit[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int minProfit = 3;
        int[] group = new int[]{2, 2};
        int[] profit = new int[]{2, 3};
        int expected = 2;
        var result = solution.profitableSchemes(n, minProfit, group, profit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 10;
        int minProfit = 5;
        int[] group = new int[]{2, 3, 5};
        int[] profit = new int[]{6, 7, 8};
        int expected = 7;
        var result = solution.profitableSchemes(n, minProfit, group, profit);
        assertThat(result).isEqualTo(expected);
    }

}
