package com.blogspot.ostas.leetcode.all.hard.max_dot_product_of_two_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [2,1,-2,5], nums2 = [3,0,-6]
    Output: 18
    Explanation: Take subsequence [2,-2] from nums1 and subsequence [3,-6] from nums2.
    Their dot product is (2*3 + (-2)*(-6)) = 18.
    Example 2:
    Input: nums1 = [3,-2], nums2 = [2,-6,7]
    Output: 21
    Explanation: Take subsequence [3] from nums1 and subsequence [7] from nums2.
    Their dot product is (3*7) = 21.
    Example 3:
    Input: nums1 = [-1,-1], nums2 = [1,1]
    Output: -1
    Explanation: Take subsequence [-1] from nums1 and subsequence [1] from nums2.
    Their dot product is -1.
      Constraints:
    1 <= nums1.length, nums2.length <= 500
    -1000 <= nums1[i], nums2[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 1, -2, 5};
        int[] nums2 = new int[]{3, 0, -6};
        int expected = 18;
        var result = solution.maxDotProduct(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{3, -2};
        int[] nums2 = new int[]{2, -6, 7};
        int expected = 21;
        var result = solution.maxDotProduct(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{-1, -1};
        int[] nums2 = new int[]{1, 1};
        int expected = -1;
        var result = solution.maxDotProduct(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
