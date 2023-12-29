package com.blogspot.ostas.leetcode.all.easy.make_three_strings_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "abc", s2 = "abb", s3 = "ab"
    Output: 2
    Explanation: Performing operations on s1 and s2 once will lead to three equal strings.
    It can be shown that there is no way to make them equal with less than two operations.
    Example 2:
    Input: s1 = "dac", s2 = "bac", s3 = "cac"
    Output: -1
    Explanation: Because the leftmost letters of s1 and s2 are not equal, they could not be equal after any number of operations. So the answer is -1.
      Constraints:
    1 <= s1.length, s2.length, s3.length <= 100
    s1, s2 and s3 consist only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "abc";
        String s2 = "abb";
        String s3 = "ab";
        int expected = 2;
        var result = solution.findMinimumOperations(s1, s2, s3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "dac";
        String s2 = "bac";
        String s3 = "cac";
        int expected = -1;
        var result = solution.findMinimumOperations(s1, s2, s3);
        assertThat(result).isEqualTo(expected);
    }

}
