package com.blogspot.ostas.leetcode.all.medium.stone_game_vii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stones = [5,3,1,4,2]
    Output: 6
    Explanation:
    - Alice removes 2 and gets 5 + 3 + 1 + 4 = 13 points. Alice = 13, Bob = 0, stones = [5,3,1,4].
    - Bob removes 5 and gets 3 + 1 + 4 = 8 points. Alice = 13, Bob = 8, stones = [3,1,4].
    - Alice removes 3 and gets 1 + 4 = 5 points. Alice = 18, Bob = 8, stones = [1,4].
    - Bob removes 1 and gets 4 points. Alice = 18, Bob = 12, stones = [4].
    - Alice removes 4 and gets 0 points. Alice = 18, Bob = 12, stones = [].
    The score difference is 18 - 12 = 6.
    Example 2:
    Input: stones = [7,90,5,1,100,10,10,2]
    Output: 122
      Constraints:
    n == stones.length
    2 <= n <= 1000
    1 <= stones[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stones = new int[]{5, 3, 1, 4, 2};
        int expected = 6;
        var result = solution.stoneGameVII(stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stones = new int[]{7, 90, 5, 1, 100, 10, 10, 2};
        int expected = 122;
        var result = solution.stoneGameVII(stones);
        assertThat(result).isEqualTo(expected);
    }

}
