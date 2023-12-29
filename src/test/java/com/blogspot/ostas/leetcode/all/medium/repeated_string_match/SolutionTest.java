package com.blogspot.ostas.leetcode.all.medium.repeated_string_match;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = "abcd", b = "cdabcdab"
    Output: 3
    Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
    Example 2:
    Input: a = "a", b = "aa"
    Output: 2
      Constraints:
    1 <= a.length, b.length <= 104
    a and b consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String a = "abcd";
        String b = "cdabcdab";
        int expected = 3;
        var result = solution.repeatedStringMatch(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String a = "a";
        String b = "aa";
        int expected = 2;
        var result = solution.repeatedStringMatch(a, b);
        assertThat(result).isEqualTo(expected);
    }

}
