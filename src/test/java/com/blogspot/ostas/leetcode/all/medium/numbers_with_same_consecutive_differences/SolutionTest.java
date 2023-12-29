package com.blogspot.ostas.leetcode.all.medium.numbers_with_same_consecutive_differences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, k = 7
    Output: [181,292,707,818,929]
    Explanation: Note that 070 is not a valid number, because it has leading zeroes.
    Example 2:
    Input: n = 2, k = 1
    Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
      Constraints:
    2 <= n <= 9
    0 <= k <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int k = 7;
        int[] expected = new int[]{181, 292, 707, 818, 929};
        var result = solution.numsSameConsecDiff(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int k = 1;
        int[] expected = new int[]{10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98};
        var result = solution.numsSameConsecDiff(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
