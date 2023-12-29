package com.blogspot.ostas.leetcode.all.easy.sorting_the_sentence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "is2 sentence4 This1 a3"
    Output: "This is a sentence"
    Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
    Example 2:
    Input: s = "Myself2 Me1 I4 and3"
    Output: "Me Myself and I"
    Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
      Constraints:
    2 <= s.length <= 200
    s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
    The number of words in s is between 1 and 9.
    The words in s are separated by a single space.
    s contains no leading or trailing spaces.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "is2 sentence4 This1 a3";
        String expected = "This is a sentence";
        var result = solution.sortSentence(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "Myself2 Me1 I4 and3";
        String expected = "Me Myself and I";
        var result = solution.sortSentence(s);
        assertThat(result).isEqualTo(expected);
    }

}
