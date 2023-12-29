package com.blogspot.ostas.leetcode.all.easy.substrings_of_size_three_with_distinct_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "xyzzaz"
    Output: 1
    Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
    The only good substring of length 3 is "xyz".
    Example 2:
    Input: s = "aababcabc"
    Output: 4
    Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
    The good substrings are "abc", "bca", "cab", and "abc".
      Constraints:
    1 <= s.length <= 100
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "xyzzaz";
        int expected = 1;
        var result = solution.countGoodSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aababcabc";
        int expected = 4;
        var result = solution.countGoodSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

}
