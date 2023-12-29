package com.blogspot.ostas.leetcode.all.medium.minimum_operations_to_make_array_equal_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [4,3,1,4], nums2 = [1,3,7,1], k = 3
    Output: 2
    Explanation: In 2 operations, we can transform nums1 to nums2.
    1st operation: i = 2, j = 0. After applying the operation, nums1 = [1,3,4,4].
    2nd operation: i = 2, j = 3. After applying the operation, nums1 = [1,3,7,1].
    One can prove that it is impossible to make arrays equal in fewer operations.
    Example 2:
    Input: nums1 = [3,8,5,2], nums2 = [2,4,1,6], k = 1
    Output: -1
    Explanation: It can be proved that it is impossible to make the two arrays equal.
      Constraints:
    n == nums1.length == nums2.length
    2 <= n <= 105
    0 <= nums1[i], nums2[j] <= 109
    0 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{4, 3, 1, 4};
        int[] nums2 = new int[]{1, 3, 7, 1};
        int k = 3;
        long expected = 2;
        var result = solution.minOperations(nums1, nums2, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{3, 8, 5, 2};
        int[] nums2 = new int[]{2, 4, 1, 6};
        int k = 1;
        long expected = -1;
        var result = solution.minOperations(nums1, nums2, k);
        assertThat(result).isEqualTo(expected);
    }

}
