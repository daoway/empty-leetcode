package com.blogspot.ostas.leetcode.all.medium.find_the_maximum_number_of_marked_indices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,5,2,4]
    Output: 2
    Explanation: In the first operation: pick i = 2 and j = 1, the operation is allowed because 2 * nums[2] <= nums[1]. Then mark index 2 and 1.
    It can be shown that there's no other valid operation so the answer is 2.
    Example 2:
    Input: nums = [9,2,5,4]
    Output: 4
    Explanation: In the first operation: pick i = 3 and j = 0, the operation is allowed because 2 * nums[3] <= nums[0]. Then mark index 3 and 0.
    In the second operation: pick i = 1 and j = 2, the operation is allowed because 2 * nums[1] <= nums[2]. Then mark index 1 and 2.
    Since there is no other operation, the answer is 4.
    Example 3:
    Input: nums = [7,6,8]
    Output: 0
    Explanation: There is no valid operation to do, so the answer is 0.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 5, 2, 4};
        int expected = 2;
        var result = solution.maxNumOfMarkedIndices(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{9, 2, 5, 4};
        int expected = 4;
        var result = solution.maxNumOfMarkedIndices(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{7, 6, 8};
        int expected = 0;
        var result = solution.maxNumOfMarkedIndices(nums);
        assertThat(result).isEqualTo(expected);
    }

}
