package com.blogspot.ostas.leetcode.all.easy.minimum_amount_of_time_to_fill_cups;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: amount = [1,4,2]
    Output: 4
    Explanation: One way to fill up the cups is:
    Second 1: Fill up a cold cup and a warm cup.
    Second 2: Fill up a warm cup and a hot cup.
    Second 3: Fill up a warm cup and a hot cup.
    Second 4: Fill up a warm cup.
    It can be proven that 4 is the minimum number of seconds needed.
    Example 2:
    Input: amount = [5,4,4]
    Output: 7
    Explanation: One way to fill up the cups is:
    Second 1: Fill up a cold cup, and a hot cup.
    Second 2: Fill up a cold cup, and a warm cup.
    Second 3: Fill up a cold cup, and a warm cup.
    Second 4: Fill up a warm cup, and a hot cup.
    Second 5: Fill up a cold cup, and a hot cup.
    Second 6: Fill up a cold cup, and a warm cup.
    Second 7: Fill up a hot cup.
    Example 3:
    Input: amount = [5,0,0]
    Output: 5
    Explanation: Every second, we fill up a cold cup.
      Constraints:
    amount.length == 3
    0 <= amount[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] amount = new int[]{1, 4, 2};
        int expected = 4;
        var result = solution.fillCups(amount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] amount = new int[]{5, 4, 4};
        int expected = 7;
        var result = solution.fillCups(amount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] amount = new int[]{5, 0, 0};
        int expected = 5;
        var result = solution.fillCups(amount);
        assertThat(result).isEqualTo(expected);
    }

}
