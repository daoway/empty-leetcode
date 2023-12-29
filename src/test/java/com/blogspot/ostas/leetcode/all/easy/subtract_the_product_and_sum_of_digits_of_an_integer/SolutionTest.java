package com.blogspot.ostas.leetcode.all.easy.subtract_the_product_and_sum_of_digits_of_an_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 234
    Output: 15
    Explanation:
    Product of digits = 2 * 3 * 4 = 24
    Sum of digits = 2 + 3 + 4 = 9
    Result = 24 - 9 = 15
    Example 2:
    Input: n = 4421
    Output: 21
    Explanation:
    Product of digits = 4 * 4 * 2 * 1 = 32
    Sum of digits = 4 + 4 + 2 + 1 = 11
    Result = 32 - 11 = 21
      Constraints:
    1 <= n <= 10^5
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 234;
        int expected = 15;
        var result = solution.subtractProductAndSum(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4421;
        int expected = 21;
        var result = solution.subtractProductAndSum(n);
        assertThat(result).isEqualTo(expected);
    }

}
