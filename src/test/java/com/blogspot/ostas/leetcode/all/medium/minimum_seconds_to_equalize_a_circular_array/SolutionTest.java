package com.blogspot.ostas.leetcode.all.medium.minimum_seconds_to_equalize_a_circular_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,1,2]
    Output: 1
    Explanation: We can equalize the array in 1 second in the following way:
    - At 1st second, replace values at each index with [nums[3],nums[1],nums[3],nums[3]]. After replacement, nums = [2,2,2,2].
    It can be proven that 1 second is the minimum amount of seconds needed for equalizing the array.
    Example 2:
    Input: nums = [2,1,3,3,2]
    Output: 2
    Explanation: We can equalize the array in 2 seconds in the following way:
    - At 1st second, replace values at each index with [nums[0],nums[2],nums[2],nums[2],nums[3]]. After replacement, nums = [2,3,3,3,3].
    - At 2nd second, replace values at each index with [nums[1],nums[1],nums[2],nums[3],nums[4]]. After replacement, nums = [3,3,3,3,3].
    It can be proven that 2 seconds is the minimum amount of seconds needed for equalizing the array.
    Example 3:
    Input: nums = [5,5,5,5]
    Output: 0
    Explanation: We don't need to perform any operations as all elements in the initial array are the same.
      Constraints:
    1 <= n == nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 2, 1, 2);
        int expected = 1;
        var result = solution.minimumSeconds(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(2, 1, 3, 3, 2);
        int expected = 2;
        var result = solution.minimumSeconds(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<Integer> nums = List.of(5, 5, 5, 5);
        int expected = 0;
        var result = solution.minimumSeconds(nums);
        assertThat(result).isEqualTo(expected);
    }

}
