package com.blogspot.ostas.leetcode.all.medium.splitting_a_string_into_descending_consecutive_values;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1234"
    Output: false
    Explanation: There is no valid way to split s.
    Example 2:
    Input: s = "050043"
    Output: true
    Explanation: s can be split into ["05", "004", "3"] with numerical values [5,4,3].
    The values are in descending order with adjacent values differing by 1.
    Example 3:
    Input: s = "9080701"
    Output: false
    Explanation: There is no valid way to split s.
      Constraints:
    1 <= s.length <= 20
    s only consists of digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1234";
        boolean expected = false;
        var result = solution.splitString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "050043";
        boolean expected = true;
        var result = solution.splitString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "9080701";
        boolean expected = false;
        var result = solution.splitString(s);
        assertThat(result).isEqualTo(expected);
    }

}
