package com.blogspot.ostas.leetcode.all.hard.chalkboard_xor_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,2]
    Output: false
    Explanation:
    Alice has two choices: erase 1 or erase 2.
    If she erases 1, the nums array becomes [1, 2]. The bitwise XOR of all the elements of the chalkboard is 1 XOR 2 = 3. Now Bob can remove any element he wants, because Alice will be the one to erase the last element and she will lose.
    If Alice erases 2 first, now nums become [1, 1]. The bitwise XOR of all the elements of the chalkboard is 1 XOR 1 = 0. Alice will lose.
    Example 2:
    Input: nums = [0,1]
    Output: true
    Example 3:
    Input: nums = [1,2,3]
    Output: true
      Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] < 216
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2};
        boolean expected = false;
        var result = solution.xorGame(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1};
        boolean expected = true;
        var result = solution.xorGame(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        boolean expected = true;
        var result = solution.xorGame(nums);
        assertThat(result).isEqualTo(expected);
    }

}
