package com.blogspot.ostas.leetcode.all.hard.find_in_mountain_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: array = [1,2,3,4,5,3,1], target = 3
    Output: 2
    Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
    Example 2:
    Input: array = [0,1,2,4,2,1], target = 3
    Output: -1
    Explanation: 3 does not exist in the array, so we return -1.
      Constraints:
    3 <= mountain_arr.length() <= 104
    0 <= target <= 109
    0 <= mountain_arr.get(index) <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int target = 3;
        MountainArray mountainArr = null;
        int expected = 2;
        var result = solution.findInMountainArray(target, mountainArr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int target = 3;
        MountainArray mountainArr = null;
        int expected = -1;
        var result = solution.findInMountainArray(target, mountainArr);
        assertThat(result).isEqualTo(expected);
    }

}
