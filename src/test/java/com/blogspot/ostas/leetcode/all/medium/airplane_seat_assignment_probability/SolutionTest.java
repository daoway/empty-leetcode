package com.blogspot.ostas.leetcode.all.medium.airplane_seat_assignment_probability;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 1.00000
    Explanation: The first person can only get the first seat.
    Example 2:
    Input: n = 2
    Output: 0.50000
    Explanation: The second person has a probability of 0.5 to get the second seat (when first person gets the first seat).
      Constraints:
    1 <= n <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        double expected = 1.00000;
        var result = solution.nthPersonGetsNthSeat(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        double expected = 0.50000;
        var result = solution.nthPersonGetsNthSeat(n);
        assertThat(result).isEqualTo(expected);
    }

}
