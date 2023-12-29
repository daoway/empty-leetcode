package com.blogspot.ostas.leetcode.all.medium.convert_an_array_into_a_two_d_array_with_conditions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,4,1,2,3,1]
    Output: [[1,3,4,2],[1,3],[1]]
    Explanation: We can create a 2D array that contains the following rows:
    - 1,3,4,2
    - 1,3
    - 1
    All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
    It can be shown that we cannot have less than 3 rows in a valid array.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: [[4,3,2,1]]
    Explanation: All elements of the array are distinct, so we can keep all of them in the first row of the 2D array.
      Constraints:
    1 <= nums.length <= 200
    1 <= nums[i] <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> expected = List.of(List.of(1, 3, 4, 2), List.of(1, 3), List.of(1));
        var result = solution.findMatrix(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        List<List<Integer>> expected = List.of(List.of(4, 3, 2, 1));
        var result = solution.findMatrix(nums);
        assertThat(result).isEqualTo(expected);
    }

}
