package com.blogspot.ostas.leetcode.all.easy.form_smallest_number_from_two_digit_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [4,1,3], nums2 = [5,7]
    Output: 15
    Explanation: The number 15 contains the digit 1 from nums1 and the digit 5 from nums2. It can be proven that 15 is the smallest number we can have.
    Example 2:
    Input: nums1 = [3,5,2,6], nums2 = [3,1,7]
    Output: 3
    Explanation: The number 3 contains the digit 3 which exists in both arrays.
      Constraints:
    1 <= nums1.length, nums2.length <= 9
    1 <= nums1[i], nums2[i] <= 9
    All digits in each array are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{4, 1, 3};
        int[] nums2 = new int[]{5, 7};
        int expected = 15;
        var result = solution.minNumber(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{3, 5, 2, 6};
        int[] nums2 = new int[]{3, 1, 7};
        int expected = 3;
        var result = solution.minNumber(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
