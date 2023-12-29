package com.blogspot.ostas.leetcode.all.hard.count_anagrams;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "too hot"
    Output: 18
    Explanation: Some of the anagrams of the given string are "too hot", "oot hot", "oto toh", "too toh", and "too oht".
    Example 2:
    Input: s = "aa"
    Output: 1
    Explanation: There is only one anagram possible for the given string.
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters and spaces ' '.
    There is single space between consecutive words.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "too hot";
        int expected = 18;
        var result = solution.countAnagrams(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aa";
        int expected = 1;
        var result = solution.countAnagrams(s);
        assertThat(result).isEqualTo(expected);
    }

}
