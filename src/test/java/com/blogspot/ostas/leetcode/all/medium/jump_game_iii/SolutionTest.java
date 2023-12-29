package com.blogspot.ostas.leetcode.all.medium.jump_game_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [4,2,3,0,3,1,2], start = 5
    Output: true
    Explanation:
    All possible ways to reach at index 3 with value 0 are:
    index 5 -> index 4 -> index 1 -> index 3
    index 5 -> index 6 -> index 4 -> index 1 -> index 3
    Example 2:
    Input: arr = [4,2,3,0,3,1,2], start = 0
    Output: true
    Explanation:
    One possible way to reach at index 3 with value 0 is:
    index 0 -> index 4 -> index 1 -> index 3
    Example 3:
    Input: arr = [3,0,2,1,2], start = 2
    Output: false
    Explanation: There is no way to reach at index 1 with value 0.
      Constraints:
    1 <= arr.length <= 5 * 104
    0 <= arr[i] < arr.length
    0 <= start < arr.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{4, 2, 3, 0, 3, 1, 2};
        int start = 5;
        boolean expected = true;
        var result = solution.canReach(arr, start);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{4, 2, 3, 0, 3, 1, 2};
        int start = 0;
        boolean expected = true;
        var result = solution.canReach(arr, start);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{3, 0, 2, 1, 2};
        int start = 2;
        boolean expected = false;
        var result = solution.canReach(arr, start);
        assertThat(result).isEqualTo(expected);
    }

}
