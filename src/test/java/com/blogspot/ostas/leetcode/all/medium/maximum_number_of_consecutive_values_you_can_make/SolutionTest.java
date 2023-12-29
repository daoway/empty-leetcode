package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_consecutive_values_you_can_make;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: coins = [1,3]
    Output: 2
    Explanation: You can make the following values:
    - 0: take []
    - 1: take [1]
    You can make 2 consecutive integer values starting from 0.
    Example 2:
    Input: coins = [1,1,1,4]
    Output: 8
    Explanation: You can make the following values:
    - 0: take []
    - 1: take [1]
    - 2: take [1,1]
    - 3: take [1,1,1]
    - 4: take [4]
    - 5: take [4,1]
    - 6: take [4,1,1]
    - 7: take [4,1,1,1]
    You can make 8 consecutive integer values starting from 0.
    Example 3:
    Input: nums = [1,4,10,3,1]
    Output: 20
      Constraints:
    coins.length == n
    1 <= n <= 4 * 104
    1 <= coins[i] <= 4 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] coins = new int[]{1, 3};
        int expected = 2;
        var result = solution.getMaximumConsecutive(coins);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] coins = new int[]{1, 1, 1, 4};
        int expected = 8;
        var result = solution.getMaximumConsecutive(coins);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] coins = new int[]{}; //params name mismatch
        int expected = 20;
        var result = solution.getMaximumConsecutive(coins);
        assertThat(result).isEqualTo(expected);
    }

}
