package com.blogspot.ostas.leetcode.all.easy.ransom_note;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ransomNote = "a", magazine = "b"
    Output: false
    Example 2:
    Input: ransomNote = "aa", magazine = "ab"
    Output: false
    Example 3:
    Input: ransomNote = "aa", magazine = "aab"
    Output: true
      Constraints:
    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String ransomNote = "a";
        String magazine = "b";
        boolean expected = false;
        var result = solution.canConstruct(ransomNote, magazine);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String ransomNote = "aa";
        String magazine = "ab";
        boolean expected = false;
        var result = solution.canConstruct(ransomNote, magazine);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean expected = true;
        var result = solution.canConstruct(ransomNote, magazine);
        assertThat(result).isEqualTo(expected);
    }

}
