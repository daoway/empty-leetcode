package com.blogspot.ostas.leetcode.all.hard.maximum_score_of_spliced_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [60,60,60], nums2 = [10,90,10]
    Output: 210
    Explanation: Choosing left = 1 and right = 1, we have nums1 = [60,90,60] and nums2 = [10,60,10].
    The score is max(sum(nums1), sum(nums2)) = max(210, 80) = 210.
    Example 2:
    Input: nums1 = [20,40,20,70,30], nums2 = [50,20,50,40,20]
    Output: 220
    Explanation: Choosing left = 3, right = 4, we have nums1 = [20,40,20,40,20] and nums2 = [50,20,50,70,30].
    The score is max(sum(nums1), sum(nums2)) = max(140, 220) = 220.
    Example 3:
    Input: nums1 = [7,11,13], nums2 = [1,1,1]
    Output: 31
    Explanation: We choose not to swap any subarray.
    The score is max(sum(nums1), sum(nums2)) = max(31, 3) = 31.
      Constraints:
    n == nums1.length == nums2.length
    1 <= n <= 105
    1 <= nums1[i], nums2[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{60, 60, 60};
        int[] nums2 = new int[]{10, 90, 10};
        int expected = 210;
        var result = solution.maximumsSplicedArray(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{20, 40, 20, 70, 30};
        int[] nums2 = new int[]{50, 20, 50, 40, 20};
        int expected = 220;
        var result = solution.maximumsSplicedArray(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{7, 11, 13};
        int[] nums2 = new int[]{1, 1, 1};
        int expected = 31;
        var result = solution.maximumsSplicedArray(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
