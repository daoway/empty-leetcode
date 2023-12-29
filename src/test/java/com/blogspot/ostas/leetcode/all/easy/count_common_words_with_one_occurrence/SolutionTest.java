package com.blogspot.ostas.leetcode.all.easy.count_common_words_with_one_occurrence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
    Output: 2
    Explanation:
    - "leetcode" appears exactly once in each of the two arrays. We count this string.
    - "amazing" appears exactly once in each of the two arrays. We count this string.
    - "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
    - "as" appears once in words1, but does not appear in words2. We do not count this string.
    Thus, there are 2 strings that appear exactly once in each of the two arrays.
    Example 2:
    Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
    Output: 0
    Explanation: There are no strings that appear in each of the two arrays.
    Example 3:
    Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
    Output: 1
    Explanation: The only string that appears exactly once in each of the two arrays is "ab".
      Constraints:
    1 <= words1.length, words2.length <= 1000
    1 <= words1[i].length, words2[j].length <= 30
    words1[i] and words2[j] consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words1 = new String[]{"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = new String[]{"amazing", "leetcode", "is"};
        int expected = 2;
        var result = solution.countWords(words1, words2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words1 = new String[]{"b", "bb", "bbb"};
        String[] words2 = new String[]{"a", "aa", "aaa"};
        int expected = 0;
        var result = solution.countWords(words1, words2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words1 = new String[]{"a", "ab"};
        String[] words2 = new String[]{"a", "a", "a", "ab"};
        int expected = 1;
        var result = solution.countWords(words1, words2);
        assertThat(result).isEqualTo(expected);
    }

}
