package com.blogspot.ostas.leetcode.all.medium.reduction_operations_to_make_the_array_elements_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,1,3]
    Output: 3
    Explanation: It takes 3 operations to make all elements in nums equal:
    1. largest = 5 at index 0. nextLargest = 3. Reduce nums[0] to 3. nums = [3,1,3].
    2. largest = 3 at index 0. nextLargest = 1. Reduce nums[0] to 1. nums = [1,1,3].
    3. largest = 3 at index 2. nextLargest = 1. Reduce nums[2] to 1. nums = [1,1,1].
    Example 2:
    Input: nums = [1,1,1]
    Output: 0
    Explanation: All elements in nums are already equal.
    Example 3:
    Input: nums = [1,1,2,2,3]
    Output: 4
    Explanation: It takes 4 operations to make all elements in nums equal:
    1. largest = 3 at index 4. nextLargest = 2. Reduce nums[4] to 2. nums = [1,1,2,2,2].
    2. largest = 2 at index 2. nextLargest = 1. Reduce nums[2] to 1. nums = [1,1,1,2,2].
    3. largest = 2 at index 3. nextLargest = 1. Reduce nums[3] to 1. nums = [1,1,1,1,2].
    4. largest = 2 at index 4. nextLargest = 1. Reduce nums[4] to 1. nums = [1,1,1,1,1].
      Constraints:
    1 <= nums.length <= 5 * 104
    1 <= nums[i] <= 5 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 1, 3};
        int expected = 3;
        var result = solution.reductionOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        int expected = 0;
        var result = solution.reductionOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 2, 3};
        int expected = 4;
        var result = solution.reductionOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
