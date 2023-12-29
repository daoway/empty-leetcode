package com.blogspot.ostas.leetcode.all.medium.make_string_a_subsequence_using_cyclic_increments;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: str1 = "abc", str2 = "ad"
    Output: true
    Explanation: Select index 2 in str1.
    Increment str1[2] to become 'd'.
    Hence, str1 becomes "abd" and str2 is now a subsequence. Therefore, true is returned.
    Example 2:
    Input: str1 = "zc", str2 = "ad"
    Output: true
    Explanation: Select indices 0 and 1 in str1.
    Increment str1[0] to become 'a'.
    Increment str1[1] to become 'd'.
    Hence, str1 becomes "ad" and str2 is now a subsequence. Therefore, true is returned.
    Example 3:
    Input: str1 = "ab", str2 = "d"
    Output: false
    Explanation: In this example, it can be shown that it is impossible to make str2 a subsequence of str1 using the operation at most once.
    Therefore, false is returned.
      Constraints:
    1 <= str1.length <= 105
    1 <= str2.length <= 105
    str1 and str2 consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String str1 = "abc";
        String str2 = "ad";
        boolean expected = true;
        var result = solution.canMakeSubsequence(str1, str2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String str1 = "zc";
        String str2 = "ad";
        boolean expected = true;
        var result = solution.canMakeSubsequence(str1, str2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String str1 = "ab";
        String str2 = "d";
        boolean expected = false;
        var result = solution.canMakeSubsequence(str1, str2);
        assertThat(result).isEqualTo(expected);
    }

}
