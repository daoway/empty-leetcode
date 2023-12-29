package com.blogspot.ostas.leetcode.all.hard.form_largest_integer_with_digits_that_add_up_to_target;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cost = [4,3,2,5,6,7,2,5,5], target = 9
    Output: "7772"
    Explanation: The cost to paint the digit '7' is 2, and the digit '2' is 3. Then cost("7772") = 2*3+ 3*1 = 9. You could also paint "977", but "7772" is the largest number.
    Digit    cost
      1  ->   4
      2  ->   3
      3  ->   2
      4  ->   5
      5  ->   6
      6  ->   7
      7  ->   2
      8  ->   5
      9  ->   5
    Example 2:
    Input: cost = [7,6,5,5,5,6,8,7,8], target = 12
    Output: "85"
    Explanation: The cost to paint the digit '8' is 7, and the digit '5' is 5. Then cost("85") = 7 + 5 = 12.
    Example 3:
    Input: cost = [2,4,6,2,4,6,4,4,4], target = 5
    Output: "0"
    Explanation: It is impossible to paint any integer with total cost equal to target.
      Constraints:
    cost.length == 9
    1 <= cost[i], target <= 5000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] cost = new int[]{4, 3, 2, 5, 6, 7, 2, 5, 5};
        int target = 9;
        String expected = "7772";
        var result = solution.largestNumber(cost, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] cost = new int[]{7, 6, 5, 5, 5, 6, 8, 7, 8};
        int target = 12;
        String expected = "85";
        var result = solution.largestNumber(cost, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] cost = new int[]{2, 4, 6, 2, 4, 6, 4, 4, 4};
        int target = 5;
        String expected = "0";
        var result = solution.largestNumber(cost, target);
        assertThat(result).isEqualTo(expected);
    }

}
