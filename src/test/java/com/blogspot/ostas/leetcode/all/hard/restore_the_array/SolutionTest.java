package com.blogspot.ostas.leetcode.all.hard.restore_the_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1000", k = 10000
    Output: 1
    Explanation: The only possible array is [1000]
    Example 2:
    Input: s = "1000", k = 10
    Output: 0
    Explanation: There cannot be an array that was printed this way and has all integer >= 1 and <= 10.
    Example 3:
    Input: s = "1317", k = 2000
    Output: 8
    Explanation: Possible arrays are [1317],[131,7],[13,17],[1,317],[13,1,7],[1,31,7],[1,3,17],[1,3,1,7]
      Constraints:
    1 <= s.length <= 105
    s consists of only digits and does not contain leading zeros.
    1 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1000";
        int k = 10000;
        int expected = 1;
        var result = solution.numberOfArrays(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "1000";
        int k = 10;
        int expected = 0;
        var result = solution.numberOfArrays(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1317";
        int k = 2000;
        int expected = 8;
        var result = solution.numberOfArrays(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
