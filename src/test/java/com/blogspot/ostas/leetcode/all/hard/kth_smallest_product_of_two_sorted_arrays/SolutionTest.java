package com.blogspot.ostas.leetcode.all.hard.kth_smallest_product_of_two_sorted_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [2,5], nums2 = [3,4], k = 2
    Output: 8
    Explanation: The 2 smallest products are:
    - nums1[0] * nums2[0] = 2 * 3 = 6
    - nums1[0] * nums2[1] = 2 * 4 = 8
    The 2nd smallest product is 8.
    Example 2:
    Input: nums1 = [-4,-2,0,3], nums2 = [2,4], k = 6
    Output: 0
    Explanation: The 6 smallest products are:
    - nums1[0] * nums2[1] = (-4) * 4 = -16
    - nums1[0] * nums2[0] = (-4) * 2 = -8
    - nums1[1] * nums2[1] = (-2) * 4 = -8
    - nums1[1] * nums2[0] = (-2) * 2 = -4
    - nums1[2] * nums2[0] = 0 * 2 = 0
    - nums1[2] * nums2[1] = 0 * 4 = 0
    The 6th smallest product is 0.
    Example 3:
    Input: nums1 = [-2,-1,0,1,2], nums2 = [-3,-1,2,4,5], k = 3
    Output: -6
    Explanation: The 3 smallest products are:
    - nums1[0] * nums2[4] = (-2) * 5 = -10
    - nums1[0] * nums2[3] = (-2) * 4 = -8
    - nums1[4] * nums2[0] = 2 * (-3) = -6
    The 3rd smallest product is -6.
      Constraints:
    1 <= nums1.length, nums2.length <= 5 * 104
    -105 <= nums1[i], nums2[j] <= 105
    1 <= k <= nums1.length * nums2.length
    nums1 and nums2 are sorted.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 5};
        int[] nums2 = new int[]{3, 4};
        long k = 2;
        long expected = 8;
        var result = solution.kthSmallestProduct(nums1, nums2, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{-4, -2, 0, 3};
        int[] nums2 = new int[]{2, 4};
        long k = 6;
        long expected = 0;
        var result = solution.kthSmallestProduct(nums1, nums2, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{-2, -1, 0, 1, 2};
        int[] nums2 = new int[]{-3, -1, 2, 4, 5};
        long k = 3;
        long expected = -6;
        var result = solution.kthSmallestProduct(nums1, nums2, k);
        assertThat(result).isEqualTo(expected);
    }

}
