package com.blogspot.ostas.leetcode.all.hard.stone_game_viii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stones = [-1,2,-3,4,-5]
    Output: 5
    Explanation:
    - Alice removes the first 4 stones, adds (-1) + 2 + (-3) + 4 = 2 to her score, and places a stone of
      value 2 on the left. stones = [2,-5].
    - Bob removes the first 2 stones, adds 2 + (-5) = -3 to his score, and places a stone of value -3 on
      the left. stones = [-3].
    The difference between their scores is 2 - (-3) = 5.
    Example 2:
    Input: stones = [7,-6,5,10,5,-2,-6]
    Output: 13
    Explanation:
    - Alice removes all stones, adds 7 + (-6) + 5 + 10 + 5 + (-2) + (-6) = 13 to her score, and places a
      stone of value 13 on the left. stones = [13].
    The difference between their scores is 13 - 0 = 13.
    Example 3:
    Input: stones = [-10,-12]
    Output: -22
    Explanation:
    - Alice can only make one move, which is to remove both stones. She adds (-10) + (-12) = -22 to her
      score and places a stone of value -22 on the left. stones = [-22].
    The difference between their scores is (-22) - 0 = -22.
      Constraints:
    n == stones.length
    2 <= n <= 105
    -104 <= stones[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stones = new int[]{-1, 2, -3, 4, -5};
        int expected = 5;
        var result = solution.stoneGameVIII(stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stones = new int[]{7, -6, 5, 10, 5, -2, -6};
        int expected = 13;
        var result = solution.stoneGameVIII(stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] stones = new int[]{-10, -12};
        int expected = -22;
        var result = solution.stoneGameVIII(stones);
        assertThat(result).isEqualTo(expected);
    }

}
