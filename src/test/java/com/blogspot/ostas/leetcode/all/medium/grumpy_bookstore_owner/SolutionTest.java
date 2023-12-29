package com.blogspot.ostas.leetcode.all.medium.grumpy_bookstore_owner;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
    Output: 16
    Explanation: The bookstore owner keeps themselves not grumpy for the last 3 minutes.
    The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
    Example 2:
    Input: customers = [1], grumpy = [0], minutes = 1
    Output: 1
      Constraints:
    n == customers.length == grumpy.length
    1 <= minutes <= n <= 2 * 104
    0 <= customers[i] <= 1000
    grumpy[i] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] customers = new int[]{1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = new int[]{0, 1, 0, 1, 0, 1, 0, 1};
        int minutes = 3;
        int expected = 16;
        var result = solution.maxSatisfied(customers, grumpy, minutes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] customers = new int[]{1};
        int[] grumpy = new int[]{0};
        int minutes = 1;
        int expected = 1;
        var result = solution.maxSatisfied(customers, grumpy, minutes);
        assertThat(result).isEqualTo(expected);
    }

}
