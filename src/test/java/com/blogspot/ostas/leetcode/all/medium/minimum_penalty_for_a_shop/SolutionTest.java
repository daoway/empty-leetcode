package com.blogspot.ostas.leetcode.all.medium.minimum_penalty_for_a_shop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: customers = "YYNY"
    Output: 2
    Explanation:
    - Closing the shop at the 0th hour incurs in 1+1+0+1 = 3 penalty.
    - Closing the shop at the 1st hour incurs in 0+1+0+1 = 2 penalty.
    - Closing the shop at the 2nd hour incurs in 0+0+0+1 = 1 penalty.
    - Closing the shop at the 3rd hour incurs in 0+0+1+1 = 2 penalty.
    - Closing the shop at the 4th hour incurs in 0+0+1+0 = 1 penalty.
    Closing the shop at 2nd or 4th hour gives a minimum penalty. Since 2 is earlier, the optimal closing time is 2.
    Example 2:
    Input: customers = "NNNNN"
    Output: 0
    Explanation: It is best to close the shop at the 0th hour as no customers arrive.
    Example 3:
    Input: customers = "YYYY"
    Output: 4
    Explanation: It is best to close the shop at the 4th hour as customers arrive at each hour.
      Constraints:
    1 <= customers.length <= 105
    customers consists only of characters 'Y' and 'N'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String customers = "YYNY";
        int expected = 2;
        var result = solution.bestClosingTime(customers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String customers = "NNNNN";
        int expected = 0;
        var result = solution.bestClosingTime(customers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String customers = "YYYY";
        int expected = 4;
        var result = solution.bestClosingTime(customers);
        assertThat(result).isEqualTo(expected);
    }

}
