package com.blogspot.ostas.leetcode.all.easy.sum_of_digits_in_base_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 34, k = 6
    Output: 9
    Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.
    Example 2:
    Input: n = 10, k = 10
    Output: 1
    Explanation: n is already in base 10. 1 + 0 = 1.
      Constraints:
    1 <= n <= 100
    2 <= k <= 10
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 34;
        int k = 6;
        int expected = 9;
        var result = solution.sumBase(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 10;
        int k = 10;
        int expected = 1;
        var result = solution.sumBase(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
