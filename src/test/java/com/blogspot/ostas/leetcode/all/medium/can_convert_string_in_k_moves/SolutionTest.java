package com.blogspot.ostas.leetcode.all.medium.can_convert_string_in_k_moves;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "input", t = "ouput", k = 9
    Output: true
    Explanation: In the 6th move, we shift 'i' 6 times to get 'o'. And in the 7th move we shift 'n' to get 'u'.
    Example 2:
    Input: s = "abc", t = "bcd", k = 10
    Output: false
    Explanation: We need to shift each character in s one time to convert it into t. We can shift 'a' to 'b' during the 1st move. However, there is no way to shift the other characters in the remaining moves to obtain t from s.
    Example 3:
    Input: s = "aab", t = "bbb", k = 27
    Output: true
    Explanation: In the 1st move, we shift the first 'a' 1 time to get 'b'. In the 27th move, we shift the second 'a' 27 times to get 'b'.
      Constraints:
    1 <= s.length, t.length <= 10^5
    0 <= k <= 10^9
    s, t contain only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "input";
        String t = "ouput";
        int k = 9;
        boolean expected = true;
        var result = solution.canConvertString(s, t, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abc";
        String t = "bcd";
        int k = 10;
        boolean expected = false;
        var result = solution.canConvertString(s, t, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aab";
        String t = "bbb";
        int k = 27;
        boolean expected = true;
        var result = solution.canConvertString(s, t, k);
        assertThat(result).isEqualTo(expected);
    }

}
