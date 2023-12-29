package com.blogspot.ostas.leetcode.all.medium.short_encoding_of_words;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["time", "me", "bell"]
    Output: 10
    Explanation: A valid encoding would be s = "time#bell#" and indices = [0, 2, 5].
    words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "time#bell#"
    words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "time#bell#"
    words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#bell#"
    Example 2:
    Input: words = ["t"]
    Output: 2
    Explanation: A valid encoding would be s = "t#" and indices = [0].
      Constraints:
    1 <= words.length <= 2000
    1 <= words[i].length <= 7
    words[i] consists of only lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"time", "me", "bell"};
        int expected = 10;
        var result = solution.minimumLengthEncoding(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"t"};
        int expected = 2;
        var result = solution.minimumLengthEncoding(words);
        assertThat(result).isEqualTo(expected);
    }

}
