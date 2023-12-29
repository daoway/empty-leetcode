package com.blogspot.ostas.leetcode.all.hard.smallest_rotation_with_highest_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,1,4,0]
    Output: 3
    Explanation: Scores for each k are listed below:
    k = 0,  nums = [2,3,1,4,0],    score 2
    k = 1,  nums = [3,1,4,0,2],    score 3
    k = 2,  nums = [1,4,0,2,3],    score 3
    k = 3,  nums = [4,0,2,3,1],    score 4
    k = 4,  nums = [0,2,3,1,4],    score 3
    So we should choose k = 3, which has the highest score.
    Example 2:
    Input: nums = [1,3,0,2,4]
    Output: 0
    Explanation: nums will always have 3 points no matter how it shifts.
    So we will choose the smallest k, which is 0.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] < nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 4, 0};
        int expected = 3;
        var result = solution.bestRotation(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 0, 2, 4};
        int expected = 0;
        var result = solution.bestRotation(nums);
        assertThat(result).isEqualTo(expected);
    }

}
