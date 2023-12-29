package com.blogspot.ostas.leetcode.all.hard.shortest_impossible_sequence_of_rolls;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rolls = [4,2,1,2,3,3,2,4,1], k = 4
    Output: 3
    Explanation: Every sequence of rolls of length 1, [1], [2], [3], [4], can be taken from rolls.
    Every sequence of rolls of length 2, [1, 1], [1, 2], ..., [4, 4], can be taken from rolls.
    The sequence [1, 4, 2] cannot be taken from rolls, so we return 3.
    Note that there are other sequences that cannot be taken from rolls.
    Example 2:
    Input: rolls = [1,1,2,2], k = 2
    Output: 2
    Explanation: Every sequence of rolls of length 1, [1], [2], can be taken from rolls.
    The sequence [2, 1] cannot be taken from rolls, so we return 2.
    Note that there are other sequences that cannot be taken from rolls but [2, 1] is the shortest.
    Example 3:
    Input: rolls = [1,1,3,2,2,2,3,3], k = 4
    Output: 1
    Explanation: The sequence [4] cannot be taken from rolls, so we return 1.
    Note that there are other sequences that cannot be taken from rolls but [4] is the shortest.
      Constraints:
    n == rolls.length
    1 <= n <= 105
    1 <= rolls[i] <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] rolls = new int[]{4, 2, 1, 2, 3, 3, 2, 4, 1};
        int k = 4;
        int expected = 3;
        var result = solution.shortestSequence(rolls, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] rolls = new int[]{1, 1, 2, 2};
        int k = 2;
        int expected = 2;
        var result = solution.shortestSequence(rolls, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] rolls = new int[]{1, 1, 3, 2, 2, 2, 3, 3};
        int k = 4;
        int expected = 1;
        var result = solution.shortestSequence(rolls, k);
        assertThat(result).isEqualTo(expected);
    }

}
