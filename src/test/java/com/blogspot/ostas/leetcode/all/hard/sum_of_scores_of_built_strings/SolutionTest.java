package com.blogspot.ostas.leetcode.all.hard.sum_of_scores_of_built_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "babab"
    Output: 9
    Explanation:
    For s1 == "b", the longest common prefix is "b" which has a score of 1.
    For s2 == "ab", there is no common prefix so the score is 0.
    For s3 == "bab", the longest common prefix is "bab" which has a score of 3.
    For s4 == "abab", there is no common prefix so the score is 0.
    For s5 == "babab", the longest common prefix is "babab" which has a score of 5.
    The sum of the scores is 1 + 0 + 3 + 0 + 5 = 9, so we return 9.
    Example 2:
    Input: s = "azbazbzaz"
    Output: 14
    Explanation:
    For s2 == "az", the longest common prefix is "az" which has a score of 2.
    For s6 == "azbzaz", the longest common prefix is "azb" which has a score of 3.
    For s9 == "azbazbzaz", the longest common prefix is "azbazbzaz" which has a score of 9.
    For all other si, the score is 0.
    The sum of the scores is 2 + 3 + 9 = 14, so we return 14.
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "babab";
        long expected = 9;
        var result = solution.sumScores(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "azbazbzaz";
        long expected = 14;
        var result = solution.sumScores(s);
        assertThat(result).isEqualTo(expected);
    }

}
