package com.blogspot.ostas.leetcode.all.easy.check_if_the_number_is_fascinating;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 192
    Output: true
    Explanation: We concatenate the numbers n = 192 and 2 * n = 384 and 3 * n = 576. The resulting number is 192384576. This number contains all the digits from 1 to 9 exactly once.
    Example 2:
    Input: n = 100
    Output: false
    Explanation: We concatenate the numbers n = 100 and 2 * n = 200 and 3 * n = 300. The resulting number is 100200300. This number does not satisfy any of the conditions.
      Constraints:
    100 <= n <= 999
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 192;
        boolean expected = true;
        var result = solution.isFascinating(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 100;
        boolean expected = false;
        var result = solution.isFascinating(n);
        assertThat(result).isEqualTo(expected);
    }

}
