package com.blogspot.ostas.leetcode.all.medium.removing_minimum_and_maximum_from_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,10,7,5,4,1,8,6]
    Output: 5
    Explanation:
    The minimum element in the array is nums[5], which is 1.
    The maximum element in the array is nums[1], which is 10.
    We can remove both the minimum and maximum by removing 2 elements from the front and 3 elements from the back.
    This results in 2 + 3 = 5 deletions, which is the minimum number possible.
    Example 2:
    Input: nums = [0,-4,19,1,8,-2,-3,5]
    Output: 3
    Explanation:
    The minimum element in the array is nums[1], which is -4.
    The maximum element in the array is nums[2], which is 19.
    We can remove both the minimum and maximum by removing 3 elements from the front.
    This results in only 3 deletions, which is the minimum number possible.
    Example 3:
    Input: nums = [101]
    Output: 1
    Explanation:
    There is only one element in the array, which makes it both the minimum and maximum element.
    We can remove it with 1 deletion.
      Constraints:
    1 <= nums.length <= 105
    -105 <= nums[i] <= 105
    The integers in nums are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 10, 7, 5, 4, 1, 8, 6};
        int expected = 5;
        var result = solution.minimumDeletions(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, -4, 19, 1, 8, -2, -3, 5};
        int expected = 3;
        var result = solution.minimumDeletions(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{101};
        int expected = 1;
        var result = solution.minimumDeletions(nums);
        assertThat(result).isEqualTo(expected);
    }

}
