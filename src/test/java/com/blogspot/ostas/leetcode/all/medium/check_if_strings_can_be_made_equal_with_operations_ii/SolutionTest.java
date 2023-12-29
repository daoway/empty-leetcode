package com.blogspot.ostas.leetcode.all.medium.check_if_strings_can_be_made_equal_with_operations_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "abcdba", s2 = "cabdab"
    Output: true
    Explanation: We can apply the following operations on s1:
    - Choose the indices i = 0, j = 2. The resulting string is s1 = "cbadba".
    - Choose the indices i = 2, j = 4. The resulting string is s1 = "cbbdaa".
    - Choose the indices i = 1, j = 5. The resulting string is s1 = "cabdab" = s2.
    Example 2:
    Input: s1 = "abe", s2 = "bea"
    Output: false
    Explanation: It is not possible to make the two strings equal.
      Constraints:
    n == s1.length == s2.length
    1 <= n <= 105
    s1 and s2 consist only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "abcdba";
        String s2 = "cabdab";
        boolean expected = true;
        var result = solution.checkStrings(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "abe";
        String s2 = "bea";
        boolean expected = false;
        var result = solution.checkStrings(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
