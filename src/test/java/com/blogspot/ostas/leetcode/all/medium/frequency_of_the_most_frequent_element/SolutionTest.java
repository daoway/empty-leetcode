package com.blogspot.ostas.leetcode.all.medium.frequency_of_the_most_frequent_element;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,4], k = 5
    Output: 3
    Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
    4 has a frequency of 3.
    Example 2:
    Input: nums = [1,4,8,13], k = 5
    Output: 2
    Explanation: There are multiple optimal solutions:
    - Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
    - Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
    - Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.
    Example 3:
    Input: nums = [3,9,6], k = 2
    Output: 1
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 105
    1 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 4};
        int k = 5;
        int expected = 3;
        var result = solution.maxFrequency(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 4, 8, 13};
        int k = 5;
        int expected = 2;
        var result = solution.maxFrequency(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 9, 6};
        int k = 2;
        int expected = 1;
        var result = solution.maxFrequency(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
