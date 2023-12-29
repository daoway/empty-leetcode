package com.blogspot.ostas.leetcode.all.easy.convert_integer_to_the_sum_of_two_no_zero_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: [1,1]
    Explanation: Let a = 1 and b = 1.
    Both a and b are no-zero integers, and a + b = 2 = n.
    Example 2:
    Input: n = 11
    Output: [2,9]
    Explanation: Let a = 2 and b = 9.
    Both a and b are no-zero integers, and a + b = 9 = n.
    Note that there are other valid answers as [8, 3] that can be accepted.
      Constraints:
    2 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int[] expected = new int[]{1, 1};
        var result = solution.getNoZeroIntegers(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 11;
        int[] expected = new int[]{2, 9};
        var result = solution.getNoZeroIntegers(n);
        assertThat(result).isEqualTo(expected);
    }

}
