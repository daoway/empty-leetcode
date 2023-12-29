package com.blogspot.ostas.leetcode.all.easy.finding_three_digit_even_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: digits = [2,1,3,0]
    Output: [102,120,130,132,210,230,302,310,312,320]
    Explanation: All the possible integers that follow the requirements are in the output array.
    Notice that there are no odd integers or integers with leading zeros.
    Example 2:
    Input: digits = [2,2,8,8,2]
    Output: [222,228,282,288,822,828,882]
    Explanation: The same digit can be used as many times as it appears in digits.
    In this example, the digit 8 is used twice each time in 288, 828, and 882.
    Example 3:
    Input: digits = [3,7,5]
    Output: []
    Explanation: No even integers can be formed using the given digits.
      Constraints:
    3 <= digits.length <= 100
    0 <= digits[i] <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] digits = new int[]{2, 1, 3, 0};
        int[] expected = new int[]{102, 120, 130, 132, 210, 230, 302, 310, 312, 320};
        var result = solution.findEvenNumbers(digits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] digits = new int[]{2, 2, 8, 8, 2};
        int[] expected = new int[]{222, 228, 282, 288, 822, 828, 882};
        var result = solution.findEvenNumbers(digits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] digits = new int[]{3, 7, 5};
        int[] expected = new int[]{};
        var result = solution.findEvenNumbers(digits);
        assertThat(result).isEqualTo(expected);
    }

}
