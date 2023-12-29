package com.blogspot.ostas.leetcode.all.medium.largest_divisible_subset;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

  /*
    Example 1:
  Input: nums = [1,2,3]
  Output: [1,2]
  Explanation: [1,3] is also accepted.
  Example 2:
  Input: nums = [1,2,4,8]
  Output: [1,2,4,8]
    Constraints:
  1 <= nums.length <= 1000
  1 <= nums[i] <= 2 * 109
  All the integers in nums are unique.
  */
  @Test
  void example_0() {
    var solution = new Solution();
    int[] nums = new int[] {1, 2, 3};
    List<Integer> expected = List.of(1, 2);
    var result = solution.largestDivisibleSubset(nums);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    int[] nums = new int[] {1, 2, 4, 8};
    List<Integer> expected = List.of(1, 2, 4, 8);
    var result = solution.largestDivisibleSubset(nums);
    assertThat(result).isEqualTo(expected);
  }

}
