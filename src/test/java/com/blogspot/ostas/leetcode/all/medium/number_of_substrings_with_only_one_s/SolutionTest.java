package com.blogspot.ostas.leetcode.all.medium.number_of_substrings_with_only_one_s;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "0110111"
    Output: 9
    Explanation: There are 9 substring in total with only 1's characters.
    "1" -> 5 times.
    "11" -> 3 times.
    "111" -> 1 time.
    Example 2:
    Input: s = "101"
    Output: 2
    Explanation: Substring "1" is shown 2 times in s.
    Example 3:
    Input: s = "111111"
    Output: 21
    Explanation: Each substring contains only 1's characters.
      Constraints:
    1 <= s.length <= 105
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "0110111";
        int expected = 9;
        var result = solution.numSub(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "101";
        int expected = 2;
        var result = solution.numSub(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "111111";
        int expected = 21;
        var result = solution.numSub(s);
        assertThat(result).isEqualTo(expected);
    }

}
