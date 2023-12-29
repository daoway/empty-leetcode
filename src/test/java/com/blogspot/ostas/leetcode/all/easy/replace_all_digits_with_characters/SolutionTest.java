package com.blogspot.ostas.leetcode.all.easy.replace_all_digits_with_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "a1c1e1"
    Output: "abcdef"
    Explanation: The digits are replaced as follows:
    - s[1] -> shift('a',1) = 'b'
    - s[3] -> shift('c',1) = 'd'
    - s[5] -> shift('e',1) = 'f'
    Example 2:
    Input: s = "a1b2c3d4e"
    Output: "abbdcfdhe"
    Explanation: The digits are replaced as follows:
    - s[1] -> shift('a',1) = 'b'
    - s[3] -> shift('b',2) = 'd'
    - s[5] -> shift('c',3) = 'f'
    - s[7] -> shift('d',4) = 'h'
      Constraints:
    1 <= s.length <= 100
    s consists only of lowercase English letters and digits.
    shift(s[i-1], s[i]) <= 'z' for all odd indices i.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "a1c1e1";
        String expected = "abcdef";
        var result = solution.replaceDigits(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "a1b2c3d4e";
        String expected = "abbdcfdhe";
        var result = solution.replaceDigits(s);
        assertThat(result).isEqualTo(expected);
    }

}
