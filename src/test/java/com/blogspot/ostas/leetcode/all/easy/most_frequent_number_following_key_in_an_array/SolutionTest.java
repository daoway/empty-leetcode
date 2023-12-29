package com.blogspot.ostas.leetcode.all.easy.most_frequent_number_following_key_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,100,200,1,100], key = 1
    Output: 100
    Explanation: For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.
    No other integers follow an occurrence of key, so we return 100.
    Example 2:
    Input: nums = [2,2,2,2,3], key = 2
    Output: 2
    Explanation: For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key.
    For target = 3, there is only one occurrence at index 4 which follows an occurrence of key.
    target = 2 has the maximum number of occurrences following an occurrence of key, so we return 2.
      Constraints:
    2 <= nums.length <= 1000
    1 <= nums[i] <= 1000
    The test cases will be generated such that the answer is unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 100, 200, 1, 100};
        int key = 1;
        int expected = 100;
        var result = solution.mostFrequent(nums, key);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 2, 2, 3};
        int key = 2;
        int expected = 2;
        var result = solution.mostFrequent(nums, key);
        assertThat(result).isEqualTo(expected);
    }

}
