package com.blogspot.ostas.leetcode.all.hard.lexicographically_smallest_beautiful_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcz", k = 26
    Output: "abda"
    Explanation: The string "abda" is beautiful and lexicographically larger than the string "abcz".
    It can be proven that there is no string that is lexicographically larger than the string "abcz", beautiful, and lexicographically smaller than the string "abda".
    Example 2:
    Input: s = "dc", k = 4
    Output: ""
    Explanation: It can be proven that there is no string that is lexicographically larger than the string "dc" and is beautiful.
      Constraints:
    1 <= n == s.length <= 105
    4 <= k <= 26
    s is a beautiful string.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcz";
        int k = 26;
        String expected = "abda";
        var result = solution.smallestBeautifulString(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "dc";
        int k = 4;
        String expected = "";
        var result = solution.smallestBeautifulString(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
