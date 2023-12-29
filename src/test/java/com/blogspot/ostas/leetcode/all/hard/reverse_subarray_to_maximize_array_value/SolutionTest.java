package com.blogspot.ostas.leetcode.all.hard.reverse_subarray_to_maximize_array_value;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,1,5,4]
    Output: 10
    Explanation: By reversing the subarray [3,1,5] the array becomes [2,5,1,3,4] whose value is 10.
    Example 2:
    Input: nums = [2,4,9,24,2,1,10]
    Output: 68
      Constraints:
    1 <= nums.length <= 3 * 104
    -105 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 5, 4};
        int expected = 10;
        var result = solution.maxValueAfterReverse(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 9, 24, 2, 1, 10};
        int expected = 68;
        var result = solution.maxValueAfterReverse(nums);
        assertThat(result).isEqualTo(expected);
    }

}
