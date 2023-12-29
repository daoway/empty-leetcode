package com.blogspot.ostas.leetcode.all.easy.number_of_distinct_averages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,1,4,0,3,5]
    Output: 2
    Explanation:
    1. Remove 0 and 5, and the average is (0 + 5) / 2 = 2.5. Now, nums = [4,1,4,3].
    2. Remove 1 and 4. The average is (1 + 4) / 2 = 2.5, and nums = [4,3].
    3. Remove 3 and 4, and the average is (3 + 4) / 2 = 3.5.
    Since there are 2 distinct numbers among 2.5, 2.5, and 3.5, we return 2.
    Example 2:
    Input: nums = [1,100]
    Output: 1
    Explanation:
    There is only one average to be calculated after removing 1 and 100, so we return 1.
      Constraints:
    2 <= nums.length <= 100
    nums.length is even.
    0 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 1, 4, 0, 3, 5};
        int expected = 2;
        var result = solution.distinctAverages(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 100};
        int expected = 1;
        var result = solution.distinctAverages(nums);
        assertThat(result).isEqualTo(expected);
    }

}
