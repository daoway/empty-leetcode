package com.blogspot.ostas.leetcode.all.easy.license_key_formatting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "5F3Z-2e-9-w", k = 4
    Output: "5F3Z-2E9W"
    Explanation: The string s has been split into two parts, each part has 4 characters.
    Note that the two extra dashes are not needed and can be removed.
    Example 2:
    Input: s = "2-5g-3-J", k = 2
    Output: "2-5G-3J"
    Explanation: The string s has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
      Constraints:
    1 <= s.length <= 105
    s consists of English letters, digits, and dashes '-'.
    1 <= k <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String expected = "5F3Z-2E9W";
        var result = solution.licenseKeyFormatting(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "2-5g-3-J";
        int k = 2;
        String expected = "2-5G-3J";
        var result = solution.licenseKeyFormatting(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
