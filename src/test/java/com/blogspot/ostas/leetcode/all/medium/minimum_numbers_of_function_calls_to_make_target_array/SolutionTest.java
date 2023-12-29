package com.blogspot.ostas.leetcode.all.medium.minimum_numbers_of_function_calls_to_make_target_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,5]
    Output: 5
    Explanation: Increment by 1 (second element): [0, 0] to get [0, 1] (1 operation).
    Double all the elements: [0, 1] -> [0, 2] -> [0, 4] (2 operations).
    Increment by 1 (both elements)  [0, 4] -> [1, 4] -> [1, 5] (2 operations).
    Total of operations: 1 + 2 + 2 = 5.
    Example 2:
    Input: nums = [2,2]
    Output: 3
    Explanation: Increment by 1 (both elements) [0, 0] -> [0, 1] -> [1, 1] (2 operations).
    Double all the elements: [1, 1] -> [2, 2] (1 operation).
    Total of operations: 2 + 1 = 3.
    Example 3:
    Input: nums = [4,2,5]
    Output: 6
    Explanation: (initial)[0,0,0] -> [1,0,0] -> [1,0,1] -> [2,0,2] -> [2,1,2] -> [4,2,4] -> [4,2,5](nums).
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5};
        int expected = 5;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2};
        int expected = 3;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 5};
        int expected = 6;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
