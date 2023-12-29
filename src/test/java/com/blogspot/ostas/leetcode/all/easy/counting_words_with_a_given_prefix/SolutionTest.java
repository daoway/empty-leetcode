package com.blogspot.ostas.leetcode.all.easy.counting_words_with_a_given_prefix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["pay","attention","practice","attend"], pref = "at"
    Output: 2
    Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
    Example 2:
    Input: words = ["leetcode","win","loops","success"], pref = "code"
    Output: 0
    Explanation: There are no strings that contain "code" as a prefix.
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length, pref.length <= 100
    words[i] and pref consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"pay", "attention", "practice", "attend"};
        String pref = "at";
        int expected = 2;
        var result = solution.prefixCount(words, pref);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"leetcode", "win", "loops", "success"};
        String pref = "code";
        int expected = 0;
        var result = solution.prefixCount(words, pref);
        assertThat(result).isEqualTo(expected);
    }

}
