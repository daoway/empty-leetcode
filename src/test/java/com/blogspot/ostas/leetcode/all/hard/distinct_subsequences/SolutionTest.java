package com.blogspot.ostas.leetcode.all.hard.distinct_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "rabbbit", t = "rabbit"
    Output: 3
    Explanation:
    As shown below, there are 3 ways you can generate "rabbit" from s.
    rabbbit
    rabbbit
    rabbbit
    Example 2:
    Input: s = "babgbag", t = "bag"
    Output: 5
    Explanation:
    As shown below, there are 5 ways you can generate "bag" from s.
    babgbag
    babgbag
    babgbag
    babgbag
    babgbag
      Constraints:
    1 <= s.length, t.length <= 1000
    s and t consist of English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "rabbbit";
        String t = "rabbit";
        int expected = 3;
        var result = solution.numDistinct(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "babgbag";
        String t = "bag";
        int expected = 5;
        var result = solution.numDistinct(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
