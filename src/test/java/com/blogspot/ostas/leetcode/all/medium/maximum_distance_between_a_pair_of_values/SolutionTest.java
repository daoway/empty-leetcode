package com.blogspot.ostas.leetcode.all.medium.maximum_distance_between_a_pair_of_values;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [55,30,5,4,2], nums2 = [100,20,10,10,5]
    Output: 2
    Explanation: The valid pairs are (0,0), (2,2), (2,3), (2,4), (3,3), (3,4), and (4,4).
    The maximum distance is 2 with pair (2,4).
    Example 2:
    Input: nums1 = [2,2,2], nums2 = [10,10,1]
    Output: 1
    Explanation: The valid pairs are (0,0), (0,1), and (1,1).
    The maximum distance is 1 with pair (0,1).
    Example 3:
    Input: nums1 = [30,29,19,5], nums2 = [25,25,25,25,25]
    Output: 2
    Explanation: The valid pairs are (2,2), (2,3), (2,4), (3,3), and (3,4).
    The maximum distance is 2 with pair (2,4).
      Constraints:
    1 <= nums1.length, nums2.length <= 105
    1 <= nums1[i], nums2[j] <= 105
    Both nums1 and nums2 are non-increasing.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{55, 30, 5, 4, 2};
        int[] nums2 = new int[]{100, 20, 10, 10, 5};
        int expected = 2;
        var result = solution.maxDistance(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 2, 2};
        int[] nums2 = new int[]{10, 10, 1};
        int expected = 1;
        var result = solution.maxDistance(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums1 = new int[]{30, 29, 19, 5};
        int[] nums2 = new int[]{25, 25, 25, 25, 25};
        int expected = 2;
        var result = solution.maxDistance(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
