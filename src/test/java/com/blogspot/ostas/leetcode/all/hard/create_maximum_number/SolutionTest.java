package com.blogspot.ostas.leetcode.all.hard.create_maximum_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [3,4,6,5], nums2 = [9,1,2,5,8,3], k = 5
    Output: [9,8,6,5,3]
    Example 2:
    Input: nums1 = [6,7], nums2 = [6,0,4], k = 5
    Output: [6,7,6,0,4]
    Example 3:
    Input: nums1 = [3,9], nums2 = [8,9], k = 3
    Output: [9,8,9]
      Constraints:
    m == nums1.length
    n == nums2.length
    1 <= m, n <= 500
    0 <= nums1[i], nums2[i] <= 9
    1 <= k <= m + n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{3, 4, 6, 5};
        int[] nums2 = new int[]{9, 1, 2, 5, 8, 3};
        int k = 5;
        int[] expected = new int[]{9, 8, 6, 5, 3};
        var result = solution.maxNumber(nums1, nums2, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{6, 7};
        int[] nums2 = new int[]{6, 0, 4};
        int k = 5;
        int[] expected = new int[]{6, 7, 6, 0, 4};
        var result = solution.maxNumber(nums1, nums2, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{3, 9};
        int[] nums2 = new int[]{8, 9};
        int k = 3;
        int[] expected = new int[]{9, 8, 9};
        var result = solution.maxNumber(nums1, nums2, k);
        assertThat(result).isEqualTo(expected);
    }

}
