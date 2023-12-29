package com.blogspot.ostas.leetcode.all.easy.longest_even_odd_subarray_with_threshold;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,2,5,4], threshold = 5
    Output: 3
    Explanation: In this example, we can select the subarray that starts at l = 1 and ends at r = 3 => [2,5,4]. This subarray satisfies the conditions.
    Hence, the answer is the length of the subarray, 3. We can show that 3 is the maximum possible achievable length.
    Example 2:
    Input: nums = [1,2], threshold = 2
    Output: 1
    Explanation: In this example, we can select the subarray that starts at l = 1 and ends at r = 1 => [2].
    It satisfies all the conditions and we can show that 1 is the maximum possible achievable length.
    Example 3:
    Input: nums = [2,3,4,5], threshold = 4
    Output: 3
    Explanation: In this example, we can select the subarray that starts at l = 0 and ends at r = 2 => [2,3,4].
    It satisfies all the conditions.
    Hence, the answer is the length of the subarray, 3. We can show that 3 is the maximum possible achievable length.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 100
    1 <= threshold <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 5, 4};
        int threshold = 5;
        int expected = 3;
        var result = solution.longestAlternatingSubarray(nums, threshold);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2};
        int threshold = 2;
        int expected = 1;
        var result = solution.longestAlternatingSubarray(nums, threshold);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 4, 5};
        int threshold = 4;
        int expected = 3;
        var result = solution.longestAlternatingSubarray(nums, threshold);
        assertThat(result).isEqualTo(expected);
    }

}
