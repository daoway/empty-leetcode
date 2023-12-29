package com.blogspot.ostas.leetcode.all.easy.check_if_number_has_equal_digit_count_and_digit_value;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "1210"
    Output: true
    Explanation:
    num[0] = '1'. The digit 0 occurs once in num.
    num[1] = '2'. The digit 1 occurs twice in num.
    num[2] = '1'. The digit 2 occurs once in num.
    num[3] = '0'. The digit 3 occurs zero times in num.
    The condition holds true for every index in "1210", so return true.
    Example 2:
    Input: num = "030"
    Output: false
    Explanation:
    num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
    num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
    num[2] = '0'. The digit 2 occurs zero times in num.
    The indices 0 and 1 both violate the condition, so return false.
      Constraints:
    n == num.length
    1 <= n <= 10
    num consists of digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "1210";
        boolean expected = true;
        var result = solution.digitCount(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "030";
        boolean expected = false;
        var result = solution.digitCount(num);
        assertThat(result).isEqualTo(expected);
    }

}
