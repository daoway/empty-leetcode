package com.blogspot.ostas.leetcode.all.hard.maximum_score_from_performing_multiplication_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3], multipliers = [3,2,1]
    Output: 14
    Explanation: An optimal solution is as follows:
    - Choose from the end, [1,2,3], adding 3 * 3 = 9 to the score.
    - Choose from the end, [1,2], adding 2 * 2 = 4 to the score.
    - Choose from the end, [1], adding 1 * 1 = 1 to the score.
    The total score is 9 + 4 + 1 = 14.
    Example 2:
    Input: nums = [-5,-3,-3,-2,7,1], multipliers = [-10,-5,3,4,6]
    Output: 102
    Explanation: An optimal solution is as follows:
    - Choose from the start, [-5,-3,-3,-2,7,1], adding -5 * -10 = 50 to the score.
    - Choose from the start, [-3,-3,-2,7,1], adding -3 * -5 = 15 to the score.
    - Choose from the start, [-3,-2,7,1], adding -3 * 3 = -9 to the score.
    - Choose from the end, [-2,7,1], adding 1 * 4 = 4 to the score.
    - Choose from the end, [-2,7], adding 7 * 6 = 42 to the score.
    The total score is 50 + 15 - 9 + 4 + 42 = 102.
      Constraints:
    n == nums.length
    m == multipliers.length
    1 <= m <= 300
    m <= n <= 105
    -1000 <= nums[i], multipliers[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int[] multipliers = new int[]{3, 2, 1};
        int expected = 14;
        var result = solution.maximumScore(nums, multipliers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-5, -3, -3, -2, 7, 1};
        int[] multipliers = new int[]{-10, -5, 3, 4, 6};
        int expected = 102;
        var result = solution.maximumScore(nums, multipliers);
        assertThat(result).isEqualTo(expected);
    }

}
