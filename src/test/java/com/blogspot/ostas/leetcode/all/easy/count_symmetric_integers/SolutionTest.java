package com.blogspot.ostas.leetcode.all.easy.count_symmetric_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: low = 1, high = 100
    Output: 9
    Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.
    Example 2:
    Input: low = 1200, high = 1230
    Output: 4
    Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
      Constraints:
    1 <= low <= high <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int low = 1;
        int high = 100;
        int expected = 9;
        var result = solution.countSymmetricIntegers(low, high);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int low = 1200;
        int high = 1230;
        int expected = 4;
        var result = solution.countSymmetricIntegers(low, high);
        assertThat(result).isEqualTo(expected);
    }

}
