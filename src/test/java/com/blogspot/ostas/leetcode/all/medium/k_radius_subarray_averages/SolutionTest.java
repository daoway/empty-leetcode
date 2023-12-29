package com.blogspot.ostas.leetcode.all.medium.k_radius_subarray_averages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [7,4,3,9,1,8,5,2,6], k = 3
    Output: [-1,-1,-1,5,4,4,-1,-1,-1]
    Explanation:
    - avg[0], avg[1], and avg[2] are -1 because there are less than k elements before each index.
    - The sum of the subarray centered at index 3 with radius 3 is: 7 + 4 + 3 + 9 + 1 + 8 + 5 = 37.
      Using integer division, avg[3] = 37 / 7 = 5.
    - For the subarray centered at index 4, avg[4] = (4 + 3 + 9 + 1 + 8 + 5 + 2) / 7 = 4.
    - For the subarray centered at index 5, avg[5] = (3 + 9 + 1 + 8 + 5 + 2 + 6) / 7 = 4.
    - avg[6], avg[7], and avg[8] are -1 because there are less than k elements after each index.
    Example 2:
    Input: nums = [100000], k = 0
    Output: [100000]
    Explanation:
    - The sum of the subarray centered at index 0 with radius 0 is: 100000.
      avg[0] = 100000 / 1 = 100000.
    Example 3:
    Input: nums = [8], k = 100000
    Output: [-1]
    Explanation:
    - avg[0] is -1 because there are less than k elements before and after index 0.
      Constraints:
    n == nums.length
    1 <= n <= 105
    0 <= nums[i], k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        int[] expected = new int[]{-1, -1, -1, 5, 4, 4, -1, -1, -1};
        var result = solution.getAverages(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{100000};
        int k = 0;
        int[] expected = new int[]{100000};
        var result = solution.getAverages(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{8};
        int k = 100000;
        int[] expected = new int[]{-1};
        var result = solution.getAverages(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
