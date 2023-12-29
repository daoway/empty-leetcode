package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_operations_to_make_array_continuous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,2,5,3]
    Output: 0
    Explanation: nums is already continuous.
    Example 2:
    Input: nums = [1,2,3,5,6]
    Output: 1
    Explanation: One possible solution is to change the last element to 4.
    The resulting array is [1,2,3,5,4], which is continuous.
    Example 3:
    Input: nums = [1,10,100,1000]
    Output: 3
    Explanation: One possible solution is to:
    - Change the second element to 2.
    - Change the third element to 3.
    - Change the fourth element to 4.
    The resulting array is [1,2,3,4], which is continuous.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 5, 3};
        int expected = 0;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 5, 6};
        int expected = 1;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 10, 100, 1000};
        int expected = 3;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
