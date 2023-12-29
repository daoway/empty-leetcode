package com.blogspot.ostas.leetcode.all.medium.find_the_value_of_the_partition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,2,4]
    Output: 1
    Explanation: We can partition the array nums into nums1 = [1,2] and nums2 = [3,4].
    - The maximum element of the array nums1 is equal to 2.
    - The minimum element of the array nums2 is equal to 3.
    The value of the partition is |2 - 3| = 1.
    It can be proven that 1 is the minimum value out of all partitions.
    Example 2:
    Input: nums = [100,1,10]
    Output: 9
    Explanation: We can partition the array nums into nums1 = [10] and nums2 = [100,1].
    - The maximum element of the array nums1 is equal to 10.
    - The minimum element of the array nums2 is equal to 1.
    The value of the partition is |10 - 1| = 9.
    It can be proven that 9 is the minimum value out of all partitions.
      Constraints:
    2 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 2, 4};
        int expected = 1;
        var result = solution.findValueOfPartition(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{100, 1, 10};
        int expected = 9;
        var result = solution.findValueOfPartition(nums);
        assertThat(result).isEqualTo(expected);
    }

}
