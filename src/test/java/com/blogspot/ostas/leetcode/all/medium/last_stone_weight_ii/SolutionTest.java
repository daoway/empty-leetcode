package com.blogspot.ostas.leetcode.all.medium.last_stone_weight_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stones = [2,7,4,1,8,1]
    Output: 1
    Explanation:
    We can combine 2 and 4 to get 2, so the array converts to [2,7,1,8,1] then,
    we can combine 7 and 8 to get 1, so the array converts to [2,1,1,1] then,
    we can combine 2 and 1 to get 1, so the array converts to [1,1,1] then,
    we can combine 1 and 1 to get 0, so the array converts to [1], then that's the optimal value.
    Example 2:
    Input: stones = [31,26,33,21,40]
    Output: 5
      Constraints:
    1 <= stones.length <= 30
    1 <= stones[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int expected = 1;
        var result = solution.lastStoneWeightII(stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stones = new int[]{31, 26, 33, 21, 40};
        int expected = 5;
        var result = solution.lastStoneWeightII(stones);
        assertThat(result).isEqualTo(expected);
    }

}
