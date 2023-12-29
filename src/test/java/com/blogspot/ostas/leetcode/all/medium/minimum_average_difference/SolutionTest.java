package com.blogspot.ostas.leetcode.all.medium.minimum_average_difference;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,5,3,9,5,3]
    Output: 3
    Explanation:
    - The average difference of index 0 is: |2 / 1 - (5 + 3 + 9 + 5 + 3) / 5| = |2 / 1 - 25 / 5| = |2 - 5| = 3.
    - The average difference of index 1 is: |(2 + 5) / 2 - (3 + 9 + 5 + 3) / 4| = |7 / 2 - 20 / 4| = |3 - 5| = 2.
    - The average difference of index 2 is: |(2 + 5 + 3) / 3 - (9 + 5 + 3) / 3| = |10 / 3 - 17 / 3| = |3 - 5| = 2.
    - The average difference of index 3 is: |(2 + 5 + 3 + 9) / 4 - (5 + 3) / 2| = |19 / 4 - 8 / 2| = |4 - 4| = 0.
    - The average difference of index 4 is: |(2 + 5 + 3 + 9 + 5) / 5 - 3 / 1| = |24 / 5 - 3 / 1| = |4 - 3| = 1.
    - The average difference of index 5 is: |(2 + 5 + 3 + 9 + 5 + 3) / 6 - 0| = |27 / 6 - 0| = |4 - 0| = 4.
    The average difference of index 3 is the minimum average difference so return 3.
    Example 2:
    Input: nums = [0]
    Output: 0
    Explanation:
    The only index is 0 so return 0.
    The average difference of index 0 is: |0 / 1 - 0| = |0 - 0| = 0.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 5, 3, 9, 5, 3};
        int expected = 3;
        var result = solution.minimumAverageDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0};
        int expected = 0;
        var result = solution.minimumAverageDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

}
