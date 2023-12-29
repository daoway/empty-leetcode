package com.blogspot.ostas.leetcode.all.easy.count_the_digits_that_divide_a_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 7
    Output: 1
    Explanation: 7 divides itself, hence the answer is 1.
    Example 2:
    Input: num = 121
    Output: 2
    Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
    Example 3:
    Input: num = 1248
    Output: 4
    Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
      Constraints:
    1 <= num <= 109
    num does not contain 0 as one of its digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 7;
        int expected = 1;
        var result = solution.countDigits(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 121;
        int expected = 2;
        var result = solution.countDigits(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int num = 1248;
        int expected = 4;
        var result = solution.countDigits(num);
        assertThat(result).isEqualTo(expected);
    }

}
