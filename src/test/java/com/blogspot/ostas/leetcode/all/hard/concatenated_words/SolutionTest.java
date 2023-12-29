package com.blogspot.ostas.leetcode.all.hard.concatenated_words;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
    Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
    Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats";
    "dogcatsdog" can be concatenated by "dog", "cats" and "dog";
    "ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
    Example 2:
    Input: words = ["cat","dog","catdog"]
    Output: ["catdog"]
      Constraints:
    1 <= words.length <= 104
    1 <= words[i].length <= 30
    words[i] consists of only lowercase English letters.
    All the strings of words are unique.
    1 <= sum(words[i].length) <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words =
                new String[]{"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat",
                        "ratcatdogcat"};
        List<String> expected = List.of("catsdogcats", "dogcatsdog", "ratcatdogcat");
        var result = solution.findAllConcatenatedWordsInADict(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"cat", "dog", "catdog"};
        List<String> expected = List.of("catdog");
        var result = solution.findAllConcatenatedWordsInADict(words);
        assertThat(result).isEqualTo(expected);
    }

}
