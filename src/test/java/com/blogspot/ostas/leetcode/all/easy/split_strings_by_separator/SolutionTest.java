package com.blogspot.ostas.leetcode.all.easy.split_strings_by_separator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["one.two.three","four.five","six"], separator = "."
    Output: ["one","two","three","four","five","six"]
    Explanation: In this example we split as follows:

    "one.two.three" splits into "one", "two", "three"
    "four.five" splits into "four", "five"
    "six" splits into "six"

    Hence, the resulting array is ["one","two","three","four","five","six"].
    Example 2:
    Input: words = ["$easy$","$problem$"], separator = "$"
    Output: ["easy","problem"]
    Explanation: In this example we split as follows:

    "$easy$" splits into "easy" (excluding empty strings)
    "$problem$" splits into "problem" (excluding empty strings)

    Hence, the resulting array is ["easy","problem"].
    Example 3:
    Input: words = ["|||"], separator = "|"
    Output: []
    Explanation: In this example the resulting split of "|||" will contain only empty strings, so we return an empty array [].
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 20
    characters in words[i] are either lowercase English letters or characters from the string ".,|$#@" (excluding the quotes)
    separator is a character from the string ".,|$#@" (excluding the quotes)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<String> words = List.of("one.two.three", "four.five", "six");
        char separator = '.';
        List<String> expected = List.of("one", "two", "three", "four", "five", "six");
        var result = solution.splitWordsBySeparator(words, separator);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<String> words = List.of("$easy$", "$problem$");
        char separator = '$';
        List<String> expected = List.of("easy", "problem");
        var result = solution.splitWordsBySeparator(words, separator);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<String> words = List.of("|||");
        char separator = '|';
        List<String> expected = List.of();
        var result = solution.splitWordsBySeparator(words, separator);
        assertThat(result).isEqualTo(expected);
    }

}
