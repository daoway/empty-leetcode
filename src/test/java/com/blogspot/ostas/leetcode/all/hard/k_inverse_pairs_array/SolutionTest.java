package com.blogspot.ostas.leetcode.all.hard.k_inverse_pairs_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, k = 0
    Output: 1
    Explanation: Only the array [1,2,3] which consists of numbers from 1 to 3 has exactly 0 inverse pairs.
    Example 2:
    Input: n = 3, k = 1
    Output: 2
    Explanation: The array [1,3,2] and [2,1,3] have exactly 1 inverse pair.
      Constraints:
    1 <= n <= 1000
    0 <= k <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int k = 0;
        int expected = 1;
        var result = solution.kInversePairs(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int k = 1;
        int expected = 2;
        var result = solution.kInversePairs(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
