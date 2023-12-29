package com.blogspot.ostas.leetcode.all.hard.largest_multiple_of_three;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: digits = [8,1,9]
    Output: "981"
    Example 2:
    Input: digits = [8,6,7,1,0]
    Output: "8760"
    Example 3:
    Input: digits = [1]
    Output: ""
      Constraints:
    1 <= digits.length <= 104
    0 <= digits[i] <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] digits = new int[]{8, 1, 9};
        String expected = "981";
        var result = solution.largestMultipleOfThree(digits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] digits = new int[]{8, 6, 7, 1, 0};
        String expected = "8760";
        var result = solution.largestMultipleOfThree(digits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] digits = new int[]{1};
        String expected = "";
        var result = solution.largestMultipleOfThree(digits);
        assertThat(result).isEqualTo(expected);
    }

}
