package com.blogspot.ostas.leetcode.all.easy.create_target_array_in_the_given_order;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
    Output: [0,4,1,3,2]
    Explanation:
    nums       index     target
    0            0        [0]
    1            1        [0,1]
    2            2        [0,1,2]
    3            2        [0,1,3,2]
    4            1        [0,4,1,3,2]
    Example 2:
    Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
    Output: [0,1,2,3,4]
    Explanation:
    nums       index     target
    1            0        [1]
    2            1        [1,2]
    3            2        [1,2,3]
    4            3        [1,2,3,4]
    0            0        [0,1,2,3,4]
    Example 3:
    Input: nums = [1], index = [0]
    Output: [1]
      Constraints:
    1 <= nums.length, index.length <= 100
    nums.length == index.length
    0 <= nums[i] <= 100
    0 <= index[i] <= i
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};
        int[] expected = new int[]{0, 4, 1, 3, 2};
        var result = solution.createTargetArray(nums, index);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 0};
        int[] index = new int[]{0, 1, 2, 3, 0};
        int[] expected = new int[]{0, 1, 2, 3, 4};
        var result = solution.createTargetArray(nums, index);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int[] index = new int[]{0};
        int[] expected = new int[]{1};
        var result = solution.createTargetArray(nums, index);
        assertThat(result).isEqualTo(expected);
    }

}
