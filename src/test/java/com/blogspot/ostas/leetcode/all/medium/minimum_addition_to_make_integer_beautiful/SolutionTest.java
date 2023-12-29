package com.blogspot.ostas.leetcode.all.medium.minimum_addition_to_make_integer_beautiful;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 16, target = 6
    Output: 4
    Explanation: Initially n is 16 and its digit sum is 1 + 6 = 7. After adding 4, n becomes 20 and digit sum becomes 2 + 0 = 2. It can be shown that we can not make n beautiful with adding non-negative integer less than 4.
    Example 2:
    Input: n = 467, target = 6
    Output: 33
    Explanation: Initially n is 467 and its digit sum is 4 + 6 + 7 = 17. After adding 33, n becomes 500 and digit sum becomes 5 + 0 + 0 = 5. It can be shown that we can not make n beautiful with adding non-negative integer less than 33.
    Example 3:
    Input: n = 1, target = 1
    Output: 0
    Explanation: Initially n is 1 and its digit sum is 1, which is already smaller than or equal to target.
      Constraints:
    1 <= n <= 1012
    1 <= target <= 150
    The input will be generated such that it is always possible to make n beautiful.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        long n = 16;
        int target = 6;
        long expected = 4;
        var result = solution.makeIntegerBeautiful(n, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        long n = 467;
        int target = 6;
        long expected = 33;
        var result = solution.makeIntegerBeautiful(n, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        long n = 1;
        int target = 1;
        long expected = 0;
        var result = solution.makeIntegerBeautiful(n, target);
        assertThat(result).isEqualTo(expected);
    }

}
