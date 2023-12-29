package com.blogspot.ostas.leetcode.all.hard.minimum_swaps_to_make_sequences_increasing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [1,3,5,4], nums2 = [1,2,3,7]
    Output: 1
    Explanation:
    Swap nums1[3] and nums2[3]. Then the sequences are:
    nums1 = [1, 3, 5, 7] and nums2 = [1, 2, 3, 4]
    which are both strictly increasing.
    Example 2:
    Input: nums1 = [0,3,5,8,9], nums2 = [2,1,4,6,9]
    Output: 1
      Constraints:
    2 <= nums1.length <= 105
    nums2.length == nums1.length
    0 <= nums1[i], nums2[i] <= 2 * 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 3, 5, 4};
        int[] nums2 = new int[]{1, 2, 3, 7};
        int expected = 1;
        var result = solution.minSwap(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{0, 3, 5, 8, 9};
        int[] nums2 = new int[]{2, 1, 4, 6, 9};
        int expected = 1;
        var result = solution.minSwap(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
