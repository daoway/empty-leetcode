package com.blogspot.ostas.leetcode.all.easy.count_pairs_of_similar_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["aba","aabb","abcd","bac","aabc"]
    Output: 2
    Explanation: There are 2 pairs that satisfy the conditions:
    - i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
    - i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'.
    Example 2:
    Input: words = ["aabb","ab","ba"]
    Output: 3
    Explanation: There are 3 pairs that satisfy the conditions:
    - i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
    - i = 0 and j = 2 : both words[0] and words[2] only consist of characters 'a' and 'b'.
    - i = 1 and j = 2 : both words[1] and words[2] only consist of characters 'a' and 'b'.
    Example 3:
    Input: words = ["nba","cba","dba"]
    Output: 0
    Explanation: Since there does not exist any pair that satisfies the conditions, we return 0.
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 100
    words[i] consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"aba", "aabb", "abcd", "bac", "aabc"};
        int expected = 2;
        var result = solution.similarPairs(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"aabb", "ab", "ba"};
        int expected = 3;
        var result = solution.similarPairs(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"nba", "cba", "dba"};
        int expected = 0;
        var result = solution.similarPairs(words);
        assertThat(result).isEqualTo(expected);
    }

}
