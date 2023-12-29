package com.blogspot.ostas.leetcode.all.medium.maximum_length_of_repeated_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
    Output: 3
    Explanation: The repeated subarray with maximum length is [3,2,1].
    Example 2:
    Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
    Output: 5
    Explanation: The repeated subarray with maximum length is [0,0,0,0,0].
      Constraints:
    1 <= nums1.length, nums2.length <= 1000
    0 <= nums1[i], nums2[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 2, 3, 2, 1};
        int[] nums2 = new int[]{3, 2, 1, 4, 7};
        int expected = 3;
        var result = solution.findLength(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{0, 0, 0, 0, 0};
        int[] nums2 = new int[]{0, 0, 0, 0, 0};
        int expected = 5;
        var result = solution.findLength(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
