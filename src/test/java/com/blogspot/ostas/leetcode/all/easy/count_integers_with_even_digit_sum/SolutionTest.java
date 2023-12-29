package com.blogspot.ostas.leetcode.all.easy.count_integers_with_even_digit_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 4
    Output: 2
    Explanation:
    The only integers less than or equal to 4 whose digit sums are even are 2 and 4.
    Example 2:
    Input: num = 30
    Output: 14
    Explanation:
    The 14 integers less than or equal to 30 whose digit sums are even are
    2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
      Constraints:
    1 <= num <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 4;
        int expected = 2;
        var result = solution.countEven(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 30;
        int expected = 14;
        var result = solution.countEven(num);
        assertThat(result).isEqualTo(expected);
    }
}
