package com.blogspot.ostas.leetcode.all.medium.count_number_of_distinct_integers_after_reverse_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,13,10,12,31]
    Output: 6
    Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
    The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
    The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
    Example 2:
    Input: nums = [2,2,2]
    Output: 1
    Explanation: After including the reverse of each number, the resulting array is [2,2,2,2,2,2].
    The number of distinct integers in this array is 1 (The number 2).
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 13, 10, 12, 31};
        int expected = 6;
        var result = solution.countDistinctIntegers(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 2};
        int expected = 1;
        var result = solution.countDistinctIntegers(nums);
        assertThat(result).isEqualTo(expected);
    }

}
