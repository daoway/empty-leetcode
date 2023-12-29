package com.blogspot.ostas.leetcode.all.easy.number_of_unequal_triplets_in_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,4,2,4,3]
    Output: 3
    Explanation: The following triplets meet the conditions:
    - (0, 2, 4) because 4 != 2 != 3
    - (1, 2, 4) because 4 != 2 != 3
    - (2, 3, 4) because 2 != 4 != 3
    Since there are 3 triplets, we return 3.
    Note that (2, 0, 4) is not a valid triplet because 2 > 0.
    Example 2:
    Input: nums = [1,1,1,1,1]
    Output: 0
    Explanation: No triplets meet the conditions so we return 0.
      Constraints:
    3 <= nums.length <= 100
    1 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 4, 2, 4, 3};
        int expected = 3;
        var result = solution.unequalTriplets(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int expected = 0;
        var result = solution.unequalTriplets(nums);
        assertThat(result).isEqualTo(expected);
    }

}
