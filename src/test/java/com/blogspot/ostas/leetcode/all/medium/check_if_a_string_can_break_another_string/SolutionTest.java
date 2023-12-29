package com.blogspot.ostas.leetcode.all.medium.check_if_a_string_can_break_another_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "abc", s2 = "xya"
    Output: true
    Explanation: "ayx" is a permutation of s2="xya" which can break to string "abc" which is a permutation of s1="abc".
    Example 2:
    Input: s1 = "abe", s2 = "acd"
    Output: false
    Explanation: All permutations for s1="abe" are: "abe", "aeb", "bae", "bea", "eab" and "eba" and all permutation for s2="acd" are: "acd", "adc", "cad", "cda", "dac" and "dca". However, there is not any permutation from s1 which can break some permutation from s2 and vice-versa.
    Example 3:
    Input: s1 = "leetcodee", s2 = "interview"
    Output: true
      Constraints:
    s1.length == n
    s2.length == n
    1 <= n <= 10^5
    All strings consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "abc";
        String s2 = "xya";
        boolean expected = true;
        var result = solution.checkIfCanBreak(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "abe";
        String s2 = "acd";
        boolean expected = false;
        var result = solution.checkIfCanBreak(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s1 = "leetcodee";
        String s2 = "interview";
        boolean expected = true;
        var result = solution.checkIfCanBreak(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
