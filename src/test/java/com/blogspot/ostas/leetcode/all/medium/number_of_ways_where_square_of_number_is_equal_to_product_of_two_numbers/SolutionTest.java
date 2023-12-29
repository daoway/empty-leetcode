package com.blogspot.ostas.leetcode.all.medium.number_of_ways_where_square_of_number_is_equal_to_product_of_two_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [7,4], nums2 = [5,2,8,9]
    Output: 1
    Explanation: Type 1: (1, 1, 2), nums1[1]2 = nums2[1] * nums2[2]. (42 = 2 * 8).
    Example 2:
    Input: nums1 = [1,1], nums2 = [1,1,1]
    Output: 9
    Explanation: All Triplets are valid, because 12 = 1 * 1.
    Type 1: (0,0,1), (0,0,2), (0,1,2), (1,0,1), (1,0,2), (1,1,2).  nums1[i]2 = nums2[j] * nums2[k].
    Type 2: (0,0,1), (1,0,1), (2,0,1). nums2[i]2 = nums1[j] * nums1[k].
    Example 3:
    Input: nums1 = [7,7,8,3], nums2 = [1,2,9,7]
    Output: 2
    Explanation: There are 2 valid triplets.
    Type 1: (3,0,2).  nums1[3]2 = nums2[0] * nums2[2].
    Type 2: (3,0,1).  nums2[3]2 = nums1[0] * nums1[1].
      Constraints:
    1 <= nums1.length, nums2.length <= 1000
    1 <= nums1[i], nums2[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{7, 4};
        int[] nums2 = new int[]{5, 2, 8, 9};
        int expected = 1;
        var result = solution.numTriplets(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 1};
        int[] nums2 = new int[]{1, 1, 1};
        int expected = 9;
        var result = solution.numTriplets(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{7, 7, 8, 3};
        int[] nums2 = new int[]{1, 2, 9, 7};
        int expected = 2;
        var result = solution.numTriplets(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
