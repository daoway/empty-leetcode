package com.blogspot.ostas.leetcode.all.medium.advantage_shuffle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [2,7,11,15], nums2 = [1,10,4,11]
    Output: [2,11,7,15]
    Example 2:
    Input: nums1 = [12,24,8,32], nums2 = [13,25,32,11]
    Output: [24,32,8,12]
      Constraints:
    1 <= nums1.length <= 105
    nums2.length == nums1.length
    0 <= nums1[i], nums2[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 7, 11, 15};
        int[] nums2 = new int[]{1, 10, 4, 11};
        int[] expected = new int[]{2, 11, 7, 15};
        var result = solution.advantageCount(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{12, 24, 8, 32};
        int[] nums2 = new int[]{13, 25, 32, 11};
        int[] expected = new int[]{24, 32, 8, 12};
        var result = solution.advantageCount(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
