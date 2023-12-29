package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_operations_to_make_array_empty;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,3,2,2,4,2,3,4]
    Output: 4
    Explanation: We can apply the following operations to make the array empty:
    - Apply the first operation on the elements at indices 0 and 3. The resulting array is nums = [3,3,2,4,2,3,4].
    - Apply the first operation on the elements at indices 2 and 4. The resulting array is nums = [3,3,4,3,4].
    - Apply the second operation on the elements at indices 0, 1, and 3. The resulting array is nums = [4,4].
    - Apply the first operation on the elements at indices 0 and 1. The resulting array is nums = [].
    It can be shown that we cannot make the array empty in less than 4 operations.
    Example 2:
    Input: nums = [2,1,2,2,3,3]
    Output: -1
    Explanation: It is impossible to empty the array.
      Constraints:
    2 <= nums.length <= 105
    1 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 3, 2, 2, 4, 2, 3, 4};
        int expected = 4;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 2, 2, 3, 3};
        int expected = -1;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
