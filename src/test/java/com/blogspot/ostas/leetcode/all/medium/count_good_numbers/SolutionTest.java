package com.blogspot.ostas.leetcode.all.medium.count_good_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 5
    Explanation: The good numbers of length 1 are "0", "2", "4", "6", "8".
    Example 2:
    Input: n = 4
    Output: 400
    Example 3:
    Input: n = 50
    Output: 564908303
      Constraints:
    1 <= n <= 1015
    */
    @Test
    void example_0() {
        var solution = new Solution();
        long n = 1;
        int expected = 5;
        var result = solution.countGoodNumbers(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        long n = 4;
        int expected = 400;
        var result = solution.countGoodNumbers(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        long n = 50;
        int expected = 564908303;
        var result = solution.countGoodNumbers(n);
        assertThat(result).isEqualTo(expected);
    }

}
