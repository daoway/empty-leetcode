package com.blogspot.ostas.leetcode.all.easy.keyboard_row;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["Hello","Alaska","Dad","Peace"]
    Output: ["Alaska","Dad"]
    Example 2:
    Input: words = ["omk"]
    Output: []
    Example 3:
    Input: words = ["adsdf","sfd"]
    Output: ["adsdf","sfd"]
      Constraints:
    1 <= words.length <= 20
    1 <= words[i].length <= 100
    words[i] consists of English letters (both lowercase and uppercase).
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] expected = new String[]{"Alaska", "Dad"};
        var result = solution.findWords(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"omk"};
        String[] expected = new String[]{};
        var result = solution.findWords(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"adsdf", "sfd"};
        String[] expected = new String[]{"adsdf", "sfd"};
        var result = solution.findWords(words);
        assertThat(result).isEqualTo(expected);
    }

}
