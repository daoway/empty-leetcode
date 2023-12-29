package com.blogspot.ostas.leetcode.all.medium.add_minimum_number_of_rungs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rungs = [1,3,5,10], dist = 2
    Output: 2
    Explanation:
    You currently cannot reach the last rung.
    Add rungs at heights 7 and 8 to climb this ladder.
    The ladder will now have rungs at [1,3,5,7,8,10].
    Example 2:
    Input: rungs = [3,6,8,10], dist = 3
    Output: 0
    Explanation:
    This ladder can be climbed without adding additional rungs.
    Example 3:
    Input: rungs = [3,4,6,7], dist = 2
    Output: 1
    Explanation:
    You currently cannot reach the first rung from the ground.
    Add a rung at height 1 to climb this ladder.
    The ladder will now have rungs at [1,3,4,6,7].
      Constraints:
    1 <= rungs.length <= 105
    1 <= rungs[i] <= 109
    1 <= dist <= 109
    rungs is strictly increasing.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] rungs = new int[]{1, 3, 5, 10};
        int dist = 2;
        int expected = 2;
        var result = solution.addRungs(rungs, dist);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] rungs = new int[]{3, 6, 8, 10};
        int dist = 3;
        int expected = 0;
        var result = solution.addRungs(rungs, dist);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] rungs = new int[]{3, 4, 6, 7};
        int dist = 2;
        int expected = 1;
        var result = solution.addRungs(rungs, dist);
        assertThat(result).isEqualTo(expected);
    }

}
