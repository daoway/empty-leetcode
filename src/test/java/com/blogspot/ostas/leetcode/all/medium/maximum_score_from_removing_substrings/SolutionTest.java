package com.blogspot.ostas.leetcode.all.medium.maximum_score_from_removing_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "cdbcbbaaabab", x = 4, y = 5
    Output: 19
    Explanation:
    - Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
    - Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
    - Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
    - Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
    Total score = 5 + 4 + 5 + 5 = 19.
    Example 2:
    Input: s = "aabbaaxybbaabb", x = 5, y = 4
    Output: 20
      Constraints:
    1 <= s.length <= 105
    1 <= x, y <= 104
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "cdbcbbaaabab";
        int x = 4;
        int y = 5;
        int expected = 19;
        var result = solution.maximumGain(s, x, y);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aabbaaxybbaabb";
        int x = 5;
        int y = 4;
        int expected = 20;
        var result = solution.maximumGain(s, x, y);
        assertThat(result).isEqualTo(expected);
    }

}
