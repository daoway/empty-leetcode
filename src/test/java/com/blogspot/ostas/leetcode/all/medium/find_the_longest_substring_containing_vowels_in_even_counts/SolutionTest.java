package com.blogspot.ostas.leetcode.all.medium.find_the_longest_substring_containing_vowels_in_even_counts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "eleetminicoworoep"
    Output: 13
    Explanation: The longest substring is "leetminicowor" which contains two each of the vowels: e, i and o and zero of the vowels: a and u.
    Example 2:
    Input: s = "leetcodeisgreat"
    Output: 5
    Explanation: The longest substring is "leetc" which contains two e's.
    Example 3:
    Input: s = "bcbcbc"
    Output: 6
    Explanation: In this case, the given string "bcbcbc" is the longest because all vowels: a, e, i, o and u appear zero times.
      Constraints:
    1 <= s.length <= 5 x 10^5
    s contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "eleetminicoworoep";
        int expected = 13;
        var result = solution.findTheLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "leetcodeisgreat";
        int expected = 5;
        var result = solution.findTheLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "bcbcbc";
        int expected = 6;
        var result = solution.findTheLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

}
