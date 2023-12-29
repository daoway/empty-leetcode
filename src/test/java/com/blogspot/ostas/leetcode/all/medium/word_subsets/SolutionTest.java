package com.blogspot.ostas.leetcode.all.medium.word_subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
    Output: ["facebook","google","leetcode"]
    Example 2:
    Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
    Output: ["apple","google","leetcode"]
      Constraints:
    1 <= words1.length, words2.length <= 104
    1 <= words1[i].length, words2[i].length <= 10
    words1[i] and words2[i] consist only of lowercase English letters.
    All the strings of words1 are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words1 = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = new String[]{"e", "o"};
        List<String> expected = List.of("facebook", "google", "leetcode");
        var result = solution.wordSubsets(words1, words2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words1 = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = new String[]{"l", "e"};
        List<String> expected = List.of("apple", "google", "leetcode");
        var result = solution.wordSubsets(words1, words2);
        assertThat(result).isEqualTo(expected);
    }

}
