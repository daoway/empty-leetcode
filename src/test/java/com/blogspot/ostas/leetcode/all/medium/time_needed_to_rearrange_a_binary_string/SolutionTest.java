package com.blogspot.ostas.leetcode.all.medium.time_needed_to_rearrange_a_binary_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "0110101"
    Output: 4
    Explanation:
    After one second, s becomes "1011010".
    After another second, s becomes "1101100".
    After the third second, s becomes "1110100".
    After the fourth second, s becomes "1111000".
    No occurrence of "01" exists any longer, and the process needed 4 seconds to complete,
    so we return 4.
    Example 2:
    Input: s = "11100"
    Output: 0
    Explanation:
    No occurrence of "01" exists in s, and the processes needed 0 seconds to complete,
    so we return 0.
      Constraints:
    1 <= s.length <= 1000
    s[i] is either '0' or '1'.
      Follow up:
    Can you solve this problem in O(n) time complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "0110101";
        int expected = 4;
        var result = solution.secondsToRemoveOccurrences(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "11100";
        int expected = 0;
        var result = solution.secondsToRemoveOccurrences(s);
        assertThat(result).isEqualTo(expected);
    }

}
