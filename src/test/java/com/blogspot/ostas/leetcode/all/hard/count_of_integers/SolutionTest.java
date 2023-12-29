package com.blogspot.ostas.leetcode.all.hard.count_of_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num1 = "1", num2 = "12", min_sum = 1, max_sum = 8
    Output: 11
    Explanation: There are 11 integers whose sum of digits lies between 1 and 8 are 1,2,3,4,5,6,7,8,10,11, and 12. Thus, we return 11.
    Example 2:
    Input: num1 = "1", num2 = "5", min_sum = 1, max_sum = 5
    Output: 5
    Explanation: The 5 integers whose sum of digits lies between 1 and 5 are 1,2,3,4, and 5. Thus, we return 5.
      Constraints:
    1 <= num1 <= num2 <= 1022
    1 <= min_sum <= max_sum <= 400
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num1 = "1";
        String num2 = "12";
        int min_sum = 1;
        int max_sum = 8;
        int expected = 11;
        var result = solution.count(num1, num2, min_sum, max_sum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num1 = "1";
        String num2 = "5";
        int min_sum = 1;
        int max_sum = 5;
        int expected = 5;
        var result = solution.count(num1, num2, min_sum, max_sum);
        assertThat(result).isEqualTo(expected);
    }

}
