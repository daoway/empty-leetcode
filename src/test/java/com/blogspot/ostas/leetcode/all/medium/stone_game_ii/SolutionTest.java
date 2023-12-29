package com.blogspot.ostas.leetcode.all.medium.stone_game_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: piles = [2,7,9,4,4]
    Output: 10
    Explanation:  If Alice takes one pile at the beginning, Bob takes two piles, then Alice takes 2 piles again. Alice can get 2 + 4 + 4 = 10 piles in total. If Alice takes two piles at the beginning, then Bob can take all three piles left. In this case, Alice get 2 + 7 = 9 piles in total. So we return 10 since it's larger.
    Example 2:
    Input: piles = [1,2,3,4,5,100]
    Output: 104
      Constraints:
    1 <= piles.length <= 100
    1 <= piles[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] piles = new int[]{2, 7, 9, 4, 4};
        int expected = 10;
        var result = solution.stoneGameII(piles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] piles = new int[]{1, 2, 3, 4, 5, 100};
        int expected = 104;
        var result = solution.stoneGameII(piles);
        assertThat(result).isEqualTo(expected);
    }

}
