package com.blogspot.ostas.leetcode.all.hard.longest_happy_prefix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "level"
    Output: "l"
    Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".
    Example 2:
    Input: s = "ababab"
    Output: "abab"
    Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.
      Constraints:
    1 <= s.length <= 105
    s contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "level";
        String expected = "l";
        var result = solution.longestPrefix(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ababab";
        String expected = "abab";
        var result = solution.longestPrefix(s);
        assertThat(result).isEqualTo(expected);
    }

}
