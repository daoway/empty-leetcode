package com.blogspot.ostas.leetcode.all.medium.minimum_jumps_to_reach_home;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: forbidden = [14,4,18,1,15], a = 3, b = 15, x = 9
    Output: 3
    Explanation: 3 jumps forward (0 -> 3 -> 6 -> 9) will get the bug home.
    Example 2:
    Input: forbidden = [8,3,16,6,12,20], a = 15, b = 13, x = 11
    Output: -1
    Example 3:
    Input: forbidden = [1,6,2,14,5,17,4], a = 16, b = 9, x = 7
    Output: 2
    Explanation: One jump forward (0 -> 16) then one jump backward (16 -> 7) will get the bug home.
      Constraints:
    1 <= forbidden.length <= 1000
    1 <= a, b, forbidden[i] <= 2000
    0 <= x <= 2000
    All the elements in forbidden are distinct.
    Position x is not forbidden.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] forbidden = new int[]{14, 4, 18, 1, 15};
        int a = 3;
        int b = 15;
        int x = 9;
        int expected = 3;
        var result = solution.minimumJumps(forbidden, a, b, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] forbidden = new int[]{8, 3, 16, 6, 12, 20};
        int a = 15;
        int b = 13;
        int x = 11;
        int expected = -1;
        var result = solution.minimumJumps(forbidden, a, b, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] forbidden = new int[]{1, 6, 2, 14, 5, 17, 4};
        int a = 16;
        int b = 9;
        int x = 7;
        int expected = 2;
        var result = solution.minimumJumps(forbidden, a, b, x);
        assertThat(result).isEqualTo(expected);
    }

}
