package com.blogspot.ostas.leetcode.all.easy.check_if_word_equals_summation_of_two_words;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
    Output: true
    Explanation:
    The numerical value of firstWord is "acb" -> "021" -> 21.
    The numerical value of secondWord is "cba" -> "210" -> 210.
    The numerical value of targetWord is "cdb" -> "231" -> 231.
    We return true because 21 + 210 == 231.
    Example 2:
    Input: firstWord = "aaa", secondWord = "a", targetWord = "aab"
    Output: false
    Explanation:
    The numerical value of firstWord is "aaa" -> "000" -> 0.
    The numerical value of secondWord is "a" -> "0" -> 0.
    The numerical value of targetWord is "aab" -> "001" -> 1.
    We return false because 0 + 0 != 1.
    Example 3:
    Input: firstWord = "aaa", secondWord = "a", targetWord = "aaaa"
    Output: true
    Explanation:
    The numerical value of firstWord is "aaa" -> "000" -> 0.
    The numerical value of secondWord is "a" -> "0" -> 0.
    The numerical value of targetWord is "aaaa" -> "0000" -> 0.
    We return true because 0 + 0 == 0.
      Constraints:
    1 <= firstWord.length, secondWord.length, targetWord.length <= 8
    firstWord, secondWord, and targetWord consist of lowercase English letters from 'a' to 'j' inclusive.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        boolean expected = true;
        var result = solution.isSumEqual(firstWord, secondWord, targetWord);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String firstWord = "aaa";
        String secondWord = "a";
        String targetWord = "aab";
        boolean expected = false;
        var result = solution.isSumEqual(firstWord, secondWord, targetWord);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String firstWord = "aaa";
        String secondWord = "a";
        String targetWord = "aaaa";
        boolean expected = true;
        var result = solution.isSumEqual(firstWord, secondWord, targetWord);
        assertThat(result).isEqualTo(expected);
    }

}
