package com.blogspot.ostas.leetcode.all.medium.maximum_product_of_the_length_of_two_palindromic_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leetcodecom"
    Output: 9
    Explanation: An optimal solution is to choose "ete" for the 1st subsequence and "cdc" for the 2nd subsequence.
    The product of their lengths is: 3 * 3 = 9.
    Example 2:
    Input: s = "bb"
    Output: 1
    Explanation: An optimal solution is to choose "b" (the first character) for the 1st subsequence and "b" (the second character) for the 2nd subsequence.
    The product of their lengths is: 1 * 1 = 1.
    Example 3:
    Input: s = "accbcaxxcxx"
    Output: 25
    Explanation: An optimal solution is to choose "accca" for the 1st subsequence and "xxcxx" for the 2nd subsequence.
    The product of their lengths is: 5 * 5 = 25.
      Constraints:
    2 <= s.length <= 12
    s consists of lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leetcodecom";
        int expected = 9;
        var result = solution.maxProduct(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "bb";
        int expected = 1;
        var result = solution.maxProduct(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "accbcaxxcxx";
        int expected = 25;
        var result = solution.maxProduct(s);
        assertThat(result).isEqualTo(expected);
    }

}
