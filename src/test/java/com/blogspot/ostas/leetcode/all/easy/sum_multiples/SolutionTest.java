package com.blogspot.ostas.leetcode.all.easy.sum_multiples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 7
    Output: 21
    Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
    Example 2:
    Input: n = 10
    Output: 40
    Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
    Example 3:
    Input: n = 9
    Output: 30
    Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9. The sum of these numbers is 30.
      Constraints:
    1 <= n <= 103
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 7;
        int expected = 21;
        var result = solution.sumOfMultiples(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 10;
        int expected = 40;
        var result = solution.sumOfMultiples(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 9;
        int expected = 30;
        var result = solution.sumOfMultiples(n);
        assertThat(result).isEqualTo(expected);
    }

}
