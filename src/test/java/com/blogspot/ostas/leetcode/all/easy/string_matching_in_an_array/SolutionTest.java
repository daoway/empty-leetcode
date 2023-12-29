package com.blogspot.ostas.leetcode.all.easy.string_matching_in_an_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["mass","as","hero","superhero"]
    Output: ["as","hero"]
    Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
    ["hero","as"] is also a valid answer.
    Example 2:
    Input: words = ["leetcode","et","code"]
    Output: ["et","code"]
    Explanation: "et", "code" are substring of "leetcode".
    Example 3:
    Input: words = ["blue","green","bu"]
    Output: []
    Explanation: No string of words is substring of another string.
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 30
    words[i] contains only lowercase English letters.
    All the strings of words are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"mass", "as", "hero", "superhero"};
        List<String> expected = List.of("as", "hero");
        var result = solution.stringMatching(words);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"leetcode", "et", "code"};
        List<String> expected = List.of("et", "code");
        var result = solution.stringMatching(words);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"blue", "green", "bu"};
        List<String> expected = List.of();
        var result = solution.stringMatching(words);
        assertThat(result).isEqualTo(expected);
    }

}
