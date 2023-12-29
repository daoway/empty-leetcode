package com.blogspot.ostas.leetcode.all.easy.largest_three_same_digit_number_in_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "6777133339"
    Output: "777"
    Explanation: There are two distinct good integers: "777" and "333".
    "777" is the largest, so we return "777".
    Example 2:
    Input: num = "2300019"
    Output: "000"
    Explanation: "000" is the only good integer.
    Example 3:
    Input: num = "42352338"
    Output: ""
    Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
      Constraints:
    3 <= num.length <= 1000
    num only consists of digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "6777133339";
        String expected = "777";
        var result = solution.largestGoodInteger(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "2300019";
        String expected = "000";
        var result = solution.largestGoodInteger(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "42352338";
        String expected = "";
        var result = solution.largestGoodInteger(num);
        assertThat(result).isEqualTo(expected);
    }

}
