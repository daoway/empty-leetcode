package com.blogspot.ostas.leetcode.all.medium.find_unique_binary_string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  /*
    Example 1:
  Input: nums = ["01","10"]
  Output: "11"
  Explanation: "11" does not appear in nums. "00" would also be correct.
  Example 2:
  Input: nums = ["00","01"]
  Output: "11"
  Explanation: "11" does not appear in nums. "10" would also be correct.
  Example 3:
  Input: nums = ["111","011","001"]
  Output: "101"
  Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.
    Constraints:
  n == nums.length
  1 <= n <= 16
  nums[i].length == n
  nums[i] is either '0' or '1'.
  All the strings of nums are unique.
  */
  @Test
  void example_0() {
    var solution = new Solution();
    String[] nums = new String[] {"01", "10"};
    String expected = "11";
    var result = solution.findDifferentBinaryString(nums);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    String[] nums = new String[] {"00", "01"};
    String expected = "11";
    var result = solution.findDifferentBinaryString(nums);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_2() {
    var solution = new Solution();
    String[] nums = new String[] {"111", "011", "001"};
    String expected = "101";
    var result = solution.findDifferentBinaryString(nums);
    assertThat(result).isEqualTo(expected);
  }

}
