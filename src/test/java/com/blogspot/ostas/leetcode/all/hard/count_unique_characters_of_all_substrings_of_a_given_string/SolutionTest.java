package com.blogspot.ostas.leetcode.all.hard.count_unique_characters_of_all_substrings_of_a_given_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ABC"
    Output: 10
    Explanation: All possible substrings are: "A","B","C","AB","BC" and "ABC".
    Every substring is composed with only unique letters.
    Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10
    Example 2:
    Input: s = "ABA"
    Output: 8
    Explanation: The same as example 1, except countUniqueChars("ABA") = 1.
    Example 3:
    Input: s = "LEETCODE"
    Output: 92
      Constraints:
    1 <= s.length <= 105
    s consists of uppercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ABC";
        int expected = 10;
        var result = solution.uniqueLetterString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ABA";
        int expected = 8;
        var result = solution.uniqueLetterString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "LEETCODE";
        int expected = 92;
        var result = solution.uniqueLetterString(s);
        assertThat(result).isEqualTo(expected);
    }

}
