package com.blogspot.ostas.leetcode.all.medium.expressive_words;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "heeellooo", words = ["hello", "hi", "helo"]
    Output: 1
    Explanation:
    We can extend "e" and "o" in the word "hello" to get "heeellooo".
    We can't extend "helo" to get "heeellooo" because the group "ll" is not size 3 or more.
    Example 2:
    Input: s = "zzzzzyyyyy", words = ["zzyy","zy","zyy"]
    Output: 3
      Constraints:
    1 <= s.length, words.length <= 100
    1 <= words[i].length <= 100
    s and words[i] consist of lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "heeellooo";
        String[] words = new String[]{"hello", "hi", "helo"};
        int expected = 1;
        var result = solution.expressiveWords(s, words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "zzzzzyyyyy";
        String[] words = new String[]{"zzyy", "zy", "zyy"};
        int expected = 3;
        var result = solution.expressiveWords(s, words);
        assertThat(result).isEqualTo(expected);
    }

}
