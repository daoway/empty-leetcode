package com.blogspot.ostas.leetcode.all.hard.minimum_difference_in_sums_after_removal_of_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,1,2]
    Output: -1
    Explanation: Here, nums has 3 elements, so n = 1.
    Thus we have to remove 1 element from nums and divide the array into two equal parts.
    - If we remove nums[0] = 3, the array will be [1,2]. The difference in sums of the two parts will be 1 - 2 = -1.
    - If we remove nums[1] = 1, the array will be [3,2]. The difference in sums of the two parts will be 3 - 2 = 1.
    - If we remove nums[2] = 2, the array will be [3,1]. The difference in sums of the two parts will be 3 - 1 = 2.
    The minimum difference between sums of the two parts is min(-1,1,2) = -1.
    Example 2:
    Input: nums = [7,9,5,8,1,3]
    Output: 1
    Explanation: Here n = 2. So we must remove 2 elements and divide the remaining array into two parts containing two elements each.
    If we remove nums[2] = 5 and nums[3] = 8, the resultant array will be [7,9,1,3]. The difference in sums will be (7+9) - (1+3) = 12.
    To obtain the minimum difference, we should remove nums[1] = 9 and nums[4] = 1. The resultant array becomes [7,5,8,3]. The difference in sums of the two parts is (7+5) - (8+3) = 1.
    It can be shown that it is not possible to obtain a difference smaller than 1.
      Constraints:
    nums.length == 3 * n
    1 <= n <= 105
    1 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 2};
        long expected = -1;
        var result = solution.minimumDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{7, 9, 5, 8, 1, 3};
        long expected = 1;
        var result = solution.minimumDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

}
