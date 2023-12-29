package com.blogspot.ostas.leetcode.all.easy.concatenation_of_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
    - ans = [1,2,1,1,2,1]
    Example 2:
    Input: nums = [1,3,2,1]
    Output: [1,3,2,1,1,3,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
    - ans = [1,3,2,1,1,3,2,1]
      Constraints:
    n == nums.length
    1 <= n <= 1000
    1 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1};
        int[] expected = new int[]{1, 2, 1, 1, 2, 1};
        var result = solution.getConcatenation(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 2, 1};
        int[] expected = new int[]{1, 3, 2, 1, 1, 3, 2, 1};
        var result = solution.getConcatenation(nums);
        assertThat(result).isEqualTo(expected);
    }

}
