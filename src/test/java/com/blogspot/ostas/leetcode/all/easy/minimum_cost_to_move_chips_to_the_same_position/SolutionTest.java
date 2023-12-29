package com.blogspot.ostas.leetcode.all.easy.minimum_cost_to_move_chips_to_the_same_position;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: position = [1,2,3]
    Output: 1
    Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
    Second step: Move the chip at position 2 to position 1 with cost = 1.
    Total cost is 1.
    Example 2:
    Input: position = [2,2,2,3,3]
    Output: 2
    Explanation: We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.
    Example 3:
    Input: position = [1,1000000000]
    Output: 1
      Constraints:
    1 <= position.length <= 100
    1 <= position[i] <= 10^9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] position = new int[]{1, 2, 3};
        int expected = 1;
        var result = solution.minCostToMoveChips(position);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] position = new int[]{2, 2, 2, 3, 3};
        int expected = 2;
        var result = solution.minCostToMoveChips(position);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] position = new int[]{1, 1000000000};
        int expected = 1;
        var result = solution.minCostToMoveChips(position);
        assertThat(result).isEqualTo(expected);
    }

}
