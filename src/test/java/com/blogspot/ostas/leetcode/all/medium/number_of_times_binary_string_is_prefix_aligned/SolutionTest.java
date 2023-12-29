package com.blogspot.ostas.leetcode.all.medium.number_of_times_binary_string_is_prefix_aligned;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: flips = [3,2,4,1,5]
    Output: 2
    Explanation: The binary string is initially "00000".
    After applying step 1: The string becomes "00100", which is not prefix-aligned.
    After applying step 2: The string becomes "01100", which is not prefix-aligned.
    After applying step 3: The string becomes "01110", which is not prefix-aligned.
    After applying step 4: The string becomes "11110", which is prefix-aligned.
    After applying step 5: The string becomes "11111", which is prefix-aligned.
    We can see that the string was prefix-aligned 2 times, so we return 2.
    Example 2:
    Input: flips = [4,1,2,3]
    Output: 1
    Explanation: The binary string is initially "0000".
    After applying step 1: The string becomes "0001", which is not prefix-aligned.
    After applying step 2: The string becomes "1001", which is not prefix-aligned.
    After applying step 3: The string becomes "1101", which is not prefix-aligned.
    After applying step 4: The string becomes "1111", which is prefix-aligned.
    We can see that the string was prefix-aligned 1 time, so we return 1.
      Constraints:
    n == flips.length
    1 <= n <= 5 * 104
    flips is a permutation of the integers in the range [1, n].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] flips = new int[]{3, 2, 4, 1, 5};
        int expected = 2;
        var result = solution.numTimesAllBlue(flips);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] flips = new int[]{4, 1, 2, 3};
        int expected = 1;
        var result = solution.numTimesAllBlue(flips);
        assertThat(result).isEqualTo(expected);
    }

}
