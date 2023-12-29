package com.blogspot.ostas.leetcode.all.medium.maximum_product_of_word_lengths;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
    Output: 16
    Explanation: The two words can be "abcw", "xtfn".
    Example 2:
    Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
    Output: 4
    Explanation: The two words can be "ab", "cd".
    Example 3:
    Input: words = ["a","aa","aaa","aaaa"]
    Output: 0
    Explanation: No such pair of words.
      Constraints:
    2 <= words.length <= 1000
    1 <= words[i].length <= 1000
    words[i] consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        int expected = 16;
        var result = solution.maxProduct(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        int expected = 4;
        var result = solution.maxProduct(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"a", "aa", "aaa", "aaaa"};
        int expected = 0;
        var result = solution.maxProduct(words);
        assertThat(result).isEqualTo(expected);
    }

}
