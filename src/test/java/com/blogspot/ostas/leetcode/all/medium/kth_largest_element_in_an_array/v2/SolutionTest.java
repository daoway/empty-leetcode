package com.blogspot.ostas.leetcode.all.medium.kth_largest_element_in_an_array.v2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5
    Example 2:
    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
    Output: 4
      Constraints:
    1 <= k <= nums.length <= 105
    -104 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        var result = solution.findKthLargest(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        var result = solution.findKthLargest(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
