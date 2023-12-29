package com.blogspot.ostas.leetcode.all.easy.remove_digit_from_number_to_maximize_result;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: number = "123", digit = "3"
    Output: "12"
    Explanation: There is only one '3' in "123". After removing '3', the result is "12".
    Example 2:
    Input: number = "1231", digit = "1"
    Output: "231"
    Explanation: We can remove the first '1' to get "231" or remove the second '1' to get "123".
    Since 231 > 123, we return "231".
    Example 3:
    Input: number = "551", digit = "5"
    Output: "51"
    Explanation: We can remove either the first or second '5' from "551".
    Both result in the string "51".
      Constraints:
    2 <= number.length <= 100
    number consists of digits from '1' to '9'.
    digit is a digit from '1' to '9'.
    digit occurs at least once in number.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String number = "123";
        char digit = '3';
        String expected = "12";
        var result = solution.removeDigit(number, digit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String number = "1231";
        char digit = '1';
        String expected = "231";
        var result = solution.removeDigit(number, digit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String number = "551";
        char digit = '5';
        String expected = "51";
        var result = solution.removeDigit(number, digit);
        assertThat(result).isEqualTo(expected);
    }

}
