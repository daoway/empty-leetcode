package com.blogspot.ostas.leetcode.all.medium.equal_sum_arrays_with_minimum_number_of_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [1,2,3,4,5,6], nums2 = [1,1,2,2,2,2]
    Output: 3
    Explanation: You can make the sums of nums1 and nums2 equal with 3 operations. All indices are 0-indexed.
    - Change nums2[0] to 6. nums1 = [1,2,3,4,5,6], nums2 = [6,1,2,2,2,2].
    - Change nums1[5] to 1. nums1 = [1,2,3,4,5,1], nums2 = [6,1,2,2,2,2].
    - Change nums1[2] to 2. nums1 = [1,2,2,4,5,1], nums2 = [6,1,2,2,2,2].
    Example 2:
    Input: nums1 = [1,1,1,1,1,1,1], nums2 = [6]
    Output: -1
    Explanation: There is no way to decrease the sum of nums1 or to increase the sum of nums2 to make them equal.
    Example 3:
    Input: nums1 = [6,6], nums2 = [1]
    Output: 3
    Explanation: You can make the sums of nums1 and nums2 equal with 3 operations. All indices are 0-indexed.
    - Change nums1[0] to 2. nums1 = [2,6], nums2 = [1].
    - Change nums1[1] to 2. nums1 = [2,2], nums2 = [1].
    - Change nums2[0] to 4. nums1 = [2,2], nums2 = [4].
      Constraints:
    1 <= nums1.length, nums2.length <= 105
    1 <= nums1[i], nums2[i] <= 6
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] nums2 = new int[]{1, 1, 2, 2, 2, 2};
        int expected = 3;
        var result = solution.minOperations(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 1, 1, 1, 1, 1, 1};
        int[] nums2 = new int[]{6};
        int expected = -1;
        var result = solution.minOperations(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{6, 6};
        int[] nums2 = new int[]{1};
        int expected = 3;
        var result = solution.minOperations(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
