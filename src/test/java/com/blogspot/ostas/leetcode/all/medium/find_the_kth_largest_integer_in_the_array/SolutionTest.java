package com.blogspot.ostas.leetcode.all.medium.find_the_kth_largest_integer_in_the_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = ["3","6","7","10"], k = 4
    Output: "3"
    Explanation:
    The numbers in nums sorted in non-decreasing order are ["3","6","7","10"].
    The 4th largest integer in nums is "3".
    Example 2:
    Input: nums = ["2","21","12","1"], k = 3
    Output: "2"
    Explanation:
    The numbers in nums sorted in non-decreasing order are ["1","2","12","21"].
    The 3rd largest integer in nums is "2".
    Example 3:
    Input: nums = ["0","0"], k = 2
    Output: "0"
    Explanation:
    The numbers in nums sorted in non-decreasing order are ["0","0"].
    The 2nd largest integer in nums is "0".
      Constraints:
    1 <= k <= nums.length <= 104
    1 <= nums[i].length <= 100
    nums[i] consists of only digits.
    nums[i] will not have any leading zeros.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] nums = new String[]{"3", "6", "7", "10"};
        int k = 4;
        String expected = "3";
        var result = solution.kthLargestNumber(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] nums = new String[]{"2", "21", "12", "1"};
        int k = 3;
        String expected = "2";
        var result = solution.kthLargestNumber(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] nums = new String[]{"0", "0"};
        int k = 2;
        String expected = "0";
        var result = solution.kthLargestNumber(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
