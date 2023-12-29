package com.blogspot.ostas.leetcode.all.medium.sum_of_numbers_with_units_digit_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 58, k = 9
    Output: 2
    Explanation:
    One valid set is [9,49], as the sum is 58 and each integer has a units digit of 9.
    Another valid set is [19,39].
    It can be shown that 2 is the minimum possible size of a valid set.
    Example 2:
    Input: num = 37, k = 2
    Output: -1
    Explanation: It is not possible to obtain a sum of 37 using only integers that have a units digit of 2.
    Example 3:
    Input: num = 0, k = 7
    Output: 0
    Explanation: The sum of an empty set is considered 0.
      Constraints:
    0 <= num <= 3000
    0 <= k <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 58;
        int k = 9;
        int expected = 2;
        var result = solution.minimumNumbers(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 37;
        int k = 2;
        int expected = -1;
        var result = solution.minimumNumbers(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int num = 0;
        int k = 7;
        int expected = 0;
        var result = solution.minimumNumbers(num, k);
        assertThat(result).isEqualTo(expected);
    }

}
