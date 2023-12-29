package com.blogspot.ostas.leetcode.all.hard.minimum_insertion_steps_to_make_a_string_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "zzazz"
    Output: 0
    Explanation: The string "zzazz" is already palindrome we do not need any insertions.
    Example 2:
    Input: s = "mbadm"
    Output: 2
    Explanation: String can be "mbdadbm" or "mdbabdm".
    Example 3:
    Input: s = "leetcode"
    Output: 5
    Explanation: Inserting 5 characters the string becomes "leetcodocteel".
      Constraints:
    1 <= s.length <= 500
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "zzazz";
        int expected = 0;
        var result = solution.minInsertions(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "mbadm";
        int expected = 2;
        var result = solution.minInsertions(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "leetcode";
        int expected = 5;
        var result = solution.minInsertions(s);
        assertThat(result).isEqualTo(expected);
    }

}
