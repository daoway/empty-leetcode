package com.blogspot.ostas.leetcode.all.medium.ways_to_express_an_integer_as_sum_of_powers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 10, x = 2
    Output: 1
    Explanation: We can express n as the following: n = 32 + 12 = 10.
    It can be shown that it is the only way to express 10 as the sum of the 2nd power of unique integers.
    Example 2:
    Input: n = 4, x = 1
    Output: 2
    Explanation: We can express n in the following ways:
    - n = 41 = 4.
    - n = 31 + 11 = 4.
      Constraints:
    1 <= n <= 300
    1 <= x <= 5
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 10;
        int x = 2;
        int expected = 1;
        var result = solution.numberOfWays(n, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int x = 1;
        int expected = 2;
        var result = solution.numberOfWays(n, x);
        assertThat(result).isEqualTo(expected);
    }

}
