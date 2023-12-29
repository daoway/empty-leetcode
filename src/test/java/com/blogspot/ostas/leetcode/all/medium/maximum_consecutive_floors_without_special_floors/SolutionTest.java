package com.blogspot.ostas.leetcode.all.medium.maximum_consecutive_floors_without_special_floors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: bottom = 2, top = 9, special = [4,6]
    Output: 3
    Explanation: The following are the ranges (inclusive) of consecutive floors without a special floor:
    - (2, 3) with a total amount of 2 floors.
    - (5, 5) with a total amount of 1 floor.
    - (7, 9) with a total amount of 3 floors.
    Therefore, we return the maximum number which is 3 floors.
    Example 2:
    Input: bottom = 6, top = 8, special = [7,6,8]
    Output: 0
    Explanation: Every floor rented is a special floor, so we return 0.
      Constraints:
    1 <= special.length <= 105
    1 <= bottom <= special[i] <= top <= 109
    All the values of special are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int bottom = 2;
        int top = 9;
        int[] special = new int[]{4, 6};
        int expected = 3;
        var result = solution.maxConsecutive(bottom, top, special);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int bottom = 6;
        int top = 8;
        int[] special = new int[]{7, 6, 8};
        int expected = 0;
        var result = solution.maxConsecutive(bottom, top, special);
        assertThat(result).isEqualTo(expected);
    }

}
