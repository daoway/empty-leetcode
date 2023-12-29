package com.blogspot.ostas.leetcode.all.hard.make_array_empty;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,4,-1]
    Output: 5
    Operation Array
    1 [4, -1, 3]
    2 [-1, 3, 4]
    3 [3, 4]
    4 [4]
    5 []
    Example 2:
    Input: nums = [1,2,4,3]
    Output: 5
    Operation Array
    1 [2, 4, 3]
    2 [4, 3]
    3 [3, 4]
    4 [4]
    5 []
    Example 3:
    Input: nums = [1,2,3]
    Output: 3
    Operation Array
    1 [2, 3]
    2 [3]
    3 []
      Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    All values in nums are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 4, -1};
        long expected = 5;
        var result = solution.countOperationsToEmptyArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 4, 3};
        long expected = 5;
        var result = solution.countOperationsToEmptyArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        long expected = 3;
        var result = solution.countOperationsToEmptyArray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
