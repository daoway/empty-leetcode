package com.blogspot.ostas.leetcode.all.hard.frog_jump;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stones = [0,1,3,5,6,8,12,17]
    Output: true
    Explanation: The frog can jump to the last stone by jumping 1 unit to the 2nd stone, then 2 units to the 3rd stone, then 2 units to the 4th stone, then 3 units to the 6th stone, 4 units to the 7th stone, and 5 units to the 8th stone.
    Example 2:
    Input: stones = [0,1,2,3,4,8,9,11]
    Output: false
    Explanation: There is no way to jump to the last stone as the gap between the 5th and 6th stone is too large.
      Constraints:
    2 <= stones.length <= 2000
    0 <= stones[i] <= 231 - 1
    stones[0] == 0
    stones is sorted in a strictly increasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stones = new int[]{0, 1, 3, 5, 6, 8, 12, 17};
        boolean expected = true;
        var result = solution.canCross(stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stones = new int[]{0, 1, 2, 3, 4, 8, 9, 11};
        boolean expected = false;
        var result = solution.canCross(stones);
        assertThat(result).isEqualTo(expected);
    }

}
