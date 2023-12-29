package com.blogspot.ostas.leetcode.all.easy.find_resultant_array_after_removing_anagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["abba","baba","bbaa","cd","cd"]
    Output: ["abba","cd"]
    Explanation:
    One of the ways we can obtain the resultant array is by using the following operations:
    - Since words[2] = "bbaa" and words[1] = "baba" are anagrams, we choose index 2 and delete words[2].
      Now words = ["abba","baba","cd","cd"].
    - Since words[1] = "baba" and words[0] = "abba" are anagrams, we choose index 1 and delete words[1].
      Now words = ["abba","cd","cd"].
    - Since words[2] = "cd" and words[1] = "cd" are anagrams, we choose index 2 and delete words[2].
      Now words = ["abba","cd"].
    We can no longer perform any operations, so ["abba","cd"] is the final answer.
    Example 2:
    Input: words = ["a","b","c","d","e"]
    Output: ["a","b","c","d","e"]
    Explanation:
    No two adjacent strings in words are anagrams of each other, so no operations are performed.
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 10
    words[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"abba", "baba", "bbaa", "cd", "cd"};
        List<String> expected = List.of("abba", "cd");
        var result = solution.removeAnagrams(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"a", "b", "c", "d", "e"};
        List<String> expected = List.of("a", "b", "c", "d", "e");
        var result = solution.removeAnagrams(words);
        assertThat(result).isEqualTo(expected);
    }

}
