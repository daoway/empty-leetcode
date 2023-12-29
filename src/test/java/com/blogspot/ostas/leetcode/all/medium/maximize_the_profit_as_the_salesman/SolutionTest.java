package com.blogspot.ostas.leetcode.all.medium.maximize_the_profit_as_the_salesman;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, offers = [[0,0,1],[0,2,2],[1,3,2]]
    Output: 3
    Explanation: There are 5 houses numbered from 0 to 4 and there are 3 purchase offers.
    We sell houses in the range [0,0] to 1st buyer for 1 gold and houses in the range [1,3] to 3rd buyer for 2 golds.
    It can be proven that 3 is the maximum amount of gold we can achieve.
    Example 2:
    Input: n = 5, offers = [[0,0,1],[0,2,10],[1,3,2]]
    Output: 10
    Explanation: There are 5 houses numbered from 0 to 4 and there are 3 purchase offers.
    We sell houses in the range [0,2] to 2nd buyer for 10 golds.
    It can be proven that 10 is the maximum amount of gold we can achieve.
      Constraints:
    1 <= n <= 105
    1 <= offers.length <= 105
    offers[i].length == 3
    0 <= starti <= endi <= n - 1
    1 <= goldi <= 103
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        List<List<Integer>> offers = List.of(List.of(0, 0, 1), List.of(0, 2, 2), List.of(1, 3, 2));
        int expected = 3;
        var result = solution.maximizeTheProfit(n, offers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        List<List<Integer>> offers = List.of(List.of(0, 0, 1), List.of(0, 2, 10), List.of(1, 3, 2));
        int expected = 10;
        var result = solution.maximizeTheProfit(n, offers);
        assertThat(result).isEqualTo(expected);
    }

}
