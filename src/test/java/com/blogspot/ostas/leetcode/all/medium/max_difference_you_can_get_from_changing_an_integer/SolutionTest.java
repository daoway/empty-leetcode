package com.blogspot.ostas.leetcode.all.medium.max_difference_you_can_get_from_changing_an_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 555
    Output: 888
    Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
    The second time pick x = 5 and y = 1 and store the new integer in b.
    We have now a = 999 and b = 111 and max difference = 888
    Example 2:
    Input: num = 9
    Output: 8
    Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
    The second time pick x = 9 and y = 1 and store the new integer in b.
    We have now a = 9 and b = 1 and max difference = 8
      Constraints:
    1 <= num <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 555;
        int expected = 888;
        var result = solution.maxDiff(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 9;
        int expected = 8;
        var result = solution.maxDiff(num);
        assertThat(result).isEqualTo(expected);
    }

}
