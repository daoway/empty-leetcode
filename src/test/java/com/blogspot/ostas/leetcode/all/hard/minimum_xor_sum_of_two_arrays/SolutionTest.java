package com.blogspot.ostas.leetcode.all.hard.minimum_xor_sum_of_two_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [1,2], nums2 = [2,3]
    Output: 2
    Explanation: Rearrange nums2 so that it becomes [3,2].
    The XOR sum is (1 XOR 3) + (2 XOR 2) = 2 + 0 = 2.
    Example 2:
    Input: nums1 = [1,0,3], nums2 = [5,3,4]
    Output: 8
    Explanation: Rearrange nums2 so that it becomes [5,4,3].
    The XOR sum is (1 XOR 5) + (0 XOR 4) + (3 XOR 3) = 4 + 4 + 0 = 8.
      Constraints:
    n == nums1.length
    n == nums2.length
    1 <= n <= 14
    0 <= nums1[i], nums2[i] <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{2, 3};
        int expected = 2;
        var result = solution.minimumXORSum(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 0, 3};
        int[] nums2 = new int[]{5, 3, 4};
        int expected = 8;
        var result = solution.minimumXORSum(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
