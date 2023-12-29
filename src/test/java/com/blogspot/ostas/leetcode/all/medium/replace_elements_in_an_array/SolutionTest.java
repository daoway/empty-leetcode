package com.blogspot.ostas.leetcode.all.medium.replace_elements_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,4,6], operations = [[1,3],[4,7],[6,1]]
    Output: [3,2,7,1]
    Explanation: We perform the following operations on nums:
    - Replace the number 1 with 3. nums becomes [3,2,4,6].
    - Replace the number 4 with 7. nums becomes [3,2,7,6].
    - Replace the number 6 with 1. nums becomes [3,2,7,1].
    We return the final array [3,2,7,1].
    Example 2:
    Input: nums = [1,2], operations = [[1,3],[2,1],[3,2]]
    Output: [2,1]
    Explanation: We perform the following operations to nums:
    - Replace the number 1 with 3. nums becomes [3,2].
    - Replace the number 2 with 1. nums becomes [3,1].
    - Replace the number 3 with 2. nums becomes [2,1].
    We return the array [2,1].
      Constraints:
    n == nums.length
    m == operations.length
    1 <= n, m <= 105
    All the values of nums are distinct.
    operations[i].length == 2
    1 <= nums[i], operations[i][0], operations[i][1] <= 106
    operations[i][0] will exist in nums when applying the ith operation.
    operations[i][1] will not exist in nums when applying the ith operation.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 4, 6};
        int[][] operations = new int[][]{{1, 3}, {4, 7}, {6, 1}};
        int[] expected = new int[]{3, 2, 7, 1};
        var result = solution.arrayChange(nums, operations);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2};
        int[][] operations = new int[][]{{1, 3}, {2, 1}, {3, 2}};
        int[] expected = new int[]{2, 1};
        var result = solution.arrayChange(nums, operations);
        assertThat(result).isEqualTo(expected);
    }

}
