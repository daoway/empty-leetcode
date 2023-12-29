package com.blogspot.ostas.leetcode.all.medium.array_with_elements_not_equal_to_average_of_neighbors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5]
    Output: [1,2,4,5,3]
    Explanation:
    When i=1, nums[i] = 2, and the average of its neighbors is (1+4) / 2 = 2.5.
    When i=2, nums[i] = 4, and the average of its neighbors is (2+5) / 2 = 3.5.
    When i=3, nums[i] = 5, and the average of its neighbors is (4+3) / 2 = 3.5.
    Example 2:
    Input: nums = [6,2,0,9,7]
    Output: [9,7,6,2,0]
    Explanation:
    When i=1, nums[i] = 7, and the average of its neighbors is (9+6) / 2 = 7.5.
    When i=2, nums[i] = 6, and the average of its neighbors is (7+2) / 2 = 4.5.
    When i=3, nums[i] = 2, and the average of its neighbors is (6+0) / 2 = 3.
      Constraints:
    3 <= nums.length <= 105
    0 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{2, 1, 4, 3, 5};
        var result = solution.rearrangeArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{6, 2, 0, 9, 7};
        int[] expected = new int[]{2, 0, 7, 6, 9};
        var result = solution.rearrangeArray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
