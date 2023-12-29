package com.blogspot.ostas.leetcode.all.medium.make_sum_divisible_by_p;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,1,4,2], p = 6
    Output: 1
    Explanation: The sum of the elements in nums is 10, which is not divisible by 6. We can remove the subarray [4], and the sum of the remaining elements is 6, which is divisible by 6.
    Example 2:
    Input: nums = [6,3,5,2], p = 9
    Output: 2
    Explanation: We cannot remove a single element to get a sum divisible by 9. The best way is to remove the subarray [5,2], leaving us with [6,3] with sum 9.
    Example 3:
    Input: nums = [1,2,3], p = 3
    Output: 0
    Explanation: Here the sum is 6. which is already divisible by 3. Thus we do not need to remove anything.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= p <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 4, 2};
        int p = 6;
        int expected = 1;
        var result = solution.minSubarray(nums, p);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{6, 3, 5, 2};
        int p = 9;
        int expected = 2;
        var result = solution.minSubarray(nums, p);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int p = 3;
        int expected = 0;
        var result = solution.minSubarray(nums, p);
        assertThat(result).isEqualTo(expected);
    }

}
