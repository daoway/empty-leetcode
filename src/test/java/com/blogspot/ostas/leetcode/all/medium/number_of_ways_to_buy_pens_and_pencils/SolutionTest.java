package com.blogspot.ostas.leetcode.all.medium.number_of_ways_to_buy_pens_and_pencils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: total = 20, cost1 = 10, cost2 = 5
    Output: 9
    Explanation: The price of a pen is 10 and the price of a pencil is 5.
    - If you buy 0 pens, you can buy 0, 1, 2, 3, or 4 pencils.
    - If you buy 1 pen, you can buy 0, 1, or 2 pencils.
    - If you buy 2 pens, you cannot buy any pencils.
    The total number of ways to buy pens and pencils is 5 + 3 + 1 = 9.
    Example 2:
    Input: total = 5, cost1 = 10, cost2 = 10
    Output: 1
    Explanation: The price of both pens and pencils are 10, which cost more than total, so you cannot buy any writing utensils. Therefore, there is only 1 way: buy 0 pens and 0 pencils.
      Constraints:
    1 <= total, cost1, cost2 <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int total = 20;
        int cost1 = 10;
        int cost2 = 5;
        long expected = 9;
        var result = solution.waysToBuyPensPencils(total, cost1, cost2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int total = 5;
        int cost1 = 10;
        int cost2 = 10;
        long expected = 1;
        var result = solution.waysToBuyPensPencils(total, cost1, cost2);
        assertThat(result).isEqualTo(expected);
    }

}
