package com.blogspot.ostas.leetcode.all.medium.beautiful_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: [2,1,4,3]
    Example 2:
    Input: n = 5
    Output: [3,1,2,5,4]
      Constraints:
    1 <= n <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[] expected = new int[]{2, 1, 4, 3};
        var result = solution.beautifulArray(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[] expected = new int[]{3, 1, 2, 5, 4};
        var result = solution.beautifulArray(n);
        assertThat(result).isEqualTo(expected);
    }

}
