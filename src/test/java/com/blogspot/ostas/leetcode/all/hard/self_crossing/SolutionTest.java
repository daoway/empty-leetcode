package com.blogspot.ostas.leetcode.all.hard.self_crossing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: distance = [2,1,1,2]
    Output: true
    Explanation: The path crosses itself at the point (0, 1).
    Example 2:
    Input: distance = [1,2,3,4]
    Output: false
    Explanation: The path does not cross itself at any point.
    Example 3:
    Input: distance = [1,1,1,2,1]
    Output: true
    Explanation: The path crosses itself at the point (0, 0).
      Constraints:
    1 <= distance.length <= 105
    1 <= distance[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] distance = new int[]{2, 1, 1, 2};
        boolean expected = true;
        var result = solution.isSelfCrossing(distance);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] distance = new int[]{1, 2, 3, 4};
        boolean expected = false;
        var result = solution.isSelfCrossing(distance);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] distance = new int[]{1, 1, 1, 2, 1};
        boolean expected = true;
        var result = solution.isSelfCrossing(distance);
        assertThat(result).isEqualTo(expected);
    }

}
