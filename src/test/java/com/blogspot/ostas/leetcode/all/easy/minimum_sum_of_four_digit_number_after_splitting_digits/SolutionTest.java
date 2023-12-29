package com.blogspot.ostas.leetcode.all.easy.minimum_sum_of_four_digit_number_after_splitting_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 2932
    Output: 52
    Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
    The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
    Example 2:
    Input: num = 4009
    Output: 13
    Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc.
    The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
      Constraints:
    1000 <= num <= 9999
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 2932;
        int expected = 52;
        var result = solution.minimumSum(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 4009;
        int expected = 13;
        var result = solution.minimumSum(num);
        assertThat(result).isEqualTo(expected);
    }

}
