package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_operations_to_make_arrays_similar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [8,12,6], target = [2,14,10]
    Output: 2
    Explanation: It is possible to make nums similar to target in two operations:
    - Choose i = 0 and j = 2, nums = [10,12,4].
    - Choose i = 1 and j = 2, nums = [10,14,2].
    It can be shown that 2 is the minimum number of operations needed.
    Example 2:
    Input: nums = [1,2,5], target = [4,1,3]
    Output: 1
    Explanation: We can make nums similar to target in one operation:
    - Choose i = 1 and j = 2, nums = [1,4,3].
    Example 3:
    Input: nums = [1,1,1,1,1], target = [1,1,1,1,1]
    Output: 0
    Explanation: The array nums is already similiar to target.
      Constraints:
    n == nums.length == target.length
    1 <= n <= 105
    1 <= nums[i], target[i] <= 106
    It is possible to make nums similar to target.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{8, 12, 6};
        int[] target = new int[]{2, 14, 10};
        long expected = 2;
        var result = solution.makeSimilar(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 5};
        int[] target = new int[]{4, 1, 3};
        long expected = 1;
        var result = solution.makeSimilar(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int[] target = new int[]{1, 1, 1, 1, 1};
        long expected = 0;
        var result = solution.makeSimilar(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
