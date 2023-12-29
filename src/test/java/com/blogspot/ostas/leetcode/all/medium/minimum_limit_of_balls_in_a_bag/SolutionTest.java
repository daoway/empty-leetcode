package com.blogspot.ostas.leetcode.all.medium.minimum_limit_of_balls_in_a_bag;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [9], maxOperations = 2
    Output: 3
    Explanation:
    - Divide the bag with 9 balls into two bags of sizes 6 and 3. [9] -> [6,3].
    - Divide the bag with 6 balls into two bags of sizes 3 and 3. [6,3] -> [3,3,3].
    The bag with the most number of balls has 3 balls, so your penalty is 3 and you should return 3.
    Example 2:
    Input: nums = [2,4,8,2], maxOperations = 4
    Output: 2
    Explanation:
    - Divide the bag with 8 balls into two bags of sizes 4 and 4. [2,4,8,2] -> [2,4,4,4,2].
    - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,4,4,4,2] -> [2,2,2,4,4,2].
    - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,4,4,2] -> [2,2,2,2,2,4,2].
    - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,2,2,4,2] -> [2,2,2,2,2,2,2,2].
    The bag with the most number of balls has 2 balls, so your penalty is 2, and you should return 2.
      Constraints:
    1 <= nums.length <= 105
    1 <= maxOperations, nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{9};
        int maxOperations = 2;
        int expected = 3;
        var result = solution.minimumSize(nums, maxOperations);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 8, 2};
        int maxOperations = 4;
        int expected = 2;
        var result = solution.minimumSize(nums, maxOperations);
        assertThat(result).isEqualTo(expected);
    }

}
