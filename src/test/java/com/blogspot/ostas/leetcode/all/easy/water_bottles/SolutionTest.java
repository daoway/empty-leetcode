package com.blogspot.ostas.leetcode.all.easy.water_bottles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: numBottles = 9, numExchange = 3
    Output: 13
    Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
    Number of water bottles you can drink: 9 + 3 + 1 = 13.
    Example 2:
    Input: numBottles = 15, numExchange = 4
    Output: 19
    Explanation: You can exchange 4 empty bottles to get 1 full water bottle.
    Number of water bottles you can drink: 15 + 3 + 1 = 19.
      Constraints:
    1 <= numBottles <= 100
    2 <= numExchange <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int numBottles = 9;
        int numExchange = 3;
        int expected = 13;
        var result = solution.numWaterBottles(numBottles, numExchange);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int numBottles = 15;
        int numExchange = 4;
        int expected = 19;
        var result = solution.numWaterBottles(numBottles, numExchange);
        assertThat(result).isEqualTo(expected);
    }

}
