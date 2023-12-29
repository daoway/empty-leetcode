package com.blogspot.ostas.leetcode.all.medium.minimum_sum_of_squared_difference;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [1,2,3,4], nums2 = [2,10,20,19], k1 = 0, k2 = 0
    Output: 579
    Explanation: The elements in nums1 and nums2 cannot be modified because k1 = 0 and k2 = 0.
    The sum of square difference will be: (1 - 2)2 + (2 - 10)2 + (3 - 20)2 + (4 - 19)2 = 579.
    Example 2:
    Input: nums1 = [1,4,10,12], nums2 = [5,8,6,9], k1 = 1, k2 = 1
    Output: 43
    Explanation: One way to obtain the minimum sum of square difference is:
    - Increase nums1[0] once.
    - Increase nums2[2] once.
    The minimum of the sum of square difference will be:
    (2 - 5)2 + (4 - 8)2 + (10 - 7)2 + (12 - 9)2 = 43.
    Note that, there are other ways to obtain the minimum of the sum of square difference, but there is no way to obtain a sum smaller than 43.
      Constraints:
    n == nums1.length == nums2.length
    1 <= n <= 105
    0 <= nums1[i], nums2[i] <= 105
    0 <= k1, k2 <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{2, 10, 20, 19};
        int k1 = 0;
        int k2 = 0;
        long expected = 579;
        var result = solution.minSumSquareDiff(nums1, nums2, k1, k2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 4, 10, 12};
        int[] nums2 = new int[]{5, 8, 6, 9};
        int k1 = 1;
        int k2 = 1;
        long expected = 43;
        var result = solution.minSumSquareDiff(nums1, nums2, k1, k2);
        assertThat(result).isEqualTo(expected);
    }

}
