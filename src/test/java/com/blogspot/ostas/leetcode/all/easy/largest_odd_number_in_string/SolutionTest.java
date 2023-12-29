package com.blogspot.ostas.leetcode.all.easy.largest_odd_number_in_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "52"
    Output: "5"
    Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
    Example 2:
    Input: num = "4206"
    Output: ""
    Explanation: There are no odd numbers in "4206".
    Example 3:
    Input: num = "35427"
    Output: "35427"
    Explanation: "35427" is already an odd number.
      Constraints:
    1 <= num.length <= 105
    num only consists of digits and does not contain any leading zeros.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "52";
        String expected = "5";
        var result = solution.largestOddNumber(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "4206";
        String expected = "";
        var result = solution.largestOddNumber(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "35427";
        String expected = "35427";
        var result = solution.largestOddNumber(num);
        assertThat(result).isEqualTo(expected);
    }

}
