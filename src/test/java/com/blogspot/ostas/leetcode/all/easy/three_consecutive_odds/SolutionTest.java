package com.blogspot.ostas.leetcode.all.easy.three_consecutive_odds;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [2,6,4,1]
    Output: false
    Explanation: There are no three consecutive odds.
    Example 2:
    Input: arr = [1,2,34,3,4,5,7,23,12]
    Output: true
    Explanation: [5,7,23] are three consecutive odds.
      Constraints:
    1 <= arr.length <= 1000
    1 <= arr[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{2, 6, 4, 1};
        boolean expected = false;
        var result = solution.threeConsecutiveOdds(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
        boolean expected = true;
        var result = solution.threeConsecutiveOdds(arr);
        assertThat(result).isEqualTo(expected);
    }

}
