package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_changes_to_make_binary_string_beautiful;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1001"
    Output: 2
    Explanation: We change s[1] to 1 and s[3] to 0 to get string "1100".
    It can be seen that the string "1100" is beautiful because we can partition it into "11|00".
    It can be proven that 2 is the minimum number of changes needed to make the string beautiful.
    Example 2:
    Input: s = "10"
    Output: 1
    Explanation: We change s[1] to 1 to get string "11".
    It can be seen that the string "11" is beautiful because we can partition it into "11".
    It can be proven that 1 is the minimum number of changes needed to make the string beautiful.
    Example 3:
    Input: s = "0000"
    Output: 0
    Explanation: We don't need to make any changes as the string "0000" is beautiful already.
      Constraints:
    2 <= s.length <= 105
    s has an even length.
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1001";
        int expected = 2;
        var result = solution.minChanges(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "10";
        int expected = 1;
        var result = solution.minChanges(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "0000";
        int expected = 0;
        var result = solution.minChanges(s);
        assertThat(result).isEqualTo(expected);
    }

}
