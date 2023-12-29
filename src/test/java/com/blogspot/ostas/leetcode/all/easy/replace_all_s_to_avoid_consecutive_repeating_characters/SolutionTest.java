package com.blogspot.ostas.leetcode.all.easy.replace_all_s_to_avoid_consecutive_repeating_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "?zs"
    Output: "azs"
    Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all are valid. Only "z" is an invalid modification as the string will consist of consecutive repeating characters in "zzs".
    Example 2:
    Input: s = "ubv?w"
    Output: "ubvaw"
    Explanation: There are 24 solutions for this problem. Only "v" and "w" are invalid modifications as the strings will consist of consecutive repeating characters in "ubvvw" and "ubvww".
      Constraints:
    1 <= s.length <= 100
    s consist of lowercase English letters and '?'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "?zs";
        String expected = "azs";
        var result = solution.modifyString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ubv?w";
        String expected = "ubvaw";
        var result = solution.modifyString(s);
        assertThat(result).isEqualTo(expected);
    }

}
