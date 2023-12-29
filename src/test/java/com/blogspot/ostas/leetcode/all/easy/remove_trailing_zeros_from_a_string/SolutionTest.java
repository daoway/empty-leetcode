package com.blogspot.ostas.leetcode.all.easy.remove_trailing_zeros_from_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "51230100"
    Output: "512301"
    Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
    Example 2:
    Input: num = "123"
    Output: "123"
    Explanation: Integer "123" has no trailing zeros, we return integer "123".
      Constraints:
    1 <= num.length <= 1000
    num consists of only digits.
    num doesn't have any leading zeros.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "51230100";
        String expected = "512301";
        var result = solution.removeTrailingZeros(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "123";
        String expected = "123";
        var result = solution.removeTrailingZeros(num);
        assertThat(result).isEqualTo(expected);
    }

}
