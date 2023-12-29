package com.blogspot.ostas.leetcode.all.medium.find_three_consecutive_integers_that_sum_to_a_given_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 33
    Output: [10,11,12]
    Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
    10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].
    Example 2:
    Input: num = 4
    Output: []
    Explanation: There is no way to express 4 as the sum of 3 consecutive integers.
      Constraints:
    0 <= num <= 1015
    */
    @Test
    void example_0() {
        var solution = new Solution();
        long num = 33;
        long[] expected = new long[]{10, 11, 12};
        var result = solution.sumOfThree(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        long num = 4;
        long[] expected = new long[]{};
        var result = solution.sumOfThree(num);
        assertThat(result).isEqualTo(expected);
    }

}
