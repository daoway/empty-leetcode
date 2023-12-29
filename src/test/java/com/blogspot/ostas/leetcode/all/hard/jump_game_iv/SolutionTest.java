package com.blogspot.ostas.leetcode.all.hard.jump_game_iv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [100,-23,-23,404,100,23,23,23,3,404]
    Output: 3
    Explanation: You need three jumps from index 0 --> 4 --> 3 --> 9. Note that index 9 is the last index of the array.
    Example 2:
    Input: arr = [7]
    Output: 0
    Explanation: Start index is the last index. You do not need to jump.
    Example 3:
    Input: arr = [7,6,9,6,9,6,9,7]
    Output: 1
    Explanation: You can jump directly from index 0 to index 7 which is last index of the array.
      Constraints:
    1 <= arr.length <= 5 * 104
    -108 <= arr[i] <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        int expected = 3;
        var result = solution.minJumps(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{7};
        int expected = 0;
        var result = solution.minJumps(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{7, 6, 9, 6, 9, 6, 9, 7};
        int expected = 1;
        var result = solution.minJumps(arr);
        assertThat(result).isEqualTo(expected);
    }

}
