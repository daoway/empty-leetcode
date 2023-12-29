package com.blogspot.ostas.leetcode.all.medium.apply_operations_to_make_two_strings_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "1100011000", s2 = "0101001010", x = 2
    Output: 4
    Explanation: We can do the following operations:
    - Choose i = 3 and apply the second operation. The resulting string is s1 = "1101111000".
    - Choose i = 4 and apply the second operation. The resulting string is s1 = "1101001000".
    - Choose i = 0 and j = 8 and apply the first operation. The resulting string is s1 = "0101001010" = s2.
    The total cost is 1 + 1 + 2 = 4. It can be shown that it is the minimum cost possible.
    Example 2:
    Input: s1 = "10110", s2 = "00011", x = 4
    Output: -1
    Explanation: It is not possible to make the two strings equal.
      Constraints:
    n == s1.length == s2.length
    1 <= n, x <= 500
    s1 and s2 consist only of the characters '0' and '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "1100011000";
        String s2 = "0101001010";
        int x = 2;
        int expected = 4;
        var result = solution.minOperations(s1, s2, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "10110";
        String s2 = "00011";
        int x = 4;
        int expected = -1;
        var result = solution.minOperations(s1, s2, x);
        assertThat(result).isEqualTo(expected);
    }

}
