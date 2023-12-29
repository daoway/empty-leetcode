package com.blogspot.ostas.leetcode.all.easy.check_if_strings_can_be_made_equal_with_operations_i;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "abcd", s2 = "cdab"
    Output: true
    Explanation: We can do the following operations on s1:
    - Choose the indices i = 0, j = 2. The resulting string is s1 = "cbad".
    - Choose the indices i = 1, j = 3. The resulting string is s1 = "cdab" = s2.
    Example 2:
    Input: s1 = "abcd", s2 = "dacb"
    Output: false
    Explanation: It is not possible to make the two strings equal.
      Constraints:
    s1.length == s2.length == 4
    s1 and s2 consist only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "abcd";
        String s2 = "cdab";
        boolean expected = true;
        var result = solution.canBeEqual(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "abcd";
        String s2 = "dacb";
        boolean expected = false;
        var result = solution.canBeEqual(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
