package com.blogspot.ostas.leetcode.all.medium.partition_string_into_minimum_beautiful_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1011"
    Output: 2
    Explanation: We can paritition the given string into ["101", "1"].
    - The string "101" does not contain leading zeros and is the binary representation of integer 51 = 5.
    - The string "1" does not contain leading zeros and is the binary representation of integer 50 = 1.
    It can be shown that 2 is the minimum number of beautiful substrings that s can be partitioned into.
    Example 2:
    Input: s = "111"
    Output: 3
    Explanation: We can paritition the given string into ["1", "1", "1"].
    - The string "1" does not contain leading zeros and is the binary representation of integer 50 = 1.
    It can be shown that 3 is the minimum number of beautiful substrings that s can be partitioned into.
    Example 3:
    Input: s = "0"
    Output: -1
    Explanation: We can not partition the given string into beautiful substrings.
      Constraints:
    1 <= s.length <= 15
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1011";
        int expected = 2;
        var result = solution.minimumBeautifulSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "111";
        int expected = 3;
        var result = solution.minimumBeautifulSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "0";
        int expected = -1;
        var result = solution.minimumBeautifulSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

}
