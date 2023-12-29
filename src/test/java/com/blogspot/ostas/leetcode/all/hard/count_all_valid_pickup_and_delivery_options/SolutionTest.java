package com.blogspot.ostas.leetcode.all.hard.count_all_valid_pickup_and_delivery_options;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 1
    Explanation: Unique order (P1, D1), Delivery 1 always is after of Pickup 1.
    Example 2:
    Input: n = 2
    Output: 6
    Explanation: All possible orders:
    (P1,P2,D1,D2), (P1,P2,D2,D1), (P1,D1,P2,D2), (P2,P1,D1,D2), (P2,P1,D2,D1) and (P2,D2,P1,D1).
    This is an invalid order (P1,D2,P2,D1) because Pickup 2 is after of Delivery 2.
    Example 3:
    Input: n = 3
    Output: 90
      Constraints:
    1 <= n <= 500
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.countOrders(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int expected = 6;
        var result = solution.countOrders(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int expected = 90;
        var result = solution.countOrders(n);
        assertThat(result).isEqualTo(expected);
    }

}
