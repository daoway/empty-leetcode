package com.blogspot.ostas.leetcode.all.easy.valid_perfect_square;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 16
    Output: true
    Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
    Example 2:
    Input: num = 14
    Output: false
    Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
      Constraints:
    1 <= num <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 16;
        boolean expected = true;
        var result = solution.isPerfectSquare(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 14;
        boolean expected = false;
        var result = solution.isPerfectSquare(num);
        assertThat(result).isEqualTo(expected);
    }

}
