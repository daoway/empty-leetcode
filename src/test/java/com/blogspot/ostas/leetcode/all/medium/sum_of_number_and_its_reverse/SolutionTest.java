package com.blogspot.ostas.leetcode.all.medium.sum_of_number_and_its_reverse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 443
    Output: true
    Explanation: 172 + 271 = 443 so we return true.
    Example 2:
    Input: num = 63
    Output: false
    Explanation: 63 cannot be expressed as the sum of a non-negative integer and its reverse so we return false.
    Example 3:
    Input: num = 181
    Output: true
    Explanation: 140 + 041 = 181 so we return true. Note that when a number is reversed, there may be leading zeros.
      Constraints:
    0 <= num <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 443;
        boolean expected = true;
        var result = solution.sumOfNumberAndReverse(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 63;
        boolean expected = false;
        var result = solution.sumOfNumberAndReverse(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int num = 181;
        boolean expected = true;
        var result = solution.sumOfNumberAndReverse(num);
        assertThat(result).isEqualTo(expected);
    }

}
