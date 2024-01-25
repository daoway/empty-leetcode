package com.blogspot.ostas.leetcode.all.easy.largest_positive_integer_that_exists_with_its_negative;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [-1,2,-3,3]
    Output: 3
    Explanation: 3 is the only valid k we can find in the array.
    Example 2:
    Input: nums = [-1,10,6,7,-7,1]
    Output: 7
    Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
    Example 3:
    Input: nums = [-10,8,6,7,-2,-3]
    Output: -1
    Explanation: There is no a single valid k, we return -1.
      Constraints:
    1 <= nums.length <= 1000
    -1000 <= nums[i] <= 1000
    nums[i] != 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 2, -3, 3};
        int expected = 3;
        var result = solution.findMaxK(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 10, 6, 7, -7, 1};
        int expected = 7;
        var result = solution.findMaxK(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{-10, 8, 6, 7, -2, -3};
        int expected = -1;
        var result = solution.findMaxK(nums);
        assertThat(result).isEqualTo(expected);
    }

}
