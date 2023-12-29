package com.blogspot.ostas.leetcode.all.hard.sum_of_total_strength_of_wizards;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: strength = [1,3,1,2]
    Output: 44
    Explanation: The following are all the contiguous groups of wizards:
    - [1] from [1,3,1,2] has a total strength of min([1]) * sum([1]) = 1 * 1 = 1
    - [3] from [1,3,1,2] has a total strength of min([3]) * sum([3]) = 3 * 3 = 9
    - [1] from [1,3,1,2] has a total strength of min([1]) * sum([1]) = 1 * 1 = 1
    - [2] from [1,3,1,2] has a total strength of min([2]) * sum([2]) = 2 * 2 = 4
    - [1,3] from [1,3,1,2] has a total strength of min([1,3]) * sum([1,3]) = 1 * 4 = 4
    - [3,1] from [1,3,1,2] has a total strength of min([3,1]) * sum([3,1]) = 1 * 4 = 4
    - [1,2] from [1,3,1,2] has a total strength of min([1,2]) * sum([1,2]) = 1 * 3 = 3
    - [1,3,1] from [1,3,1,2] has a total strength of min([1,3,1]) * sum([1,3,1]) = 1 * 5 = 5
    - [3,1,2] from [1,3,1,2] has a total strength of min([3,1,2]) * sum([3,1,2]) = 1 * 6 = 6
    - [1,3,1,2] from [1,3,1,2] has a total strength of min([1,3,1,2]) * sum([1,3,1,2]) = 1 * 7 = 7
    The sum of all the total strengths is 1 + 9 + 1 + 4 + 4 + 4 + 3 + 5 + 6 + 7 = 44.
    Example 2:
    Input: strength = [5,4,6]
    Output: 213
    Explanation: The following are all the contiguous groups of wizards:
    - [5] from [5,4,6] has a total strength of min([5]) * sum([5]) = 5 * 5 = 25
    - [4] from [5,4,6] has a total strength of min([4]) * sum([4]) = 4 * 4 = 16
    - [6] from [5,4,6] has a total strength of min([6]) * sum([6]) = 6 * 6 = 36
    - [5,4] from [5,4,6] has a total strength of min([5,4]) * sum([5,4]) = 4 * 9 = 36
    - [4,6] from [5,4,6] has a total strength of min([4,6]) * sum([4,6]) = 4 * 10 = 40
    - [5,4,6] from [5,4,6] has a total strength of min([5,4,6]) * sum([5,4,6]) = 4 * 15 = 60
    The sum of all the total strengths is 25 + 16 + 36 + 36 + 40 + 60 = 213.
      Constraints:
    1 <= strength.length <= 105
    1 <= strength[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] strength = new int[]{1, 3, 1, 2};
        int expected = 44;
        var result = solution.totalStrength(strength);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] strength = new int[]{5, 4, 6};
        int expected = 213;
        var result = solution.totalStrength(strength);
        assertThat(result).isEqualTo(expected);
    }

}
