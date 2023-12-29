package com.blogspot.ostas.leetcode.all.hard.count_stepping_numbers_in_range;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: low = "1", high = "11"
    Output: 10
    Explanation: The stepping numbers in the range [1,11] are 1, 2, 3, 4, 5, 6, 7, 8, 9 and 10. There are a total of 10 stepping numbers in the range. Hence, the output is 10.
    Example 2:
    Input: low = "90", high = "101"
    Output: 2
    Explanation: The stepping numbers in the range [90,101] are 98 and 101. There are a total of 2 stepping numbers in the range. Hence, the output is 2.
      Constraints:
    1 <= int(low) <= int(high) < 10100
    1 <= low.length, high.length <= 100
    low and high consist of only digits.
    low and high don't have any leading zeros.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String low = "1";
        String high = "11";
        int expected = 10;
        var result = solution.countSteppingNumbers(low, high);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String low = "90";
        String high = "101";
        int expected = 2;
        var result = solution.countSteppingNumbers(low, high);
        assertThat(result).isEqualTo(expected);
    }

}
