package com.blogspot.ostas.leetcode.all.easy.maximum_six_9_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 9669
    Output: 9969
    Explanation:
    Changing the first digit results in 6669.
    Changing the second digit results in 9969.
    Changing the third digit results in 9699.
    Changing the fourth digit results in 9666.
    The maximum number is 9969.
    Example 2:
    Input: num = 9996
    Output: 9999
    Explanation: Changing the last digit 6 to 9 results in the maximum number.
    Example 3:
    Input: num = 9999
    Output: 9999
    Explanation: It is better not to apply any change.
      Constraints:
    1 <= num <= 104
    num consists of only 6 and 9 digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 9669;
        int expected = 9969;
        var result = solution.maximum69Number(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 9996;
        int expected = 9999;
        var result = solution.maximum69Number(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int num = 9999;
        int expected = 9999;
        var result = solution.maximum69Number(num);
        assertThat(result).isEqualTo(expected);
    }

}
