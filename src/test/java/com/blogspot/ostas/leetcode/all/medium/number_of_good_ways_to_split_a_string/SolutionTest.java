package com.blogspot.ostas.leetcode.all.medium.number_of_good_ways_to_split_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aacaba"
    Output: 2
    Explanation: There are 5 ways to split "aacaba" and 2 of them are good.
    ("a", "acaba") Left string and right string contains 1 and 3 different letters respectively.
    ("aa", "caba") Left string and right string contains 1 and 3 different letters respectively.
    ("aac", "aba") Left string and right string contains 2 and 2 different letters respectively (good split).
    ("aaca", "ba") Left string and right string contains 2 and 2 different letters respectively (good split).
    ("aacab", "a") Left string and right string contains 3 and 1 different letters respectively.
    Example 2:
    Input: s = "abcd"
    Output: 1
    Explanation: Split the string as follows ("ab", "cd").
      Constraints:
    1 <= s.length <= 105
    s consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aacaba";
        int expected = 2;
        var result = solution.numSplits(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcd";
        int expected = 1;
        var result = solution.numSplits(s);
        assertThat(result).isEqualTo(expected);
    }

}
