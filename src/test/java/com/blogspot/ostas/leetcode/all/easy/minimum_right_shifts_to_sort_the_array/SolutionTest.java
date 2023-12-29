package com.blogspot.ostas.leetcode.all.easy.minimum_right_shifts_to_sort_the_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,4,5,1,2]
    Output: 2
    Explanation:
    After the first right shift, nums = [2,3,4,5,1].
    After the second right shift, nums = [1,2,3,4,5].
    Now nums is sorted; therefore the answer is 2.
    Example 2:
    Input: nums = [1,3,5]
    Output: 0
    Explanation: nums is already sorted therefore, the answer is 0.
    Example 3:
    Input: nums = [2,1,4]
    Output: -1
    Explanation: It's impossible to sort the array using right shifts.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 100
    nums contains distinct integers.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(3, 4, 5, 1, 2);
        int expected = 2;
        var result = solution.minimumRightShifts(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 3, 5);
        int expected = 0;
        var result = solution.minimumRightShifts(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<Integer> nums = List.of(2, 1, 4);
        int expected = -1;
        var result = solution.minimumRightShifts(nums);
        assertThat(result).isEqualTo(expected);
    }

}
