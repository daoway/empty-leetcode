package com.blogspot.ostas.leetcode.all.medium.beautiful_arrangement_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, k = 1
    Output: [1,2,3]
    Explanation: The [1,2,3] has three different positive integers ranging from 1 to 3, and the [1,1] has exactly 1 distinct integer: 1
    Example 2:
    Input: n = 3, k = 2
    Output: [1,3,2]
    Explanation: The [1,3,2] has three different positive integers ranging from 1 to 3, and the [2,1] has exactly 2 distinct integers: 1 and 2.
      Constraints:
    1 <= k < n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int k = 1;
        int[] expected = new int[]{1, 2, 3};
        var result = solution.constructArray(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int k = 2;
        int[] expected = new int[]{1, 3, 2};
        var result = solution.constructArray(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
