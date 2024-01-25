package com.blogspot.ostas.leetcode.all.hard.triples_with_bitwise_and_equal_to_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,3]
    Output: 12
    Explanation: We could choose the following i, j, k triples:
    (i=0, j=0, k=1) : 2 & 2 & 1
    (i=0, j=1, k=0) : 2 & 1 & 2
    (i=0, j=1, k=1) : 2 & 1 & 1
    (i=0, j=1, k=2) : 2 & 1 & 3
    (i=0, j=2, k=1) : 2 & 3 & 1
    (i=1, j=0, k=0) : 1 & 2 & 2
    (i=1, j=0, k=1) : 1 & 2 & 1
    (i=1, j=0, k=2) : 1 & 2 & 3
    (i=1, j=1, k=0) : 1 & 1 & 2
    (i=1, j=2, k=0) : 1 & 3 & 2
    (i=2, j=0, k=1) : 3 & 2 & 1
    (i=2, j=1, k=0) : 3 & 1 & 2
    Example 2:
    Input: nums = [0,0,0]
    Output: 27
      Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] < 216
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 3};
        int expected = 12;
        var result = solution.countTriplets(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 0};
        int expected = 27;
        var result = solution.countTriplets(nums);
        assertThat(result).isEqualTo(expected);
    }

}
