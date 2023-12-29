package com.blogspot.ostas.leetcode.all.hard.number_of_ways_to_separate_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "327"
    Output: 2
    Explanation: You could have written down the numbers:
    3, 27
    327
    Example 2:
    Input: num = "094"
    Output: 0
    Explanation: No numbers can have leading zeros and all numbers must be positive.
    Example 3:
    Input: num = "0"
    Output: 0
    Explanation: No numbers can have leading zeros and all numbers must be positive.
      Constraints:
    1 <= num.length <= 3500
    num consists of digits '0' through '9'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "327";
        int expected = 2;
        var result = solution.numberOfCombinations(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "094";
        int expected = 0;
        var result = solution.numberOfCombinations(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "0";
        int expected = 0;
        var result = solution.numberOfCombinations(num);
        assertThat(result).isEqualTo(expected);
    }

}
