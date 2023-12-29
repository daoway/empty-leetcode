package com.blogspot.ostas.leetcode.all.hard.sum_of_imbalance_numbers_of_all_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,1,4]
    Output: 3
    Explanation: There are 3 subarrays with non-zero imbalance numbers:
    - Subarray [3, 1] with an imbalance number of 1.
    - Subarray [3, 1, 4] with an imbalance number of 1.
    - Subarray [1, 4] with an imbalance number of 1.
    The imbalance number of all other subarrays is 0. Hence, the sum of imbalance numbers of all the subarrays of nums is 3.
    Example 2:
    Input: nums = [1,3,3,3,5]
    Output: 8
    Explanation: There are 7 subarrays with non-zero imbalance numbers:
    - Subarray [1, 3] with an imbalance number of 1.
    - Subarray [1, 3, 3] with an imbalance number of 1.
    - Subarray [1, 3, 3, 3] with an imbalance number of 1.
    - Subarray [1, 3, 3, 3, 5] with an imbalance number of 2.
    - Subarray [3, 3, 3, 5] with an imbalance number of 1.
    - Subarray [3, 3, 5] with an imbalance number of 1.
    - Subarray [3, 5] with an imbalance number of 1.
    The imbalance number of all other subarrays is 0. Hence, the sum of imbalance numbers of all the subarrays of nums is 8.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 4};
        int expected = 3;
        var result = solution.sumImbalanceNumbers(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 3, 3, 5};
        int expected = 8;
        var result = solution.sumImbalanceNumbers(nums);
        assertThat(result).isEqualTo(expected);
    }

}
