package com.blogspot.ostas.leetcode.all.medium.compare_strings_by_frequency_of_the_smallest_character;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: queries = ["cbd"], words = ["zaaaz"]
    Output: [1]
    Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz").
    Example 2:
    Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
    Output: [1,2]
    Explanation: On the first query only f("bbb") < f("aaaa"). On the second query both f("aaa") and f("aaaa") are both > f("cc").
      Constraints:
    1 <= queries.length <= 2000
    1 <= words.length <= 2000
    1 <= queries[i].length, words[i].length <= 10
    queries[i][j], words[i][j] consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] queries = new String[]{"cbd"};
        String[] words = new String[]{"zaaaz"};
        int[] expected = new int[]{1};
        var result = solution.numSmallerByFrequency(queries, words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] queries = new String[]{"bbb", "cc"};
        String[] words = new String[]{"a", "aa", "aaa", "aaaa"};
        int[] expected = new int[]{1, 2};
        var result = solution.numSmallerByFrequency(queries, words);
        assertThat(result).isEqualTo(expected);
    }

}
