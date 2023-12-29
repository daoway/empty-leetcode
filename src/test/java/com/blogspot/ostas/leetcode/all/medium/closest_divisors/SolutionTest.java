package com.blogspot.ostas.leetcode.all.medium.closest_divisors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 8
    Output: [3,3]
    Explanation: For num + 1 = 9, the closest divisors are 3 & 3, for num + 2 = 10, the closest divisors are 2 & 5, hence 3 & 3 is chosen.
    Example 2:
    Input: num = 123
    Output: [5,25]
    Example 3:
    Input: num = 999
    Output: [40,25]
      Constraints:
    1 <= num <= 10^9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 8;
        int[] expected = new int[]{3, 3};
        var result = solution.closestDivisors(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 123;
        int[] expected = new int[]{5, 25};
        var result = solution.closestDivisors(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int num = 999;
        int[] expected = new int[]{40, 25};
        var result = solution.closestDivisors(num);
        assertThat(result).isEqualTo(expected);
    }

}
