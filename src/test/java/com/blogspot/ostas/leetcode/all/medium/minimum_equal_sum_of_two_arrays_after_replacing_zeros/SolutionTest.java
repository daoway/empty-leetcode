package com.blogspot.ostas.leetcode.all.medium.minimum_equal_sum_of_two_arrays_after_replacing_zeros;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [3,2,0,1,0], nums2 = [6,5,0]
    Output: 12
    Explanation: We can replace 0's in the following way:
    - Replace the two 0's in nums1 with the values 2 and 4. The resulting array is nums1 = [3,2,2,1,4].
    - Replace the 0 in nums2 with the value 1. The resulting array is nums2 = [6,5,1].
    Both arrays have an equal sum of 12. It can be shown that it is the minimum sum we can obtain.
    Example 2:
    Input: nums1 = [2,0,2,0], nums2 = [1,4]
    Output: -1
    Explanation: It is impossible to make the sum of both arrays equal.
      Constraints:
    1 <= nums1.length, nums2.length <= 105
    0 <= nums1[i], nums2[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{3, 2, 0, 1, 0};
        int[] nums2 = new int[]{6, 5, 0};
        long expected = 12;
        var result = solution.minSum(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 0, 2, 0};
        int[] nums2 = new int[]{1, 4};
        long expected = -1;
        var result = solution.minSum(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
