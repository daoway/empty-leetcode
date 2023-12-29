package com.blogspot.ostas.leetcode.all.medium.remove_all_occurrences_of_a_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "daabcbaabcbc", part = "abc"
    Output: "dab"
    Explanation: The following operations are done:
    - s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
    - s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
    - s = "dababc", remove "abc" starting at index 3, so s = "dab".
    Now s has no occurrences of "abc".
    Example 2:
    Input: s = "axxxxyyyyb", part = "xy"
    Output: "ab"
    Explanation: The following operations are done:
    - s = "axxxxyyyyb", remove "xy" starting at index 4 so s = "axxxyyyb".
    - s = "axxxyyyb", remove "xy" starting at index 3 so s = "axxyyb".
    - s = "axxyyb", remove "xy" starting at index 2 so s = "axyb".
    - s = "axyb", remove "xy" starting at index 1 so s = "ab".
    Now s has no occurrences of "xy".
      Constraints:
    1 <= s.length <= 1000
    1 <= part.length <= 1000
    s and part consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "daabcbaabcbc";
        String part = "abc";
        String expected = "dab";
        var result = solution.removeOccurrences(s, part);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "axxxxyyyyb";
        String part = "xy";
        String expected = "ab";
        var result = solution.removeOccurrences(s, part);
        assertThat(result).isEqualTo(expected);
    }

}
