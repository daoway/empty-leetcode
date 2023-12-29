package com.blogspot.ostas.leetcode.all.medium.movement_of_robots;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [-2,0,2], s = "RLL", d = 3
    Output: 8
    Explanation:
    After 1 second, the positions are [-1,-1,1]. Now, the robot at index 0 will move left, and the robot at index 1 will move right.
    After 2 seconds, the positions are [-2,0,0]. Now, the robot at index 1 will move left, and the robot at index 2 will move right.
    After 3 seconds, the positions are [-3,-1,1].
    The distance between the robot at index 0 and 1 is abs(-3 - (-1)) = 2.
    The distance between the robot at index 0 and 2 is abs(-3 - 1) = 4.
    The distance between the robot at index 1 and 2 is abs(-1 - 1) = 2.
    The sum of the pairs of all distances = 2 + 4 + 2 = 8.
    Example 2:
    Input: nums = [1,0], s = "RL", d = 2
    Output: 5
    Explanation:
    After 1 second, the positions are [2,-1].
    After 2 seconds, the positions are [3,-2].
    The distance between the two robots is abs(-2 - 3) = 5.
      Constraints:
    2 <= nums.length <= 105
    -2 * 109 <= nums[i] <= 2 * 109
    0 <= d <= 109
    nums.length == s.length
    s consists of 'L' and 'R' only
    nums[i] will be unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{-2, 0, 2};
        String s = "RLL";
        int d = 3;
        int expected = 8;
        var result = solution.sumDistance(nums, s, d);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0};
        String s = "RL";
        int d = 2;
        int expected = 5;
        var result = solution.sumDistance(nums, s, d);
        assertThat(result).isEqualTo(expected);
    }

}
