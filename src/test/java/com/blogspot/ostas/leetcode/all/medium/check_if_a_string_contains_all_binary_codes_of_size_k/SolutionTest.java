package com.blogspot.ostas.leetcode.all.medium.check_if_a_string_contains_all_binary_codes_of_size_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "00110110", k = 2
    Output: true
    Explanation: The binary codes of length 2 are "00", "01", "10" and "11". They can be all found as substrings at indices 0, 1, 3 and 2 respectively.
    Example 2:
    Input: s = "0110", k = 1
    Output: true
    Explanation: The binary codes of length 1 are "0" and "1", it is clear that both exist as a substring.
    Example 3:
    Input: s = "0110", k = 2
    Output: false
    Explanation: The binary code "00" is of length 2 and does not exist in the array.
      Constraints:
    1 <= s.length <= 5 * 105
    s[i] is either '0' or '1'.
    1 <= k <= 20
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "00110110";
        int k = 2;
        boolean expected = true;
        var result = solution.hasAllCodes(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "0110";
        int k = 1;
        boolean expected = true;
        var result = solution.hasAllCodes(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "0110";
        int k = 2;
        boolean expected = false;
        var result = solution.hasAllCodes(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
