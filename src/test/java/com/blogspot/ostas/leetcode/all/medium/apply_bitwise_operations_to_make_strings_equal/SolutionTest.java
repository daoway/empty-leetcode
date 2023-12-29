package com.blogspot.ostas.leetcode.all.medium.apply_bitwise_operations_to_make_strings_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1010", target = "0110"
    Output: true
    Explanation: We can do the following operations:
    - Choose i = 2 and j = 0. We have now s = "0010".
    - Choose i = 2 and j = 1. We have now s = "0110".
    Since we can make s equal to target, we return true.
    Example 2:
    Input: s = "11", target = "00"
    Output: false
    Explanation: It is not possible to make s equal to target with any number of operations.
      Constraints:
    n == s.length == target.length
    2 <= n <= 105
    s and target consist of only the digits 0 and 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1010";
        String target = "0110";
        boolean expected = true;
        var result = solution.makeStringsEqual(s, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "11";
        String target = "00";
        boolean expected = false;
        var result = solution.makeStringsEqual(s, target);
        assertThat(result).isEqualTo(expected);
    }

}
