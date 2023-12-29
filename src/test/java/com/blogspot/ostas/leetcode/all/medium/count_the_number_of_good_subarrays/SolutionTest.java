package com.blogspot.ostas.leetcode.all.medium.count_the_number_of_good_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,1,1,1], k = 10
    Output: 1
    Explanation: The only good subarray is the array nums itself.
    Example 2:
    Input: nums = [3,1,4,3,2,2,4], k = 2
    Output: 4
    Explanation: There are 4 different good subarrays:
    - [3,1,4,3,2,2] that has 2 pairs.
    - [3,1,4,3,2,2,4] that has 3 pairs.
    - [1,4,3,2,2,4] that has 2 pairs.
    - [4,3,2,2,4] that has 2 pairs.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i], k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int k = 10;
        long expected = 1;
        var result = solution.countGood(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 4, 3, 2, 2, 4};
        int k = 2;
        long expected = 4;
        var result = solution.countGood(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
