package com.blogspot.ostas.leetcode.all.easy.check_if_a_string_is_an_acronym_of_words;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["alice","bob","charlie"], s = "abc"
    Output: true
    Explanation: The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym.
    Example 2:
    Input: words = ["an","apple"], s = "a"
    Output: false
    Explanation: The first character in the words "an" and "apple" are 'a' and 'a', respectively.
    The acronym formed by concatenating these characters is "aa".
    Hence, s = "a" is not the acronym.
    Example 3:
    Input: words = ["never","gonna","give","up","on","you"], s = "ngguoy"
    Output: true
    Explanation: By concatenating the first character of the words in the array, we get the string "ngguoy".
    Hence, s = "ngguoy" is the acronym.
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 10
    1 <= s.length <= 100
    words[i] and s consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<String> words = List.of("alice", "bob", "charlie");
        String s = "abc";
        boolean expected = true;
        var result = solution.isAcronym(words, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<String> words = List.of("an", "apple");
        String s = "a";
        boolean expected = false;
        var result = solution.isAcronym(words, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<String> words = List.of("never", "gonna", "give", "up", "on", "you");
        String s = "ngguoy";
        boolean expected = true;
        var result = solution.isAcronym(words, s);
        assertThat(result).isEqualTo(expected);
    }

}
