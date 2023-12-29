package com.blogspot.ostas.leetcode.all.medium.check_if_a_parentheses_string_can_be_valid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "))()))", locked = "010100"
    Output: true
    Explanation: locked[1] == '1' and locked[3] == '1', so we cannot change s[1] or s[3].
    We change s[0] and s[4] to '(' while leaving s[2] and s[5] unchanged to make s valid.
    Example 2:
    Input: s = "()()", locked = "0000"
    Output: true
    Explanation: We do not need to make any changes because s is already valid.
    Example 3:
    Input: s = ")", locked = "0"
    Output: false
    Explanation: locked permits us to change s[0].
    Changing s[0] to either '(' or ')' will not make s valid.
      Constraints:
    n == s.length == locked.length
    1 <= n <= 105
    s[i] is either '(' or ')'.
    locked[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "))()))";
        String locked = "010100";
        boolean expected = true;
        var result = solution.canBeValid(s, locked);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "()()";
        String locked = "0000";
        boolean expected = true;
        var result = solution.canBeValid(s, locked);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = ")";
        String locked = "0";
        boolean expected = false;
        var result = solution.canBeValid(s, locked);
        assertThat(result).isEqualTo(expected);
    }

}
