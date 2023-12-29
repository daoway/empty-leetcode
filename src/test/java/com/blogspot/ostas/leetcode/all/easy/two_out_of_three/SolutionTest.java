package com.blogspot.ostas.leetcode.all.easy.two_out_of_three;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
    Output: [3,2]
    Explanation: The values that are present in at least two arrays are:
    - 3, in all three arrays.
    - 2, in nums1 and nums2.
    Example 2:
    Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
    Output: [2,3,1]
    Explanation: The values that are present in at least two arrays are:
    - 2, in nums2 and nums3.
    - 3, in nums1 and nums2.
    - 1, in nums1 and nums3.
    Example 3:
    Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
    Output: []
    Explanation: No value is present in at least two arrays.
      Constraints:
    1 <= nums1.length, nums2.length, nums3.length <= 100
    1 <= nums1[i], nums2[j], nums3[k] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 1, 3, 2};
        int[] nums2 = new int[]{2, 3};
        int[] nums3 = new int[]{3};
        List<Integer> expected = List.of(3, 2);
        var result = solution.twoOutOfThree(nums1, nums2, nums3);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{3, 1};
        int[] nums2 = new int[]{2, 3};
        int[] nums3 = new int[]{1, 2};
        List<Integer> expected = List.of(2, 3, 1);
        var result = solution.twoOutOfThree(nums1, nums2, nums3);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 2, 2};
        int[] nums2 = new int[]{4, 3, 3};
        int[] nums3 = new int[]{5};
        List<Integer> expected = List.of();
        var result = solution.twoOutOfThree(nums1, nums2, nums3);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}
