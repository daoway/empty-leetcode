package com.blogspot.ostas.leetcode.all.hard.get_the_maximum_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [2,4,5,8,10], nums2 = [4,6,8,9]
    Output: 30
    Explanation: Valid paths:
    [2,4,5,8,10], [2,4,5,8,9], [2,4,6,8,9], [2,4,6,8,10],  (starting from nums1)
    [4,6,8,9], [4,5,8,10], [4,5,8,9], [4,6,8,10]    (starting from nums2)
    The maximum is obtained with the path in green [2,4,6,8,10].
    Example 2:
    Input: nums1 = [1,3,5,7,9], nums2 = [3,5,100]
    Output: 109
    Explanation: Maximum sum is obtained with the path [1,3,5,100].
    Example 3:
    Input: nums1 = [1,2,3,4,5], nums2 = [6,7,8,9,10]
    Output: 40
    Explanation: There are no common elements between nums1 and nums2.
    Maximum sum is obtained with the path [6,7,8,9,10].
      Constraints:
    1 <= nums1.length, nums2.length <= 105
    1 <= nums1[i], nums2[i] <= 107
    nums1 and nums2 are strictly increasing.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 4, 5, 8, 10};
        int[] nums2 = new int[]{4, 6, 8, 9};
        int expected = 30;
        var result = solution.maxSum(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 3, 5, 7, 9};
        int[] nums2 = new int[]{3, 5, 100};
        int expected = 109;
        var result = solution.maxSum(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        int[] nums2 = new int[]{6, 7, 8, 9, 10};
        int expected = 40;
        var result = solution.maxSum(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
