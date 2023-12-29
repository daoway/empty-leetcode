package com.blogspot.ostas.leetcode.all.medium.bitwise_xor_of_all_pairings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [2,1,3], nums2 = [10,2,5,0]
    Output: 13
    Explanation:
    A possible nums3 array is [8,0,7,2,11,3,4,1,9,1,6,3].
    The bitwise XOR of all these numbers is 13, so we return 13.
    Example 2:
    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 0
    Explanation:
    All possible pairs of bitwise XORs are nums1[0] ^ nums2[0], nums1[0] ^ nums2[1], nums1[1] ^ nums2[0],
    and nums1[1] ^ nums2[1].
    Thus, one possible nums3 array is [2,5,1,6].
    2 ^ 5 ^ 1 ^ 6 = 0, so we return 0.
      Constraints:
    1 <= nums1.length, nums2.length <= 105
    0 <= nums1[i], nums2[j] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 1, 3};
        int[] nums2 = new int[]{10, 2, 5, 0};
        int expected = 13;
        var result = solution.xorAllNums(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        int expected = 0;
        var result = solution.xorAllNums(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
