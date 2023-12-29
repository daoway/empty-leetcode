package com.blogspot.ostas.leetcode.all.medium.furthest_building_you_can_reach;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
    Output: 4
    Explanation: Starting at building 0, you can follow these steps:
    - Go to building 1 without using ladders nor bricks since 4 >= 2.
    - Go to building 2 using 5 bricks. You must use either bricks or ladders because 2 < 7.
    - Go to building 3 without using ladders nor bricks since 7 >= 6.
    - Go to building 4 using your only ladder. You must use either bricks or ladders because 6 < 9.
    It is impossible to go beyond building 4 because you do not have any more bricks or ladders.
    Example 2:
    Input: heights = [4,12,2,7,3,18,20,3,19], bricks = 10, ladders = 2
    Output: 7
    Example 3:
    Input: heights = [14,3,19,3], bricks = 17, ladders = 0
    Output: 3
      Constraints:
    1 <= heights.length <= 105
    1 <= heights[i] <= 106
    0 <= bricks <= 109
    0 <= ladders <= heights.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] heights = new int[]{4, 2, 7, 6, 9, 14, 12};
        int bricks = 5;
        int ladders = 1;
        int expected = 4;
        var result = solution.furthestBuilding(heights, bricks, ladders);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] heights = new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19};
        int bricks = 10;
        int ladders = 2;
        int expected = 7;
        var result = solution.furthestBuilding(heights, bricks, ladders);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] heights = new int[]{14, 3, 19, 3};
        int bricks = 17;
        int ladders = 0;
        int expected = 3;
        var result = solution.furthestBuilding(heights, bricks, ladders);
        assertThat(result).isEqualTo(expected);
    }

}
