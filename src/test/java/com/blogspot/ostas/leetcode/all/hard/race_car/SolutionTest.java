package com.blogspot.ostas.leetcode.all.hard.race_car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = 3
    Output: 2
    Explanation:
    The shortest instruction sequence is "AA".
    Your position goes from 0 --> 1 --> 3.
    Example 2:
    Input: target = 6
    Output: 5
    Explanation:
    The shortest instruction sequence is "AAARA".
    Your position goes from 0 --> 1 --> 3 --> 7 --> 7 --> 6.
      Constraints:
    1 <= target <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int target = 3;
        int expected = 2;
        var result = solution.racecar(target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int target = 6;
        int expected = 5;
        var result = solution.racecar(target);
        assertThat(result).isEqualTo(expected);
    }

}
