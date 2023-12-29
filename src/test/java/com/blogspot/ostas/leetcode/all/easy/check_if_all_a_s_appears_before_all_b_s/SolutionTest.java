package com.blogspot.ostas.leetcode.all.easy.check_if_all_a_s_appears_before_all_b_s;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aaabbb"
    Output: true
    Explanation:
    The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
    Hence, every 'a' appears before every 'b' and we return true.
    Example 2:
    Input: s = "abab"
    Output: false
    Explanation:
    There is an 'a' at index 2 and a 'b' at index 1.
    Hence, not every 'a' appears before every 'b' and we return false.
    Example 3:
    Input: s = "bbb"
    Output: true
    Explanation:
    There are no 'a's, hence, every 'a' appears before every 'b' and we return true.
      Constraints:
    1 <= s.length <= 100
    s[i] is either 'a' or 'b'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aaabbb";
        boolean expected = true;
        var result = solution.checkString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abab";
        boolean expected = false;
        var result = solution.checkString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "bbb";
        boolean expected = true;
        var result = solution.checkString(s);
        assertThat(result).isEqualTo(expected);
    }

}
