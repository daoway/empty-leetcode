package com.blogspot.ostas.leetcode.all.medium.closest_prime_numbers_in_range;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: left = 10, right = 19
    Output: [11,13]
    Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
    The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
    Since 11 is smaller than 17, we return the first pair.
    Example 2:
    Input: left = 4, right = 6
    Output: [-1,-1]
    Explanation: There exists only one prime number in the given range, so the conditions cannot be satisfied.
      Constraints:
    1 <= left <= right <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int left = 10;
        int right = 19;
        int[] expected = new int[]{11, 13};
        var result = solution.closestPrimes(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int left = 4;
        int right = 6;
        int[] expected = new int[]{-1, -1};
        var result = solution.closestPrimes(left, right);
        assertThat(result).isEqualTo(expected);
    }

}
