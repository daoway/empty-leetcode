package com.blogspot.ostas.leetcode.all.medium.find_the_winner_of_an_array_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [2,1,3,5,4,6,7], k = 2
    Output: 5
    Explanation: Let's see the rounds of the game:
    Round |       arr       | winner | win_count
      1   | [2,1,3,5,4,6,7] | 2      | 1
      2   | [2,3,5,4,6,7,1] | 3      | 1
      3   | [3,5,4,6,7,1,2] | 5      | 1
      4   | [5,4,6,7,1,2,3] | 5      | 2
    So we can see that 4 rounds will be played and 5 is the winner because it wins 2 consecutive games.
    Example 2:
    Input: arr = [3,2,1], k = 10
    Output: 3
    Explanation: 3 will win the first 10 rounds consecutively.
      Constraints:
    2 <= arr.length <= 105
    1 <= arr[i] <= 106
    arr contains distinct integers.
    1 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{2, 1, 3, 5, 4, 6, 7};
        int k = 2;
        int expected = 5;
        var result = solution.getWinner(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{3, 2, 1};
        int k = 10;
        int expected = 3;
        var result = solution.getWinner(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
