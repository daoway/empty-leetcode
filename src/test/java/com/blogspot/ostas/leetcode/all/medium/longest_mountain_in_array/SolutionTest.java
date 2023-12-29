package com.blogspot.ostas.leetcode.all.medium.longest_mountain_in_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [2,1,4,7,3,2,5]
    Output: 5
    Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
    Example 2:
    Input: arr = [2,2,2]
    Output: 0
    Explanation: There is no mountain.
      Constraints:
    1 <= arr.length <= 104
    0 <= arr[i] <= 104
      Follow up:
    Can you solve it using only one pass?
    Can you solve it in O(1) space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{2, 1, 4, 7, 3, 2, 5};
        int expected = 5;
        var result = solution.longestMountain(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{2, 2, 2};
        int expected = 0;
        var result = solution.longestMountain(arr);
        assertThat(result).isEqualTo(expected);
    }

}
