package com.blogspot.ostas.leetcode.all.medium.minimum_absolute_sum_difference;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [1,7,5], nums2 = [2,3,5]
    Output: 3
    Explanation: There are two possible optimal solutions:
    - Replace the second element with the first: [1,7,5] => [1,1,5], or
    - Replace the second element with the third: [1,7,5] => [1,5,5].
    Both will yield an absolute sum difference of |1-2| + (|1-3| or |5-3|) + |5-5| = 3.
    Example 2:
    Input: nums1 = [2,4,6,8,10], nums2 = [2,4,6,8,10]
    Output: 0
    Explanation: nums1 is equal to nums2 so no replacement is needed. This will result in an
    absolute sum difference of 0.
    Example 3:
    Input: nums1 = [1,10,4,4,2,7], nums2 = [9,3,5,1,7,4]
    Output: 20
    Explanation: Replace the first element with the second: [1,10,4,4,2,7] => [10,10,4,4,2,7].
    This yields an absolute sum difference of |10-9| + |10-3| + |4-5| + |4-1| + |2-7| + |7-4| = 20
      Constraints:
    n == nums1.length
    n == nums2.length
    1 <= n <= 105
    1 <= nums1[i], nums2[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 7, 5};
        int[] nums2 = new int[]{2, 3, 5};
        int expected = 3;
        var result = solution.minAbsoluteSumDiff(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 4, 6, 8, 10};
        int[] nums2 = new int[]{2, 4, 6, 8, 10};
        int expected = 0;
        var result = solution.minAbsoluteSumDiff(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 10, 4, 4, 2, 7};
        int[] nums2 = new int[]{9, 3, 5, 1, 7, 4};
        int expected = 20;
        var result = solution.minAbsoluteSumDiff(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
