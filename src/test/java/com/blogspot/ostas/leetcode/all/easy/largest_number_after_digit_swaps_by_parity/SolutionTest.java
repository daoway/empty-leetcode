package com.blogspot.ostas.leetcode.all.easy.largest_number_after_digit_swaps_by_parity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 1234
    Output: 3412
    Explanation: Swap the digit 3 with the digit 1, this results in the number 3214.
    Swap the digit 2 with the digit 4, this results in the number 3412.
    Note that there may be other sequences of swaps but it can be shown that 3412 is the largest possible number.
    Also note that we may not swap the digit 4 with the digit 1 since they are of different parities.
    Example 2:
    Input: num = 65875
    Output: 87655
    Explanation: Swap the digit 8 with the digit 6, this results in the number 85675.
    Swap the first digit 5 with the digit 7, this results in the number 87655.
    Note that there may be other sequences of swaps but it can be shown that 87655 is the largest possible number.
      Constraints:
    1 <= num <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 1234;
        int expected = 3412;
        var result = solution.largestInteger(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 65875;
        int expected = 87655;
        var result = solution.largestInteger(num);
        assertThat(result).isEqualTo(expected);
    }

}
