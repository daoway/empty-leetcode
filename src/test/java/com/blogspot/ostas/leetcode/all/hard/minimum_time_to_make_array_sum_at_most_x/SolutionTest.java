package com.blogspot.ostas.leetcode.all.hard.minimum_time_to_make_array_sum_at_most_x;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [1,2,3], nums2 = [1,2,3], x = 4
    Output: 3
    Explanation:
    For the 1st second, we apply the operation on i = 0. Therefore nums1 = [0,2+2,3+3] = [0,4,6].
    For the 2nd second, we apply the operation on i = 1. Therefore nums1 = [0+1,0,6+3] = [1,0,9].
    For the 3rd second, we apply the operation on i = 2. Therefore nums1 = [1+1,0+2,0] = [2,2,0].
    Now sum of nums1 = 4. It can be shown that these operations are optimal, so we return 3.
    Example 2:
    Input: nums1 = [1,2,3], nums2 = [3,3,3], x = 4
    Output: -1
    Explanation: It can be shown that the sum of nums1 will always be greater than x, no matter which operations are performed.
      Constraints:
    1 <= nums1.length <= 103
    1 <= nums1[i] <= 103
    0 <= nums2[i] <= 103
    nums1.length == nums2.length
    0 <= x <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums1 = List.of(1, 2, 3);
        List<Integer> nums2 = List.of(1, 2, 3);
        int x = 4;
        int expected = 3;
        var result = solution.minimumTime(nums1, nums2, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums1 = List.of(1, 2, 3);
        List<Integer> nums2 = List.of(3, 3, 3);
        int x = 4;
        int expected = -1;
        var result = solution.minimumTime(nums1, nums2, x);
        assertThat(result).isEqualTo(expected);
    }

}
