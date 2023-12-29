package com.blogspot.ostas.leetcode.all.easy.find_the_index_of_the_first_occurrence_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.
    Example 2:
    Input: haystack = "leetcode", needle = "leeto"
    Output: -1
    Explanation: "leeto" did not occur in "leetcode", so we return -1.
      Constraints:
    1 <= haystack.length, needle.length <= 104
    haystack and needle consist of only lowercase English characters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";
        int expected = 0;
        var result = solution.strStr(haystack, needle);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String haystack = "leetcode";
        String needle = "leeto";
        int expected = -1;
        var result = solution.strStr(haystack, needle);
        assertThat(result).isEqualTo(expected);
    }

}
