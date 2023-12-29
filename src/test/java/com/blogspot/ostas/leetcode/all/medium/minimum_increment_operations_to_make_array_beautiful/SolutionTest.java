package com.blogspot.ostas.leetcode.all.medium.minimum_increment_operations_to_make_array_beautiful;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,0,0,2], k = 4
    Output: 3
    Explanation: We can perform the following increment operations to make nums beautiful:
    Choose index i = 1 and increase nums[1] by 1 -> [2,4,0,0,2].
    Choose index i = 4 and increase nums[4] by 1 -> [2,4,0,0,3].
    Choose index i = 4 and increase nums[4] by 1 -> [2,4,0,0,4].
    The subarrays with a size of 3 or more are: [2,4,0], [4,0,0], [0,0,4], [2,4,0,0], [4,0,0,4], [2,4,0,0,4].
    In all the subarrays, the maximum element is equal to k = 4, so nums is now beautiful.
    It can be shown that nums cannot be made beautiful with fewer than 3 increment operations.
    Hence, the answer is 3.
    Example 2:
    Input: nums = [0,1,3,3], k = 5
    Output: 2
    Explanation: We can perform the following increment operations to make nums beautiful:
    Choose index i = 2 and increase nums[2] by 1 -> [0,1,4,3].
    Choose index i = 2 and increase nums[2] by 1 -> [0,1,5,3].
    The subarrays with a size of 3 or more are: [0,1,5], [1,5,3], [0,1,5,3].
    In all the subarrays, the maximum element is equal to k = 5, so nums is now beautiful.
    It can be shown that nums cannot be made beautiful with fewer than 2 increment operations.
    Hence, the answer is 2.
    Example 3:
    Input: nums = [1,1,2], k = 1
    Output: 0
    Explanation: The only subarray with a size of 3 or more in this example is [1,1,2].
    The maximum element, 2, is already greater than k = 1, so we don't need any increment operation.
    Hence, the answer is 0.
      Constraints:
    3 <= n == nums.length <= 105
    0 <= nums[i] <= 109
    0 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 0, 0, 2};
        int k = 4;
        long expected = 3;
        var result = solution.minIncrementOperations(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 3, 3};
        int k = 5;
        long expected = 2;
        var result = solution.minIncrementOperations(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2};
        int k = 1;
        long expected = 0;
        var result = solution.minIncrementOperations(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
