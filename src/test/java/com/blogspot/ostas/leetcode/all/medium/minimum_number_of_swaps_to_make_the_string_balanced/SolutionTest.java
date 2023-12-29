package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_swaps_to_make_the_string_balanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "][]["
    Output: 1
    Explanation: You can make the string balanced by swapping index 0 with index 3.
    The resulting string is "[[]]".
    Example 2:
    Input: s = "]]][[["
    Output: 2
    Explanation: You can do the following to make the string balanced:
    - Swap index 0 with index 4. s = "[]][][".
    - Swap index 1 with index 5. s = "[[][]]".
    The resulting string is "[[][]]".
    Example 3:
    Input: s = "[]"
    Output: 0
    Explanation: The string is already balanced.
      Constraints:
    n == s.length
    2 <= n <= 106
    n is even.
    s[i] is either '[' or ']'.
    The number of opening brackets '[' equals n / 2, and the number of closing brackets ']' equals n / 2.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "][][";
        int expected = 1;
        var result = solution.minSwaps(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "]]][[[";
        int expected = 2;
        var result = solution.minSwaps(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "[]";
        int expected = 0;
        var result = solution.minSwaps(s);
        assertThat(result).isEqualTo(expected);
    }

}
