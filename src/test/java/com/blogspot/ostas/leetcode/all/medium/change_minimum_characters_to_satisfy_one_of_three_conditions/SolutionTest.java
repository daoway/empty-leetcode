package com.blogspot.ostas.leetcode.all.medium.change_minimum_characters_to_satisfy_one_of_three_conditions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = "aba", b = "caa"
    Output: 2
    Explanation: Consider the best way to make each condition true:
    1) Change b to "ccc" in 2 operations, then every letter in a is less than every letter in b.
    2) Change a to "bbb" and b to "aaa" in 3 operations, then every letter in b is less than every letter in a.
    3) Change a to "aaa" and b to "aaa" in 2 operations, then a and b consist of one distinct letter.
    The best way was done in 2 operations (either condition 1 or condition 3).
    Example 2:
    Input: a = "dabadd", b = "cda"
    Output: 3
    Explanation: The best way is to make condition 1 true by changing b to "eee".
      Constraints:
    1 <= a.length, b.length <= 105
    a and b consist only of lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String a = "aba";
        String b = "caa";
        int expected = 2;
        var result = solution.minCharacters(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String a = "dabadd";
        String b = "cda";
        int expected = 3;
        var result = solution.minCharacters(a, b);
        assertThat(result).isEqualTo(expected);
    }

}
