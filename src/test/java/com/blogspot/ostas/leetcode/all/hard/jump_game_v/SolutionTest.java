package com.blogspot.ostas.leetcode.all.hard.jump_game_v;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [6,4,14,6,8,13,9,7,10,6,12], d = 2
    Output: 4
    Explanation: You can start at index 10. You can jump 10 --> 8 --> 6 --> 7 as shown.
    Note that if you start at index 6 you can only jump to index 7. You cannot jump to index 5 because 13 > 9. You cannot jump to index 4 because index 5 is between index 4 and 6 and 13 > 9.
    Similarly You cannot jump from index 3 to index 2 or index 1.
    Example 2:
    Input: arr = [3,3,3,3,3], d = 3
    Output: 1
    Explanation: You can start at any index. You always cannot jump to any index.
    Example 3:
    Input: arr = [7,6,5,4,3,2,1], d = 1
    Output: 7
    Explanation: Start at index 0. You can visit all the indicies.
      Constraints:
    1 <= arr.length <= 1000
    1 <= arr[i] <= 105
    1 <= d <= arr.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{6, 4, 14, 6, 8, 13, 9, 7, 10, 6, 12};
        int d = 2;
        int expected = 4;
        var result = solution.maxJumps(arr, d);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{3, 3, 3, 3, 3};
        int d = 3;
        int expected = 1;
        var result = solution.maxJumps(arr, d);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{7, 6, 5, 4, 3, 2, 1};
        int d = 1;
        int expected = 7;
        var result = solution.maxJumps(arr, d);
        assertThat(result).isEqualTo(expected);
    }

}
