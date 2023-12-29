package com.blogspot.ostas.leetcode.all.medium.maximize_win_from_two_segments;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prizePositions = [1,1,2,2,3,3,5], k = 2
    Output: 7
    Explanation: In this example, you can win all 7 prizes by selecting two segments [1, 3] and [3, 5].
    Example 2:
    Input: prizePositions = [1,2,3,4], k = 0
    Output: 2
    Explanation: For this example, one choice for the segments is [3, 3] and [4, 4], and you will be able to get 2 prizes.
      Constraints:
    1 <= prizePositions.length <= 105
    1 <= prizePositions[i] <= 109
    0 <= k <= 109
    prizePositions is sorted in non-decreasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prizePositions = new int[]{1, 1, 2, 2, 3, 3, 5};
        int k = 2;
        int expected = 7;
        var result = solution.maximizeWin(prizePositions, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prizePositions = new int[]{1, 2, 3, 4};
        int k = 0;
        int expected = 2;
        var result = solution.maximizeWin(prizePositions, k);
        assertThat(result).isEqualTo(expected);
    }

}
