package com.blogspot.ostas.leetcode.all.medium.longest_non_decreasing_subarray_from_two_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [2,3,1], nums2 = [1,2,1]
    Output: 2
    Explanation: One way to construct nums3 is:
    nums3 = [nums1[0], nums2[1], nums2[2]] => [2,2,1].
    The subarray starting from index 0 and ending at index 1, [2,2], forms a non-decreasing subarray of length 2.
    We can show that 2 is the maximum achievable length.
    Example 2:
    Input: nums1 = [1,3,2,1], nums2 = [2,2,3,4]
    Output: 4
    Explanation: One way to construct nums3 is:
    nums3 = [nums1[0], nums2[1], nums2[2], nums2[3]] => [1,2,3,4].
    The entire array forms a non-decreasing subarray of length 4, making it the maximum achievable length.
    Example 3:
    Input: nums1 = [1,1], nums2 = [2,2]
    Output: 2
    Explanation: One way to construct nums3 is:
    nums3 = [nums1[0], nums1[1]] => [1,1].
    The entire array forms a non-decreasing subarray of length 2, making it the maximum achievable length.
      Constraints:
    1 <= nums1.length == nums2.length == n <= 105
    1 <= nums1[i], nums2[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 3, 1};
        int[] nums2 = new int[]{1, 2, 1};
        int expected = 2;
        var result = solution.maxNonDecreasingLength(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 3, 2, 1};
        int[] nums2 = new int[]{2, 2, 3, 4};
        int expected = 4;
        var result = solution.maxNonDecreasingLength(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 1};
        int[] nums2 = new int[]{2, 2};
        int expected = 2;
        var result = solution.maxNonDecreasingLength(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
