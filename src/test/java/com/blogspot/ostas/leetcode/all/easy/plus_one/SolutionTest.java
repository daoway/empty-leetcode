package com.blogspot.ostas.leetcode.all.easy.plus_one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4].
    Example 2:
    Input: digits = [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
    Incrementing by one gives 4321 + 1 = 4322.
    Thus, the result should be [4,3,2,2].
    Example 3:
    Input: digits = [9]
    Output: [1,0]
    Explanation: The array represents the integer 9.
    Incrementing by one gives 9 + 1 = 10.
    Thus, the result should be [1,0].
      Constraints:
    1 <= digits.length <= 100
    0 <= digits[i] <= 9
    digits does not contain any leading 0's.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] digits = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 4};
        var result = solution.plusOne(digits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] digits = new int[]{4, 3, 2, 1};
        int[] expected = new int[]{4, 3, 2, 2};
        var result = solution.plusOne(digits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] digits = new int[]{9};
        int[] expected = new int[]{1, 0};
        var result = solution.plusOne(digits);
        assertThat(result).isEqualTo(expected);
    }

}
