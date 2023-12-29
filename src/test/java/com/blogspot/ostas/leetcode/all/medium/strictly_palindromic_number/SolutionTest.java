package com.blogspot.ostas.leetcode.all.medium.strictly_palindromic_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 9
    Output: false
    Explanation: In base 2: 9 = 1001 (base 2), which is palindromic.
    In base 3: 9 = 100 (base 3), which is not palindromic.
    Therefore, 9 is not strictly palindromic so we return false.
    Note that in bases 4, 5, 6, and 7, n = 9 is also not palindromic.
    Example 2:
    Input: n = 4
    Output: false
    Explanation: We only consider base 2: 4 = 100 (base 2), which is not palindromic.
    Therefore, we return false.
      Constraints:
    4 <= n <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 9;
        boolean expected = false;
        var result = solution.isStrictlyPalindromic(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        boolean expected = false;
        var result = solution.isStrictlyPalindromic(n);
        assertThat(result).isEqualTo(expected);
    }

}
