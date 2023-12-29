package com.blogspot.ostas.leetcode.all.easy.uncommon_words_from_two_sentences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "this apple is sweet", s2 = "this apple is sour"
    Output: ["sweet","sour"]
    Example 2:
    Input: s1 = "apple apple", s2 = "banana"
    Output: ["banana"]
      Constraints:
    1 <= s1.length, s2.length <= 200
    s1 and s2 consist of lowercase English letters and spaces.
    s1 and s2 do not have leading or trailing spaces.
    All the words in s1 and s2 are separated by a single space.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] expected = new String[]{"sweet", "sour"};
        var result = solution.uncommonFromSentences(s1, s2);
        assertThat(result).containsExactlyInAnyOrder(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "apple apple";
        String s2 = "banana";
        String[] expected = new String[]{"banana"};
        var result = solution.uncommonFromSentences(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
