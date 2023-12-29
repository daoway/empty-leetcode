package com.blogspot.ostas.leetcode.all.medium.find_all_lonely_numbers_in_the_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [10,6,5,8]
    Output: [10,8]
    Explanation:
    - 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
    - 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
    - 5 is not a lonely number since 6 appears in nums and vice versa.
    Hence, the lonely numbers in nums are [10, 8].
    Note that [8, 10] may also be returned.
    Example 2:
    Input: nums = [1,3,5,3]
    Output: [1,5]
    Explanation:
    - 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
    - 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
    - 3 is not a lonely number since it appears twice.
    Hence, the lonely numbers in nums are [1, 5].
    Note that [5, 1] may also be returned.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{10, 6, 5, 8};
        List<Integer> expected = List.of(10, 8);
        var result = solution.findLonely(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 3};
        List<Integer> expected = List.of(1, 5);
        var result = solution.findLonely(nums);
        assertThat(result).isEqualTo(expected);
    }

}
