package com.blogspot.ostas.leetcode.all.medium.find_all_anagrams_in_a_string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "cbaebabacd", p = "abc"
    Output: [0,6]
    Explanation:
    The substring with start index = 0 is "cba", which is an anagram of "abc".
    The substring with start index = 6 is "bac", which is an anagram of "abc".
    Example 2:
    Input: s = "abab", p = "ab"
    Output: [0,1,2]
    Explanation:
    The substring with start index = 0 is "ab", which is an anagram of "ab".
    The substring with start index = 1 is "ba", which is an anagram of "ab".
    The substring with start index = 2 is "ab", which is an anagram of "ab".
      Constraints:
    1 <= s.length, p.length <= 3 * 104
    s and p consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> expected = List.of(0, 6);
        var result = solution.findAnagrams(s, p);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abab";
        String p = "ab";
        List<Integer> expected = List.of(0, 1, 2);
        var result = solution.findAnagrams(s, p);
        assertThat(result).isEqualTo(expected);
    }

}
