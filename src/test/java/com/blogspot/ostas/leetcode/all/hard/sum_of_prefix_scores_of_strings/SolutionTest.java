package com.blogspot.ostas.leetcode.all.hard.sum_of_prefix_scores_of_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["abc","ab","bc","b"]
    Output: [5,4,3,2]
    Explanation: The answer for each string is the following:
    - "abc" has 3 prefixes: "a", "ab", and "abc".
    - There are 2 strings with the prefix "a", 2 strings with the prefix "ab", and 1 string with the prefix "abc".
    The total is answer[0] = 2 + 2 + 1 = 5.
    - "ab" has 2 prefixes: "a" and "ab".
    - There are 2 strings with the prefix "a", and 2 strings with the prefix "ab".
    The total is answer[1] = 2 + 2 = 4.
    - "bc" has 2 prefixes: "b" and "bc".
    - There are 2 strings with the prefix "b", and 1 string with the prefix "bc".
    The total is answer[2] = 2 + 1 = 3.
    - "b" has 1 prefix: "b".
    - There are 2 strings with the prefix "b".
    The total is answer[3] = 2.
    Example 2:
    Input: words = ["abcd"]
    Output: [4]
    Explanation:
    "abcd" has 4 prefixes: "a", "ab", "abc", and "abcd".
    Each prefix has a score of one, so the total is answer[0] = 1 + 1 + 1 + 1 = 4.
      Constraints:
    1 <= words.length <= 1000
    1 <= words[i].length <= 1000
    words[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"abc", "ab", "bc", "b"};
        int[] expected = new int[]{5, 4, 3, 2};
        var result = solution.sumPrefixScores(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"abcd"};
        int[] expected = new int[]{4};
        var result = solution.sumPrefixScores(words);
        assertThat(result).isEqualTo(expected);
    }

}
