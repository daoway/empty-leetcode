package com.blogspot.ostas.leetcode.all.medium.longest_word_in_dictionary_through_deleting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
    Output: "apple"
    Example 2:
    Input: s = "abpcplea", dictionary = ["a","b","c"]
    Output: "a"
      Constraints:
    1 <= s.length <= 1000
    1 <= dictionary.length <= 1000
    1 <= dictionary[i].length <= 1000
    s and dictionary[i] consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abpcplea";
        List<String> dictionary = List.of("ale", "apple", "monkey", "plea");
        String expected = "apple";
        var result = solution.findLongestWord(s, dictionary);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abpcplea";
        List<String> dictionary = List.of("a", "b", "c");
        String expected = "a";
        var result = solution.findLongestWord(s, dictionary);
        assertThat(result).isEqualTo(expected);
    }

}
