package com.blogspot.ostas.leetcode.all.medium.moving_stones_until_consecutive_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stones = [7,4,9]
    Output: [1,2]
    Explanation: We can move 4 -> 8 for one move to finish the game.
    Or, we can move 9 -> 5, 4 -> 6 for two moves to finish the game.
    Example 2:
    Input: stones = [6,5,4,3,10]
    Output: [2,3]
    Explanation: We can move 3 -> 8 then 10 -> 7 to finish the game.
    Or, we can move 3 -> 7, 4 -> 8, 5 -> 9 to finish the game.
    Notice we cannot move 10 -> 2 to finish the game, because that would be an illegal move.
      Constraints:
    3 <= stones.length <= 104
    1 <= stones[i] <= 109
    All the values of stones are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stones = new int[]{7, 4, 9};
        int[] expected = new int[]{1, 2};
        var result = solution.numMovesStonesII(stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stones = new int[]{6, 5, 4, 3, 10};
        int[] expected = new int[]{2, 3};
        var result = solution.numMovesStonesII(stones);
        assertThat(result).isEqualTo(expected);
    }

}
