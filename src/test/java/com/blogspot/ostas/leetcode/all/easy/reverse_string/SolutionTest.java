package com.blogspot.ostas.leetcode.all.easy.reverse_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
        Example 1:
    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]
    Example 2:
    Input: s = ["H","a","n","n","a","h"]
    Output: ["h","a","n","n","a","H"]
      Constraints:
    1 <= s.length <= 105
    s[i] is a printable ascii character.
    */

    @Test
    void test_0() {
        var solution = new Solution();
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        var expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        solution.reverseString(s);
        assertThat(s).isEqualTo(expected);
    }
}
